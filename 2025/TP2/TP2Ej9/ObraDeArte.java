public class ObraDeArte {
    private String titulo;
    private Persona autor; // relación con Persona
    private int anioCreacion;
    private String tipo; // pintura, escultura, etc.

    public ObraDeArte(String titulo, Persona autor, int anioCreacion, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioCreacion = anioCreacion;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public Persona getAutor() { return autor; }
    public void setAutor(Persona autor) { this.autor = autor; }

    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}
