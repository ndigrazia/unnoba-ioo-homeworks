import java.util.Date;

public class Paciente extends Persona
{
    private Date fechaDeIngreso;
    private Sala sala;
    private Localidad localidad;
    
    public Paciente()
    {
      
    }
    
    public void setSala(Sala sala){
        this.sala=sala;
    }
    public Sala getSala(){
        return sala;
    }
    
    public void setFechaDeIngreso(Date fecha){
        this.fechaDeIngreso=fecha;
    }
    public Date getFechaDeIngreso(){
        return fechaDeIngreso;
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
}
