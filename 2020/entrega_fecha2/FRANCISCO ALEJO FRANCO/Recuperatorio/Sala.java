import java.util.ArrayList;
public class Sala
{
   private int capacidadMaxima;
   private ArrayList<Paciente> pacientes=new ArrayList<Paciente>();
   public void setCapacidad(int c){
       capacidadMaxima=c;
    }
   public int getCapacidad(){
       return capacidadMaxima;
    }
   public void addPaciente(Paciente p){
       if(quedaEspacio()==true){
           pacientes.add(p);
        }
    }
   public void removePaciente(Paciente p){
       pacientes.remove(p);
    }
   public boolean quedaEspacio(){
       return pacientes.size()<getCapacidad();
    }
}
