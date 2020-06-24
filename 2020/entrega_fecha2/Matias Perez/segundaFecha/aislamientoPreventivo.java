public class aislamientoPreventivo extends centroDeAislamiento
{
   private Responsable miResponsable;
   
   public void setResponsable(Responsable miResponsable){
     this.miResponsable=miResponsable;
      }
    
   public Responsable getResponsable(){
    return miResponsable;
    }
   
   public  int cantidadMedicos(){
    return 0;
    }
}
