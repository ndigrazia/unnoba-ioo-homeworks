public class Libro
{
    private String nombre;
    private String isbn;
    private int copias;
    
    //TODO Agregar los atributos que consideren

    public Libro(String isbn, String nombre)
    {
        this(isbn, nombre, 0);
    }

    public Libro(String isbn, String nombre, int copias)
    {
        this.isbn = isbn;
        this.nombre = nombre;
        this.copias = copias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn() {
        return this.isbn;
    }
    
    public void setCopias(int copias) {
        this.copias = copias;
    }
    public int getCopias() {
        return this.copias;
    }
    
    //TODO Agregar getters/setters que consideren

}
