import java.util.Date;
public class Paciente extends Persona
{
    private Date fechadeingreso;
    private Localidad localidad;
    private Sala sala;
    
    public Paciente(){
    }
    
    public void setFechaDeIngreso(Date fechadeingreso){
        this.fechadeingreso=fechadeingreso;
    }
    public Date getFechaDeIngreso(){
        return fechadeingreso;
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void setSala(Sala sala){
        this.sala=sala;
    }
    public Sala getSala(){
        return sala;
    }
}
