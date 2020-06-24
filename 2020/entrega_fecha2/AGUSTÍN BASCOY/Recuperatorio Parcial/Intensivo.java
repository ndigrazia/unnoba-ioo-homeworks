import java.util.List;
import java.util.ArrayList;
public class Intensivo extends Centro
{
    private List<Medico>medicos=new ArrayList<Medico>();
    
    public void addMedico(Medico f){
        medicos.add(f);
    }
    public void removeMedico(Medico r){
         medicos.remove(r);
    }
    public int cantidadMedicos(){
        return medicos.size();

    }
    
    
}
