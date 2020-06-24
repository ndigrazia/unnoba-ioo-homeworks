public class Preventivo extends Centro
{
   private Persona responsable;
   public void setResponsable(Persona p){
       responsable=p;
    }
   public Persona getResponsable(){
       return responsable;
    }
   public int sumaMedicos(){
       return 0;
    }
    
}
