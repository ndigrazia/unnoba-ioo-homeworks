import java.util.Date;

public class Persona
{
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    
    private void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    private String getNombre(){
    return nombre;
    }
    
    private void setApellido(String apellido){
    this.apellido=apellido;
    }
    
    private String getApellido(){
    return apellido;
    }
    
    private void setFechaNacimiento(Date fechaNacimiento){
    this.fechaNacimiento=fechaNacimiento;
    }
    
    private Date getFechaNacimiento(){
    return fechaNacimiento;
    }

}
