import java.util.Date;
public class Persona
{
    private String nombre;
    private double dni;
    private Date fechaNacimiento;
    private int edad;
    
    public void setNombrePersona(String unNombre){
        this.nombre = unNombre;
    }
    
    public String getNombrePersona(){
        return nombre;
    }
    
    public void setDn(int unDni){
        this.dni = unDni;
    }
    
    public double getDni(){
        return dni;
    }
    
    public void setFechaNacimiento(Date unaFecha){
        this.fechaNacimiento = unaFecha;
    }
    
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }
    
    public int getEdad(){
        return edad;
    }
}
