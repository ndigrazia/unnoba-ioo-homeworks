import java.util.List;
import java.util.ArrayList;

public class Sala {

    private int capacidadMaxima;
    private int capacidadDisponible;
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    
    public Sala(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
        capacidadDisponible = capacidadMaxima;
    }
    
    public int capacidadDisponible(){
        return this.capacidadDisponible;
    }
    
    public void nuevoPaciente(Paciente paciente){
        pacientes.add(paciente);
        capacidadDisponible --;
    }
}
