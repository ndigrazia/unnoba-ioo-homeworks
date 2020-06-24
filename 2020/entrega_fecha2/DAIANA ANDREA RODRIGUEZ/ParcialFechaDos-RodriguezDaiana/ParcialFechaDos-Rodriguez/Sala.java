import java.util.Vector;

public class Sala
{
    private int capMax;
    private Vector<Paciente> pacientes = new Vector<Paciente>();
    
    public void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    public void eliminarPaciente(Paciente paciente){
        pacientes.remove(paciente);
    }
    
    public boolean espacioDisponible(){
        if(pacientes.size() < capMax){
            return true;
        }
        return false;
    }
    
    public void setCapMax(int c){
        this.capMax = c;
    }
    public int getCapMax(){
        return capMax;
    }
}
