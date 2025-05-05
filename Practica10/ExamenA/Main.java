public class Main {
    public static void main(String[] args) {
        
        String[] concesiones = {"Potosí", "Oruro"};
        EmpresaMinera mineraSanCristobal = new EmpresaMinera(
            "Minera San Cristóbal", 
            concesiones, 
            5000000, 
            false
        );
        String[] metalesIndigena = {"plomo", "arsénico"};
        Indigena linoMilluni = new Indigena(
            "Lino Milluni", 
            "Norte Amazónico de La Paz", 
            metalesIndigena, 
            true
        );

        
        String[] metalesEstudio = {"mercurio", "plomo"};
        EstudioContaminacion estudio1 = new EstudioContaminacion(
            "21/03/2025", 
            metalesEstudio, 
            250.5, 
            "Lago Poopó"
        );

       
        linoMilluni.exigirCompensacion(mineraSanCristobal);
        mineraSanCristobal.crearFondoCompensacion(1000000);
        estudio1.generarInformeGobierno();

        
        EstudioContaminacion estudio2 = new EstudioContaminacion(
            "22/03/2025", 
            new String[]{"arsénico"}, 
            180.0, 
            "Potosí"
        );
        System.out.println("¿Estudio 1 tiene mayor contaminación? " + estudio1.compararNiveles(estudio2));
    }
}