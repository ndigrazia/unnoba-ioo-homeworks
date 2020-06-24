import java.util.ArrayList;
import java.util.List;
public class AislamientoPreventivo extends Centro
{
   private Persona responsable;
   
   public void setResponsable(Persona unaPersona){
       this.responsable = unaPersona;    
   }
   
   public Persona getResponsable(){
        return responsable;
   }
   
   public int cantidadMedicos(){
       return 0; 
   }
}
