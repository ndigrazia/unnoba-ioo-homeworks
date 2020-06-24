import java.util.*;
public class Persona
{
    private String nombre;
    private Date fechaNacimiento;
    private int DNI;
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    public void setDNI(int DNI){
        this.DNI=DNI;
    }
    public String getNombre(){
        return nombre;
    }
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
}
