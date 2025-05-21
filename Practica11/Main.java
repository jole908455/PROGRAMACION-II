public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== Parte a ===");
        Artista artista1 = new Artista("Frida Kahlo", "CI123", 30);
        Artista artista2 = new Artista("Diego Rivera", "CI456", 40);
        Artista artista3 = new Artista("Pablo Picasso", "CI789", 50);

        Anuncio anuncio1 = new Anuncio(1, 5000.0);

        Pintura pinturaConAnuncio = new Pintura(
            "La columna rota", "Óleo", artista1, artista2, anuncio1, "Surrealismo"
        );
        Pintura pinturaSinAnuncio = new Pintura(
            "Guernica", "Lienzo", artista2, artista3, null, "Cubismo"
        );

        System.out.println("Pintura con anuncio creada: " + pinturaConAnuncio.getTitulo());
        System.out.println("Pintura sin anuncio creada: " + pinturaSinAnuncio.getTitulo() + "\n");

     
        System.out.println("=== Parte b ===");
        Artista masExperienciaConAnuncio = (pinturaConAnuncio.getA1().getAñosExperiencia() > pinturaConAnuncio.getA2().getAñosExperiencia()) 
                                        ? pinturaConAnuncio.getA1() : pinturaConAnuncio.getA2();
        Artista masExperienciaSinAnuncio = (pinturaSinAnuncio.getA1().getAñosExperiencia() > pinturaSinAnuncio.getA2().getAñosExperiencia()) 
                                        ? pinturaSinAnuncio.getA1() : pinturaSinAnuncio.getA2();

        Artista artistaGlobal = (masExperienciaConAnuncio.getAñosExperiencia() > masExperienciaSinAnuncio.getAñosExperiencia()) 
                             ? masExperienciaConAnuncio : masExperienciaSinAnuncio;

        System.out.println("Artista más experto en pintura con anuncio: " + masExperienciaConAnuncio.getNombre());
        System.out.println("Artista más experto en pintura sin anuncio: " + masExperienciaSinAnuncio.getNombre());
        System.out.println("--> Artista con más experiencia global: " + artistaGlobal.getNombre() + "\n");

        
        System.out.println("=== Parte c ===");
        Anuncio anuncio2 = new Anuncio(2, 10000.0);
        pinturaSinAnuncio.setAnuncio(anuncio2);
        System.out.println("Se agregó un anuncio a la pintura '" + pinturaSinAnuncio.getTitulo() + "' con precio: $" + anuncio2.getPrecio());

        double totalVenta = pinturaConAnuncio.getAnuncio().getPrecio() + pinturaSinAnuncio.getAnuncio().getPrecio();
        System.out.println("--> Monto total de venta (ambas pinturas): $" + totalVenta);
    }
}