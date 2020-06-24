import java.util.Date;

public class Persona
{
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaNacimiento;
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido(String unApellido){
        apellido = unApellido;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setEdad(int unaEdad){
        edad = unaEdad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setFechaNacimiento(Date unaFecha){
        fechaNacimiento = unaFecha;
    }
    
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
}
