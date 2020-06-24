public class Preventivo extends Centro
{
    private Responsable responsable;
    
    public int cantidadDeMedicos(){
        return 0;
    }
    
    public void setResponsable(Responsable r){
        this.responsable = r;
    }
    public Responsable getResponsable(){
        return responsable;
    }
    
}
