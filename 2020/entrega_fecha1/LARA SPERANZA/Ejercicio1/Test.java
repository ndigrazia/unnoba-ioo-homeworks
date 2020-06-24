import java.util.Date;
public abstract class Test
{   private Persona persona;
    private Date fechaDeInicio;
    
    public abstract int getTiempoEnMinutos();
    
    public void setPersona(Persona p){persona=p;}
    public Persona getPersona(){return persona;}
    
    public void setFechaDeInicio(Date f){fechaDeInicio=f;}
    public Date getFechaDeInicio(){return fechaDeInicio;}
}
