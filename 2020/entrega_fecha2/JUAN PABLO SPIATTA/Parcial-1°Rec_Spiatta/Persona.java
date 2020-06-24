public abstract class Persona
{
    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    
    public Persona(String nombre, String apellido, int edad, long dni)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getApellido()
    {
        return apellido;
    }
    
    public int getEdad()
    {
        return edad;
    }
    
    public long getDni()
    {
        return dni;
    }
}
