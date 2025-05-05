public class Indigena {
    
    private String nombre;
    private String comunidad;
    private String[] metalesContaminantes;
    private boolean tieneEnfermedadCronica;

    
    public Indigena(String nombre, String comunidad, String[] metalesContaminantes, boolean tieneEnfermedadCronica) {
        this.nombre = nombre;
        this.comunidad = comunidad;
        this.metalesContaminantes = metalesContaminantes;
        this.tieneEnfermedadCronica = tieneEnfermedadCronica;
    }

  
    public void exigirCompensacion(EmpresaMinera empresa) {
        System.out.println(this.nombre + " exige compensación a " + empresa.getNombre());
    }

    public void realizarDenunciaGobierno() {
        System.out.println("Denuncia presentada por contaminación en " + this.comunidad);
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}