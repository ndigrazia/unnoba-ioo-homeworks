import java.util.Date;
public class Persona
{
    private String nombre;
    private int edad;
    private Date fechaNacimiento;
    private int dni;
    private String domicilio;
    
    public void setFechaNacimiento(Date fecha){
        fechaNacimiento=fecha;
    }
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public int getDni(){
        return dni;
    }
    public void setDomicilio(String dom){
        domicilio=dom;
    }
    public String getDomicilio(){
        return domicilio;
    }
    
}
