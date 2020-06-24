import java.util.List;
import java.util.ArrayList;

public class Sala
{
    private List<Paciente> pacientes= new ArrayList<Paciente>();
    private int capacidadMaxima;
    
    
    public Sala()
    {
    }
    public Sala(int capacidad){
        capacidadMaxima=capacidad;
    }
    
    public void agregarPaciente(Paciente paciente){
        pacientes.add(paciente);
    }
    public void borrarPaciente(Paciente paciente){
        pacientes.remove(paciente);
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public boolean hayEspacio(Paciente paciente){
        if (pacientes.size()<capacidadMaxima){
             agregarPaciente(paciente); 
             return true;
            }
        return false;
    }

}
