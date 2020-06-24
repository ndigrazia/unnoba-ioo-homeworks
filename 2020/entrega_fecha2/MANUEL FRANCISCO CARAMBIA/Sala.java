import java.util.Vector;
public class Sala
{
    private Vector<Paciente> pacientes= new Vector<Paciente>();
    private int capacidadMaxima;
    
    
    public Sala(){
    
    }
    
    public Vector<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Vector<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    
    public void setCapacidadMaxima(){
        this.capacidadMaxima=capacidadMaxima;
    }
   

}
