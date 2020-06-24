import java.util.Date;
public class Persona
{
    private String nombre;
    private String apellido;
    private int edad;
    private Date fechaNacimiento;
    
    
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
         return nombre;
    }
    public void setApellido(String ap){
        apellido=ap;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int n){
        edad=n;
    }
    public int getEdad(){
        return edad;
    }
    public void setFechaNacimiento(Date fecha){
        fechaNacimiento=fecha;
    }
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
}
