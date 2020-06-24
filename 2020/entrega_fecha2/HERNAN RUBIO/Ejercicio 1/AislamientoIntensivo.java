import java.util.List;
import java.util.ArrayList;

public class AislamientoIntensivo extends Centro
{
    private List<Medico>medicos = new ArrayList<Medico>();
    
    public void agregarMedicos(Medico unMedico){
        medicos.add(unMedico);
    }
    
    public void eliminarMedico(Medico unMedico){
        medicos.remove(unMedico);
    }
    
    public List<Medico> getMedicos(){
        return medicos;
    }
    
    public int cantidadMedicos(){
        return medicos.size();
    }
}
