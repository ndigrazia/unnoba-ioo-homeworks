public class Localidad
{
    private String nombre;
    
    public Localidad(String nombre)
    {
        setLocalidad(nombre);
    }
    public void setLocalidad(String nombre)
    {
        this.nombre=nombre;
    }
    public String getLocalidad(){return nombre;}
}
