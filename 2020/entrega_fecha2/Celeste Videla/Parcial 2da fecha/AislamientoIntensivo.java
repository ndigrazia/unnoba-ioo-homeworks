import java.util.*;
public class AislamientoIntensivo extends Centro
{
   private List<Medico>medicos = new ArrayList<Medico>();
   
   public void agregarMedicos(Medico m){medicos.add(m);}
   public void eliminatMedicos(Medico m ){medicos.remove(m);}
   public List<Medico> getMedicos(){return this.medicos;}
   
   public int cantidadMedicos(){
       return medicos.size();
   }
   
}