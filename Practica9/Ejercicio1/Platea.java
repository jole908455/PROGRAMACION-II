public class Platea extends Boleto {
    private int diasAnticipacion;
    
   
    private static final double PRECIO_ANTICIPADO = 50.00; 
    private static final double PRECIO_REGULAR = 60.00;    

    
    public Platea(int numeroBoleto, int diasAnticipacion) {
        super(numeroBoleto, calcularPrecio(diasAnticipacion));
        this.diasAnticipacion = diasAnticipacion;
    }

    
    private static double calcularPrecio(int diasAnticipacion) {
        return diasAnticipacion >= 10 ? PRECIO_ANTICIPADO : PRECIO_REGULAR;
    }

    
   
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", Tipo: Platea, Días Anticipación: " + diasAnticipacion;
    }

    
    public int getDiasAnticipacion() {
        return diasAnticipacion;
    }
}