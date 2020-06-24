import java.util.Date;

public abstract class Test 
{
    private Persona persona;
    private Date fechaDeInicio;
    
    public Test()
    {
        
    }
    
    public void setPersona(Persona persona){
        this.persona=persona;
    }
    public Persona getPersona(){
        return persona;
    }
    
    public void setFechaDeInicio(Date date){
        fechaDeInicio=date;
    }
    public Date getFechaDeInicio(){
        return fechaDeInicio;
    }
    
    public abstract boolean esSerologico();
    
    public abstract double tiempo();
}
