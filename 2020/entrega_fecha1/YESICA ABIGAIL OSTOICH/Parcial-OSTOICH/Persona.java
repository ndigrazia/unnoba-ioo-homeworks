import java.util.Date;

public class Persona
{
    private String nombres;
    private String apellidos;
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
    
    public void setDni(int numdocumento){
        dni=numdocumento;
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
