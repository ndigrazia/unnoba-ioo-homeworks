
public class APreventivo extends Centro
{
    private Persona responsable;
    
    public Persona getResponsable(){
        return this.responsable;
    }
    public void setResponsable(Persona p){
        this.responsable = p;
    }
    
    public int contarMedicos(int t){
        return t; //si es un centro preventivo no tiene medicos
    }
}