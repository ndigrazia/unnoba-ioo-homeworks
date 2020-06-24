
import java.util.Date;

public abstract class Test{
    private Persona persona;
    private Date fechaInicio;
    
    public Test(Persona persona, Date fechaInicio){
        setPersona(persona);
        setFechaInicio(fechaInicio);
    }
    
    public abstract float calcularTiempo();
    
    public void setPersona(Persona persona){this.persona = persona;}
    public void setFechaInicio(Date fechaInicio){this.fechaInicio = fechaInicio;}
    
    public Persona getPersona(){return this.persona;}
    public Date getFechaInicio(){return this.fechaInicio;}
}