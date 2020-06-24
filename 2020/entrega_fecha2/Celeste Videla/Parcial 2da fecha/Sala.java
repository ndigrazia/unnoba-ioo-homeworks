import java.util.*;
public class Sala
{
    private int capacidad;
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    
    public void agregarPacientes(Paciente p){pacientes.add(p);}
    public void eliminatPacientes(Paciente p ){pacientes.remove(p);}
    public List<Paciente> getPacientes(){return this.pacientes;}
    
    public void setCapacidad(int capacidad){this.capacidad=capacidad;}
    public int getCapacidad(){return capacidad;}
    
    public boolean puedoAgregarPaciente(Paciente p){
        if(pacientes.size()<capacidad){
            this.agregarPacientes(p);
            return true;}
        return false;
    }
    
}
