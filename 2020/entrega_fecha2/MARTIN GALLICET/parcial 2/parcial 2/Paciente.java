import java.util.Date;
public class Paciente extends Persona{
    
    private Sala sala;
    private Localidad localidad;
    private Date fechaIngreso;
    
    public Paciente()
    {
    }
    
    
    public void setFechaIngreso(Date fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaIngreso(){
        return fechaIngreso;
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad = localidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void setSala(Sala sala){
        this.sala = sala;
    }
    
    public Sala getSala(){
        return sala;
    }
   
}