import java.util.Date;
public abstract class Test
{
    private Persona persona;
    private Date fechainicio = new Date();
    public Test(Persona persona,Date fechainicio){
    setPersona(persona);
    setFechaInicio(fechainicio);
    }
    public void setPersona(Persona persona){
    this.persona=persona;
    }
    public void setFechaInicio(Date fechainicio){
    this.fechainicio=fechainicio;
    }
    public Persona getPersona(){
        return persona;
    }
    public Date getFechaInicio(){
    return fechainicio;
    }
    public abstract int getTiempoResultado();
    public abstract boolean isSerologico();
        
}
