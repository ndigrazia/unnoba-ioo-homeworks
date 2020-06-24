import java.util.Date;
public abstract class Test
{
    private Persona persona;
    private Date fechaInicioTest;
    
    public void setPersona(Persona unaPersona){
        this.persona = unaPersona;
    }
    
    public Persona getPersona(){
        return persona;
    }
    
    public void setFechaInicioTest(Date unaFecha){
        this.fechaInicioTest = unaFecha;
    }
    
    public Date getFechaInicioTest(){
        return fechaInicioTest;
    }
  
    
    public abstract int tiempoTest();
    
}
