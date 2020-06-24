public class Persona
{
    private String nombre, dni;
    private int edad;
    
    public void setNombre(String miNombre){
        this.nombre = miNombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setDni(String miDni){
        this.dni = miDni;
    }
    public String getDni(){
        return dni;
    }
    
    public void setEdad(int miEdad){
        this.edad = miEdad;
    }
    public int getEdad(){
        return edad;
    }
}
