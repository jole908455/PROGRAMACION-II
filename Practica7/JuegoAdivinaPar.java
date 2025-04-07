public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) {
            System.out.println("Número no válido. Debe estar entre 0 y 10.");
            return false;
        }
        if (num % 2 != 0) {
            System.out.println("Error: Debes ingresar un número PAR.");
            return false;
        }
        return true;
    }

   
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = random.nextInt(6) * 2; 
        System.out.println("Adivina un número PAR entre 0 y 10:");
        super.juega();
    }
}