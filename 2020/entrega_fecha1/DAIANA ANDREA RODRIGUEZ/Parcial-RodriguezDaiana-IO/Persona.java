public class Persona
{
    private String nombre, apellido;
    private int edad;
    
    public void setNombre(String miNombre){
        this.nombre = miNombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String miApellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    
    public void setEdad(int miEdad){
        this.edad = miEdad;
    }
    public int getEdad(){
        return edad;
    }
}
