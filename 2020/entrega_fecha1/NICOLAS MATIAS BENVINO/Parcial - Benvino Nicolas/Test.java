
import java.util.Date;
public abstract class Test{
    private Persona persona;
    private Date fecha;
    
    public Test(Persona persona, Date fecha){
        setPersona(persona);
        setFecha(fecha);
    }
    
    public abstract int tiempoDeTesteo();
    public abstract int esSerologico();
    
    public void setPersona(Persona persona){this.persona = persona;}
    public void setFecha(Date fecha){this.fecha = fecha;}
    
    public Persona getPersona(){return this.persona;}
    public Date getFecha(){return this.fecha;}
}