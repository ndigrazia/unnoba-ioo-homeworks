import java.util.*;
public class Paciente extends Persona
{
    private Date fechaIngreso;
    private Localidad localidad;
    private Sala sala;
    
    public void setFechaIngreso(Date fecha){
        this.fechaIngreso = fecha;
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
