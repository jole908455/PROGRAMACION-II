import java.util.Random;

public class ProgramaPrueba {
    public static void main(String[] args) {
       
        Figura[] figuras = new Figura[5];
        Random random = new Random();

       
        for (int i = 0; i < figuras.length; i++) {
            int tipoFigura = random.nextInt(2) + 1; 
            String color = "Color" + (i + 1); 
            double tamaño = random.nextDouble() * 10 + 1; 

            if (tipoFigura == 1) {
                figuras[i] = new Cuadrado(color, tamaño); 
            } else {
                figuras[i] = new Circulo(color, tamaño); 
            }
        }

       
        for (Figura figura : figuras) {
            System.out.println("----------------------");
            System.out.println(figura.toString());
            System.out.println("Área: " + figura.area());
            System.out.println("Perímetro: " + figura.perimetro());
            
            if (figura instanceof Coloreado) {
                System.out.println(((Coloreado) figura).comoColorear());
            }
        }
    }
}