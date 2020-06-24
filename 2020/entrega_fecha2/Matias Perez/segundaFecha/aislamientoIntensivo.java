import java.util.List;
import java.util.ArrayList;

public class aislamientoIntensivo extends centroDeAislamiento
{
    private List<Medico>medicos = new ArrayList<Medico>();
    
    public void agregarMedicos(Medico m){
    medicos.add(m);
    }
    public void eliminarMedicos(Medico m){
        medicos.remove(m);
    }
    public List<Medico>getMedicos(){
    return this.medicos;
    }
    
    public int cantidadMedicos(){
        return medicos.size();
    }
    
}
