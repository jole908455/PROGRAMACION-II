public class Juego {
    
    protected int numeroDeVidas;
    private int record;

    
    public void reiniciaPartida() {
        this.numeroDeVidas = 3; 
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}
