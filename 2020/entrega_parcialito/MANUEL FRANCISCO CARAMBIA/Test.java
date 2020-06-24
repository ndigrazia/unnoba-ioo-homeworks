import java.util.Date;
public class Test
{
    private Persona unaPersona;
    private Date fechaInicioTest;
    
    public Test(){
        
    }
    
    public void setUnaPersona(Persona otraPersona){
        this.unaPersona= otraPersona;
    }
    
    public Persona getUnaPersona(){
        return this.unaPersona;
    }
    
    public void setFechaInicioTest(Date inicioTest){
        this.fechaInicioTest=inicioTest;
    }
    
    public Date getFechaInicioTest(){
        return this.fechaInicioTest;
    }
}
