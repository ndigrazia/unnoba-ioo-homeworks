import java.util.Date;
public abstract class Test
{
    private Persona persona;
    private Date fechaInicio;
    
    public abstract Muestra getMuestra();
    
    public abstract int tiempoDeTest();
    public void setPersona(Persona persona){
        this.persona=persona;
    }
    public Persona getPersona(){
        return persona;
    }
    
   
}
