import java.util.Date;
public class Paciente extends Persona
{
    private Date fechaIngreso;
    private Localidad localidad;
    private Sala sala;
    
    public void setFechaIngreso(Date unaFecha){
        this.fechaIngreso = unaFecha;
    }
    
    public Date getFechaIngreso(){
        return fechaIngreso;
    }
    
    public void setLocalidad(Localidad unaLocalidad){
        this.localidad = unaLocalidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void setSala(Sala unaSala){
        this.sala = unaSala;
    }
    
    public Sala getSala(){
        return sala;
    }
}
