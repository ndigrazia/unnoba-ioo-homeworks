public class AislamientoPreventivo extends Centro
{
    private Responsable responsable;
    
    public void setResponsable(Responsable responsable){
        this.responsable=responsable;
    }
    
    public Responsable getResponsable(){return responsable;}
    
    public int cantidadMedicos(){return 0;}
}
