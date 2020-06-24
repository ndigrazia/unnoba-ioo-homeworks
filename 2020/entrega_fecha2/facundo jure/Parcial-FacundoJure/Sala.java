
import java.util.List;
import java.util.ArrayList;

public class Sala
{
    private List<Pacientes> pacientes = new ArrayList<Pacientes>();
    private int capacidad;
    
    public void addPacientes(Pacientes paciente){
        pacientes.add(paciente);
    }
    
    public void removePacientes(Pacientes paciente){
        pacientes.remove(paciente);
    }
    
    public Sala(int capacidad){
        super();
        this.capacidad = capacidad;
    }
    
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
    public boolean tieneCapacidad(){
        if(pacientes.size() < capacidad) {
            return true;
        }
        return false;
    }
    
    public void agregarPaciente(Pacientes paciente){
        if(tieneCapacidad()){
            this.pacientes.add(paciente);
        }  
    }
}
