public class Main {

	public static void main(String[] args) {
        
        String[][] empleadosRoja = {
            {"Pedro", "Rojas", "Luna"},
            {"Lucy", "Sosa", "Rios"},
            {"Ana", "Perez", "Rojas"},
            {"Saul", "Arce", "Calle"}
        };
        int[] edadesRoja = {35, 43, 26, 29};
        double[] sueldosRoja = {2500, 3250, 2700, 2500};
        
        
        String[][] empleadosVerde = {
            {"Juan", "Gomez", "Lopez"},
            {"Maria", "Torres", "Vega"}
        };
        int[] edadesVerde = {40, 28};
        double[] sueldosVerde = {3000, 2800};
        
      
        LineaTeleferico lineaRoja = new LineaTeleferico(
            "Roja", "Central-Cementerio-16 de Julio", 20, 
            empleadosRoja, edadesRoja, sueldosRoja
        );
        
        LineaTeleferico lineaVerde = new LineaTeleferico(
            "Verde", "Sur-Norte", 15,
            empleadosVerde, edadesVerde, sueldosVerde
        );
        
       
        System.out.println("=== Eliminar empleados con apellido 'Rojas' ===");
        lineaRoja.eliminarEmpleadosPorApellido("Rojas");
        
        System.out.println("\n=== Transferir primer empleado ===");
        boolean transferenciaExitosa = lineaRoja.transferirEmpleado(lineaVerde, 0);
        System.out.println("Transferencia: " + (transferenciaExitosa ? "Éxito" : "Falló"));
        
        System.out.println("\n=== Empleados destacados Línea Roja (edad) ===");
        lineaRoja.mostrarEmpleadosDestacados(true);
        
        System.out.println("\n=== Empleados destacados Línea Verde (sueldo) ===");
        lineaVerde.mostrarEmpleadosDestacados(false);
    }
}