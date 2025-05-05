public class EstudioContaminacion {
    
    private String fechaMuestra;
    private String[] metalesDetectados;
    private double nivelesContaminacion;
    private String comunidadEstudiada;

    
    public EstudioContaminacion(String fechaMuestra, String[] metalesDetectados, double nivelesContaminacion, String comunidadEstudiada) {
        this.fechaMuestra = fechaMuestra;
        this.metalesDetectados = metalesDetectados;
        this.nivelesContaminacion = nivelesContaminacion;
        this.comunidadEstudiada = comunidadEstudiada;
    }

    
    public void generarInformeGobierno() {
        System.out.println("Informe enviado al gobierno: " + this.metalesDetectados.length + " metales detectados en " + this.comunidadEstudiada);
    }

    public boolean compararNiveles(EstudioContaminacion otroEstudio) {
        return this.nivelesContaminacion > otroEstudio.nivelesContaminacion;
    }

    
    public double getNivelesContaminacion() {
        return nivelesContaminacion;
    }

    public void setNivelesContaminacion(double nivelesContaminacion) {
        this.nivelesContaminacion = nivelesContaminacion;
    }

   
}