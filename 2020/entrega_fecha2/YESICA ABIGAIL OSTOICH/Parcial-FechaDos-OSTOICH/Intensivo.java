import java.util.List;
import java.util.ArrayList;
public class Intensivo extends CentroDeAislamiento
{
    private List<Medico> medicos= new ArrayList<Medico>();
    
    public Intensivo()
    {
      
    }
    
    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }
    public void borrarMedico(Medico medico){
        medicos.remove(medico);
    }
    
    public int contarMedicos(){
        return medicos.size();
    }
            
    
    

}
