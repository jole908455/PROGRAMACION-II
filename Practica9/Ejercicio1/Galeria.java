public class Galeria extends Boleto {
    private int diasAnticipacion;
    
    
    private static final double PRECIO_PALCO = 100.00; 
    private static final double DESCUENTO = 0.5;       
    private static final double PRECIO_ANTICIPADO = 25.00; 
    private static final double PRECIO_REGULAR = 30.00;    

    
    public Galeria(int numeroBoleto, int diasAnticipacion) {
        super(numeroBoleto, calcularPrecio(diasAnticipacion));
        this.diasAnticipacion = diasAnticipacion;
    }

  
    private static double calcularPrecio(int diasAnticipacion) {
        return diasAnticipacion >= 10 ? PRECIO_ANTICIPADO : PRECIO_REGULAR;
    }

   
    public String obtenerInformacion() {
        return "Número: " + getNumero() + ", Precio: " + getPrecio();
    }

    
    public int getDiasAnticipacion() {
        return diasAnticipacion;
    }
}