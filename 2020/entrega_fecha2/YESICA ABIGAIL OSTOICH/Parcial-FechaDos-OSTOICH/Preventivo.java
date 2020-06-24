
public class Preventivo extends CentroDeAislamiento
{
   
    private Persona responsable;

    public Preventivo()
    {
       
    }
    
    public void setResponsable(Persona persona){
        responsable=persona;
    }
    public Persona getResponsable(){
        return responsable;
    }
    
    public int contarMedicos(){
        return 0;
    }

}
