import java.util.Date;

public abstract class Test
{
    private Persona persona;
    private Date fechaInicio;
    
    public abstract void tiempo(); 
    //Esta como void ya que si pongo que retorne un tiempo, dara error en
    //las clases hijas.
    
    public void setPersona (Persona unaPersona){
        persona = unaPersona;
    }
    
    public Persona getPersona(){
        return persona;
    }
    
    public void setFechaInicio(Date unaFecha){
        fechaInicio = unaFecha;
    }
    
    public Date getFechaInicio(){
        return fechaInicio;
    }
}
