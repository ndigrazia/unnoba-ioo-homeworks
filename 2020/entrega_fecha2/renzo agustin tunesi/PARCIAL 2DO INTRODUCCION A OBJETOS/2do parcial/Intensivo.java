import java.util.List;
import java.util.ArrayList;

public class Intensivo extends CentroDeAislamiento
{
    private List<Medicos> medico = new ArrayList<Medicos>();
    
    public void addMedicos(Medicos medicos){
        medico.add(medicos);}
        
    public void removeMedicos(Medicos medicos){
        medico.remove(medicos);}
    
     public int cantidadMedicos(){
        return medico.size();
    }
}
