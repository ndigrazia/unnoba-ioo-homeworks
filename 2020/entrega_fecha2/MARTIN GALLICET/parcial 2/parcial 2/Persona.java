import java.util.Date;
public class Persona{
    private String nombre;
    private String direccion;
    private Date fechaNacimiento;
    

    public Persona()
    {
    }

    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
       
}