public class Palco {
    private int numeroBoleto;
    private static final double PRECIO = 100.00;

   
    public Palco(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

   
    public String obtenerInformacionBoleto() {
        return "Número: " + numeroBoleto + ", Precio: " + PRECIO + " Bs, Tipo: Palco";
    }

    
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public double getPrecio() {
        return PRECIO;
    }
}