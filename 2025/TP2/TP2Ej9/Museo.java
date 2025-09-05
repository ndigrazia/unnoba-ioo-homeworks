public class Museo {
    private String nombre;
    private String direccion;
    private String ciudad;
    private Persona director; // relación con Persona

    public Museo(String nombre, String direccion, String ciudad, Persona director) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.director = director;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public Persona getDirector() { return director; }
    public void setDirector(Persona director) { this.director = director; }
}
