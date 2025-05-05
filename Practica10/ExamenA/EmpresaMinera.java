public class EmpresaMinera {
    
    private String nombre;
    private String[] concesiones;
    private double fondosDisponibles;
    private boolean haPagadoMultas;

   
    public EmpresaMinera(String nombre, String[] concesiones, double fondosDisponibles, boolean haPagadoMultas) {
        this.nombre = nombre;
        this.concesiones = concesiones;
        this.fondosDisponibles = fondosDisponibles;
        this.haPagadoMultas = haPagadoMultas;
    }

    
    public void crearFondoCompensacion(double monto) {
        if (monto <= fondosDisponibles) {
            System.out.println("Fondo de $" + monto + " creado por " + this.nombre);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }

    public void detenerOperaciones(String concesion) {
        System.out.println(this.nombre + " detiene operaciones en " + concesion);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}