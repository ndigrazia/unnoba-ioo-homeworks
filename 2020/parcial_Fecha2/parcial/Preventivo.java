
public class Preventivo extends CentroAislamiento
{   
    private Responsable responsable;
  
    public Preventivo()
    {
    }
    
    public void setResponsable(Responsable r) {
        responsable = r;
    }
    
    public Responsable getResponsable() {
        return responsable;
    }
    
    public int cantidadDeMedicos() {
        return 0;
    }

}
