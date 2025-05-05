public class LineaTeleferico {
    
    private String color;
    private String tramo;
    private int nroCabinas;
    private int nroEmpleados;
    private final String[][] empleados;
    private final int[] edades;
    private final double[] sueldos;

    
    public LineaTeleferico(String color, String tramo, int nroCabinas, 
                          String[][] empleadosIniciales, int[] edadesIniciales, 
                          double[] sueldosIniciales) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.nroEmpleados = empleadosIniciales.length;
        this.empleados = new String[100][3];
        this.edades = new int[100];
        this.sueldos = new double[100];
        
       
        for (int i = 0; i < this.nroEmpleados; i++) {
            if (empleadosIniciales[i] != null) {
                System.arraycopy(empleadosIniciales[i], 0, this.empleados[i], 0, 
                               Math.min(empleadosIniciales[i].length, 3));
            }
            this.edades[i] = edadesIniciales[i];
            this.sueldos[i] = sueldosIniciales[i];
        }
    }

    
    public void eliminarEmpleadosPorApellido(String apellido) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (empleados[i][1].equals(apellido) || empleados[i][2].equals(apellido)) {
                
                System.arraycopy(empleados, i + 1, empleados, i, nroEmpleados - i - 1);
                System.arraycopy(edades, i + 1, edades, i, nroEmpleados - i - 1);
                System.arraycopy(sueldos, i + 1, sueldos, i, nroEmpleados - i - 1);
                nroEmpleados--;
                i--; 
            }
        }
    }

    
    public boolean transferirEmpleado(LineaTeleferico destino, int indice) {
        if (indice < 0 || indice >= nroEmpleados || destino.nroEmpleados >= 100) {
            return false;
        }
        
       
        System.arraycopy(empleados[indice], 0, destino.empleados[destino.nroEmpleados], 0, 3);
        destino.edades[destino.nroEmpleados] = edades[indice];
        destino.sueldos[destino.nroEmpleados] = sueldos[indice];
        destino.nroEmpleados++;
        
        
        System.arraycopy(empleados, indice + 1, empleados, indice, nroEmpleados - indice - 1);
        System.arraycopy(edades, indice + 1, edades, indice, nroEmpleados - indice - 1);
        System.arraycopy(sueldos, indice + 1, sueldos, indice, nroEmpleados - indice - 1);
        nroEmpleados--;
        
        return true;
    }

    
    public void mostrarEmpleadosDestacados(boolean porEdad) {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        
        int maxEdad = edades[0];
        double maxSueldo = sueldos[0];
        
        for (int i = 1; i < nroEmpleados; i++) {
            if (porEdad) {
                maxEdad = Math.max(maxEdad, edades[i]);
            } else {
                maxSueldo = Math.max(maxSueldo, sueldos[i]);
            }
        }
        
        String criterio = porEdad ? "Edad" : "Sueldo";
        double valor = porEdad ? maxEdad : maxSueldo;
        System.out.printf("Empleados con mayor %s (%.2f):%n", criterio, valor);
        
        for (int i = 0; i < nroEmpleados; i++) {
            if ((porEdad && edades[i] == maxEdad) || (!porEdad && sueldos[i] == maxSueldo)) {
                System.out.printf("- %s %s %s%n", empleados[i][0], empleados[i][1], empleados[i][2]);
            }
        }
    }
}