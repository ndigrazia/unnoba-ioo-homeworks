import java.util.Vector;

public class Salas
{
    private int capacidadMaxima;
    private Vector<Pacientes> pacientes = new Vector<Pacientes>();
    
    public void setCapacidadMaxima(int capacidadMaxima){
     this.capacidadMaxima= capacidadMaxima;
       }
       
    public void agregarPaciente(Pacientes paciente){
        
        pacientes.add(paciente);
    }
    
    public boolean espacio(){
        
        if (pacientes.size()< capacidadMaxima){
            return true;
        }
        return false;
    }
    public boolean estaLLena(){
    if (pacientes.size()==capacidadMaxima){
        return true;
    }
    return false;
}
   
  
    
}
