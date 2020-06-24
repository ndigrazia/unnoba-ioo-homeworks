import java.util.ArrayList;
import java.util.List;
public class Intensivo extends Centro
{
    private List<Medico> medicos=new ArrayList<Medico>();
    
    public Intensivo(){
    }
    
    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }
    public void eliminarMedico(Medico medico){
        medicos.remove(medico);
    }
    
    public int getCantMedicos(){
        int totalMedicos=0;
        for (Medico m:medicos){
            totalMedicos+=1;
        }
        return totalMedicos;
    }
}
