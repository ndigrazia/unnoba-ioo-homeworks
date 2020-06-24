import java.util.List;
import java.util.ArrayList;
public class Sala
{
    private int capacidadMaxima;
    private List<Paciente>pacientes=new ArrayList<Paciente>();
    
    public void setCapacidadMaxima(int n){
        capacidadMaxima=n;
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    public void addPaciente(Paciente f){
        pacientes.add(f);
    }
    public void removePaciente(Paciente r){
        pacientes.remove(r);
    }
    public boolean agregarPaciente(Paciente f){
        if(salaLlena()==false){
            pacientes.add(f);
            return true;
        }
        return false;
    }
    
 
    public boolean salaLlena(){
        return pacientes.size()<capacidadMaxima;
    }
    


    
    
}
