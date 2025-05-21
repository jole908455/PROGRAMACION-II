
public class Obra {
    protected String titulo;
    private String material;
    private Artista a1;
    private Artista a2;
    private Anuncio b;

    public Obra(String titulo, String material, Artista a1, Artista a2, Anuncio b) {
        this.titulo = titulo;
        this.material = material;
        this.a1 = a1;
        this.a2 = a2;
        this.b = b;
    }

  
    public Artista getA1() { return a1; }
    public Artista getA2() { return a2; }
    public Anuncio getAnuncio() { return b; }
    public void setAnuncio(Anuncio b) { this.b = b; } 
}