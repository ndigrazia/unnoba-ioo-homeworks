import java.util.Date;

public class Persona
{
    private String nombre;
    private int dni;
    private Date fechaNacimiento;
    
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setDni(int d){
        this.dni = d;
    }
    public int getDni(){
        return dni;
    }
    
    public void setFechaNacimiento(Date f){
        this.fechaNacimiento = f;
    }
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
}
