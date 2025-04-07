public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }

    
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) {
            System.out.println("Número no válido. Debe estar entre 0 y 10.");
            return false;
        }
        if (num % 2 == 0) {
            System.out.println("Error: Debes ingresar un número IMPAR.");
            return false;
        }
        return true;
    }

  
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = random.nextInt(5) * 2 + 1; 
        System.out.println("Adivina un número IMPAR entre 0 y 10:");
        super.juega();
    }
}

