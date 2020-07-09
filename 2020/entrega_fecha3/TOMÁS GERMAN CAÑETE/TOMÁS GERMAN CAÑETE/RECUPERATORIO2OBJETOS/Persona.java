
public class Persona
{
    private String nombre;
    private String localidad;
    private int edad;
   
    public Persona(String nombre, int edad, String localidad)
    {
        setNombre(nombre);
        
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    public void setLocalidad(String localidad)
    {
        this.localidad=localidad;
    }
    public String getNombre(){ return this.nombre;}
    public String getLocalidad(){ return this.localidad;}
    public int getEdad(){ return this.edad;}
}
