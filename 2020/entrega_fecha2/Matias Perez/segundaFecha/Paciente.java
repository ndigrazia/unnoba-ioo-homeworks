import java.util.Date;
public class Paciente extends Persona
{
   
   private Date fechaIngreso;
   private Localidad miLocalidad;
   private Sala miSala;
   
   
    
  
   private void setLocalidad(Localidad miLocalidad){
     this.miLocalidad=miLocalidad;
      }
    
    private Localidad getLocalidad(){
    return miLocalidad;
    }
    
    private void setfechaIngreso(Date fechaIngreso){
    this.fechaIngreso=fechaIngreso;
    }
    
    private Date getfechaIngreso(){
    return fechaIngreso;
    }
    
    private void setSala(Sala miSala){
        this.miSala=miSala;}
    
    private Sala getSala(){
        return miSala;}
   
    
   
  
    
    
}
