import java.util.ArrayList;
public class Intensivo extends Centro
{
   private ArrayList<Medico> medicos=new ArrayList<Medico>();
   public void addMedico(Medico m){
       medicos.add(m);
    }
   public void removeMedico(Medico m){
       medicos.remove(m);
    }
   public int sumaMedicos(){
       return medicos.size();
    }
}
