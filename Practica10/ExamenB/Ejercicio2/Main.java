public class Main {

       public static void main(String[] args) {
	        
	        String[][] empleadosMin1 = {
	            {"Pedro", "Lucy", "Ana", "Saul"},
	            {"Rojas", "Sosa", "Perez", "Arce"},
	            {"Luna", "Rios", "Rojas", "Calle"}
	        };
	        int[] edadesMin1 = {35, 43, 26, 29};
	        double[] sueldosMin1 = {2500, 3250, 2700, 2500};
	        Ministerio minEducacion = new Ministerio(
	            "Educación", "Av. Arce #123", 4, empleadosMin1, edadesMin1, sueldosMin1
	        );

	        String[][] empleadosMin2 = {
	            {"Juan", "Maria"},
	            {"Gomez", "Torres"},
	            {"Lopez", "Vega"}
	        };
	        int[] edadesMin2 = {40, 28};
	        double[] sueldosMin2 = {3000, 2800};
	        Ministerio minSalud = new Ministerio(
	            "Salud", "Calle Ballivián #456", 2, empleadosMin2, edadesMin2, sueldosMin2
	        );

	      
	        System.out.println("=== Eliminar empleados (edad=26) ===");
	        minEducacion.eliminarEmpleadosPorEdad(26);

	       
	        System.out.println("\n=== Transferir empleado ===");
	        minSalud.transferirEmpleado(minEducacion, 0);

	      
	        System.out.println("\n=== Empleados más jóvenes ===");
	        minEducacion.mostrarEmpleadosDestacados(true);

	        System.out.println("\n=== Empleados con menor sueldo ===");
	        minSalud.mostrarEmpleadosDestacados(false);
	    }
}