public class Persona
{
    private String nombre;
    private String direccion;
    private double dni;
    private int telefono;
    
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setDireccion(String d){
        direccion=d;
    }
    public String getDireccion(){
        return direccion;
    }
    
    public void setDni(double d){
        dni=d;
    }
    public double getDni(){
        return dni;
    }
    
    public void setTelefono(int t){
        telefono=t;
    }
    public int getTelefono(){
        return telefono;
    }
}
