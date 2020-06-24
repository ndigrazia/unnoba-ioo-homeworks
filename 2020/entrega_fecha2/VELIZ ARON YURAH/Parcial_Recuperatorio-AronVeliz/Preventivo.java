public class Preventivo extends Centro
{
    private Persona responsable;
    
    public Preventivo(){
    }
    
    public void setResponsable(Persona responsable){
        this.responsable=responsable;
    }
    public Persona getResponsable(){
        return responsable;
    }
    
    public int getCantMedicos(){
        return 0;
    }
}
