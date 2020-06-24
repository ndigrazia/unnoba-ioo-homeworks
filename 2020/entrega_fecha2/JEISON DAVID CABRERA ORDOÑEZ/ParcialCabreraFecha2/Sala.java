import java.util.*;
public class Sala
{
    private int capacidadMaxima;
    private Vector<Paciente> vectorPacientes = new Vector<Paciente>();
    
    public void agregarPaciente(Paciente miPaciente){
        vectorPacientes.add(miPaciente);
    }
    public boolean espacioDisponible(){
       if (vectorPacientes.size()< capacidadMaxima){
           return true;
       }
       return false;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
}
