import java.util.ArrayList;
import java.util.List;
public class Sala
{
    private int capacidadMaxima;
    private List<Paciente> pacientes=new ArrayList<Paciente>();
    
    public Sala(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public void agregarPaciente(Paciente paciente){
        paciente.setSala(this);
        pacientes.add(paciente);
    }
    public void eliminarPaciente(Paciente paciente){
        pacientes.remove(paciente);
    }
    
    public boolean hayEspacio(){
        int totalPacientes=0;
        for (Paciente p:pacientes){
            totalPacientes+=1;
        }
        if(totalPacientes<capacidadMaxima){
            return true;
        }
        else{
            return false;
        }
    }
}
