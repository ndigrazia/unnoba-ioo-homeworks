import java.util.Date;
public class Paciente extends Persona
{
   private Date fechaIngreso;
   private Localidad localidad;
   private Sala unaSala;
   
   public Paciente(){
    
   }
   
   public Date getFechaIngreso(){
       return fechaIngreso;
   }
   
   public void setFechaIngreso (Date fechaIngreso){
       this.fechaIngreso=fechaIngreso;
   }
   
   public Localidad getLocalidad(){
       return localidad;
   }
   
   public void setLocalidad (Localidad localidad){
       this.localidad=localidad;
   }
   
   public Sala getUnaSala(){
       return unaSala;
   }
   
   public void setUnaSala (Sala unaSala){
       this.unaSala=unaSala;
   }
   

}
