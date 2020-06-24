
import java.util.Date;

public class Persona{
    private String nombre;
    private Date fechaNacimiento;
    private long DNI;
    
    public Persona(String nombre, Date fechaNacimiento, long DNI){
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setDNI(DNI);
    }
    
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setFechaNacimiento(Date fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}
    public void setDNI(long DNI){this.DNI = DNI;}
    
    public String getNombre(){return this.nombre;}
    public Date getFechaNacimiento(){return this.fechaNacimiento;}
    public long getDNI(){return this.DNI;}
}