import java.util.Date;
public class Pacientes extends Persona
{
    private Date fechaIngreso;
    private Localidad localidad;
    private Sala salas;
    
    
    public void setfechaIngreso(Date fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    
    public Date getfechaIngreso(){
        return fechaIngreso;
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad = localidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void setSala(Sala salas){
        this.salas = salas;
    }
    
    public Sala getSala(){
        return salas;
    }

   
}