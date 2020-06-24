import java.util.List;
import java.util.ArrayList;
public class Sala
{
    private List<Pacientes> paciente = new ArrayList<Pacientes>();
    private int capacidad;
   
    public void addPacientes(Pacientes pacientes){
        paciente.add(pacientes);}
        
    public void removePacientes(Pacientes pacientes){
        paciente.remove(pacientes);}
    
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
        if(paciente.size() < capacidad) {
            return true;
        }
        return false;
    }
    
    public void agregarPaciente(Pacientes pacientes){
        if(tieneCapacidad()){
            this.paciente.add(pacientes);
        }  
    }
}