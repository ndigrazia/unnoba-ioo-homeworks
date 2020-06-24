import java.util.List;
import java.util.ArrayList;
public class AIntensivo extends Centro
{
    private List<Medico> medicos = new ArrayList<Medico>();
    
    public void agregarMedico(Medico m){
        medicos.add(m);
    }
    public void borrarMedico(Medico m){
        medicos.remove(m);
    }
    
    public int contarMedicos(){
        return medicos.size(); //cantidad de medicos de este centro
    }
    public int contarMedicos(int t){
        return t + contarMedicos(); //devuelvo el parametro + la cantidad de medicos de este centro
    }
}

