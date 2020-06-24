import java.util.ArrayList;
import java.util.List;
public class Sala
{
    private int capacidadMaxima;
    private List<Paciente>pacientes = new ArrayList<Paciente>();
    
    public void setCapacidadMaxima(int unaCapacidad){
        this.capacidadMaxima = unaCapacidad;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public boolean agregarPaciente(Paciente unPaciente){
        if(salaLlena() == false){
            pacientes.add(unPaciente);
            return true;
        }
        else{
            System.out.println("Sala llena.");
            return false;
        }
    }
    
    public void eliminarPaciente(Paciente unPaciente){
        pacientes.remove(unPaciente);
    }
    
    public boolean salaLlena(){
        return pacientes.size() < capacidadMaxima;
    }
}
