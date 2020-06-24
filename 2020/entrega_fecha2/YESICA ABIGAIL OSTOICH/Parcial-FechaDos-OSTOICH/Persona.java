import java.util.Date;

public class Persona
{
    private String nombres;
    private String apellidos;
    private String direccion;
    private int dni;
    private Date fechaDeNacimiento;
    
    public Persona()
    {
        
    }
    
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public String getNombres(){
        return nombres;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    
    public void setDni(int dni){
        this.dni=dni;
    }
    public int getDni(){
        return dni;
    }
    
    public void setFechaDeNacimiento(Date fecha){
        fechaDeNacimiento=fecha;
    }
    public Date getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    

}
