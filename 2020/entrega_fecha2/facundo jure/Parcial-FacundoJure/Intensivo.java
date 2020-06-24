
import java.util.List;
import java.util.ArrayList;
public class Intensivo extends CentroAislamiento
{
    private List<Medico> medico = new ArrayList<Medico>();

     public void addMedico(Medico medicos){
       medico.add(medicos);
    }
    
    public void removeMedico(Medico medicos){
        medico.remove(medicos);
    }
    
    public int cantidadMedicos(){
        return medico.size();
    }
}
