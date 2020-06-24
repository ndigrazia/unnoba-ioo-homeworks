
import java.util.Date;
public class Persona{
    private String nombre;
    private String direccion;
    private Date fechaNacimiento;
    
    public Persona(String nombre, String direccion, Date fechaNacimiento){
        setNombre(nombre);
        setDireccion(direccion);
        setFechaNacimiento(fechaNacimiento);
    }

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void setFechaNacimiento(Date fechaNacimiento){this.fechaNacimiento = fechaNacimiento;}

    public String getNombre(){return this.nombre;}
    public String getDireccion(){return this.direccion;}
    public Date getFechaNacimiento(){return this.fechaNacimiento;}
}