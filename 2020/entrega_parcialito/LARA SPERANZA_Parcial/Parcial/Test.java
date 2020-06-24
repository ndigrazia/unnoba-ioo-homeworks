import java.util.Date;
public abstract class Test
{
    private Persona persona;
    private Date fechaInicio;
    private float tiempo;
    
    public abstract void calcularTiempo();
    public float getTiempo(){return tiempo;}
    
    public void setPersona(Persona p){persona=p;}
    public Persona getPersona(){return persona;}
    
    public void setFechaInicio(Date f){fechaInicio=f;}
    public Date getFechaInicio(){return fechaInicio;}
    
}
