public class Preventivo extends Centro
{
    private Persona responsable;
    
    public void setResponsable(Persona resp){
        responsable=resp;
    }
    public Persona getResponsable(){
         return responsable;
    }
    public int cantidadMedicos(){
        return 0;
    }
    
}
