public class Pintura extends Obra {
    private String genero;

    public Pintura(String titulo, String material, Artista a1, Artista a2, Anuncio b, String genero) {
        super(titulo, material, a1, a2, b);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

	public String getTitulo() {
	
		return titulo;
	}
}
