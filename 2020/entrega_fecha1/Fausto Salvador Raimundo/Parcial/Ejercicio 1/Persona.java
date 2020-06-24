public class Persona
{
    private int edad;
    private String nombre, dni;
    
    public Persona()
    {        
    }
    
    public void setEdad(int e){
        edad=e;}
    public void setNombre(String n){
        nombre=n;}
    public void setDNI(String dni){
        this.dni=dni;}
    public int getEdad(){return edad;}
    public String getNombre(){return nombre;}
    public String getDNI(){return dni;}
}
