import java.util.Date;

public abstract class Persona
{
    private String nombrePersona;
    private int edad;
    private Date fechaNacimiento;
    
    public void setNomrePersona(String unNombre){
        this.nombrePersona = unNombre;
    }
    
    public String getNombrePersona(){
        return nombrePersona;

    }
    
    public void setEdad(int unaEdad){
        this.edad = unaEdad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setFechaNacimiento(Date unaFecha){
        this.fechaNacimiento = unaFecha;
    }
    
    public Date getFechaNacimienti(){
        return fechaNacimiento;
    }
}
