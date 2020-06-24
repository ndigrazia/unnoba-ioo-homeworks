import java.util.Vector;
public class Sala{
    private Vector<Paciente> pacientes = new Vector<Paciente>();
    private int capacidadMaxima;

    public Sala(int capacidad){
        setCapacidadMaxima(capacidad);
    }

    public boolean agregarPaciente(Paciente paciente){
        if (pacientes.size() < capacidadMaxima){
            pacientes.add(paciente);
            return true;
        }
        return false;
    }
    
    public void setCapacidadMaxima(int capacidad){
        this.capacidadMaxima = capacidad;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
}