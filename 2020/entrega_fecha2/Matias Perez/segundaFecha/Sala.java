import java.util.List;
import java.util.ArrayList;

public class Sala
{ private int capacidadMax;
  private List<Paciente>pacientes = new ArrayList<Paciente>();
  
  public void setCapacidad(int capacidad){
      this.capacidadMax=capacidad;
  }
  
  public int getCapacidad(){
    return capacidadMax;
  }
  
  public void agregarPaciente(Paciente miPaciente){
      pacientes.add(miPaciente);
  }
  
  public void eliminarPaciente(Paciente miPaciente){
    pacientes.remove(miPaciente);
    }
  
  public boolean espacioDisponible(){
     if (pacientes.size()<capacidadMax){
         return true;
    
     }
     return false;
  }
  
 
}
