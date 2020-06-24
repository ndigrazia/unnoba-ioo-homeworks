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
    
    public abstract void tiempoCalculo();
}
