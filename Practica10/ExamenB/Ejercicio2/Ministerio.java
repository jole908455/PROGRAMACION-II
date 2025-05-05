import java.util.Arrays;

public class Ministerio {
    
    private String nombre;
    private String direccion;
    private int nroEmpleados;
    private String[][] empleados;  
    private int[] edades;         
    private double[] sueldos;      

    
    public Ministerio(String nombre, String direccion, int nroEmpleados, 
                     String[][] empleados, int[] edades, double[] sueldos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nroEmpleados = nroEmpleados;
        this.empleados = new String[3][100];
        this.edades = new int[100];
        this.sueldos = new double[100];
        
       
        for (int i = 0; i < nroEmpleados; i++) {
            this.empleados[0][i] = empleados[0][i];
            this.empleados[1][i] = empleados[1][i]; 
            this.empleados[2][i] = empleados[2][i]; 
            this.edades[i] = edades[i];
            this.sueldos[i] = sueldos[i];
        }
    }

    
    public void eliminarEmpleadosPorEdad(int edad) {
        for (int i = 0; i < nroEmpleados; i++) {
            if (edades[i] == edad) {
                
                for (int j = i; j < nroEmpleados - 1; j++) {
                    empleados[0][j] = empleados[0][j+1];
                    empleados[1][j] = empleados[1][j+1];
                    empleados[2][j] = empleados[2][j+1];
                    edades[j] = edades[j+1];
                    sueldos[j] = sueldos[j+1];
                }
                nroEmpleados--;
                i--; 
            }
        }
    }

    
    public void transferirEmpleado(Ministerio destino, int indice) {
        if (indice < 0 || indice >= nroEmpleados || destino.nroEmpleados >= 100) {
            System.out.println("Error: Índice inválido o ministerio lleno");
            return;
        }
        
        
        destino.empleados[0][destino.nroEmpleados] = empleados[0][indice];
        destino.empleados[1][destino.nroEmpleados] = empleados[1][indice];
        destino.empleados[2][destino.nroEmpleados] = empleados[2][indice];
        destino.edades[destino.nroEmpleados] = edades[indice];
        destino.sueldos[destino.nroEmpleados] = sueldos[indice];
        destino.nroEmpleados++;
        
       
        for (int i = indice; i < nroEmpleados - 1; i++) {
            empleados[0][i] = empleados[0][i+1];
            empleados[1][i] = empleados[1][i+1];
            empleados[2][i] = empleados[2][i+1];
            edades[i] = edades[i+1];
            sueldos[i] = sueldos[i+1];
        }
        nroEmpleados--;
    }

   
    public void mostrarEmpleadosDestacados(boolean porEdad) {
        if (nroEmpleados == 0) {
            System.out.println("No hay empleados");
            return;
        }
        
        int valor = porEdad ? edades[0] : (int)sueldos[0];
        for (int i = 1; i < nroEmpleados; i++) {
            if (porEdad) {
                valor = Math.min(valor, edades[i]);
            } else {
                valor = (int)Math.min(valor, sueldos[i]);
            }
        }
        
        System.out.println(porEdad ? "Empleados más jóvenes (" + valor + " años):" 
                                 : "Empleados con menor sueldo ($" + valor + "):");
        for (int i = 0; i < nroEmpleados; i++) {
            if ((porEdad && edades[i] == valor) || (!porEdad && sueldos[i] == valor)) {
                System.out.println(empleados[0][i] + " " + empleados[1][i] + " " + empleados[2][i]);
            }
        }
    }
}