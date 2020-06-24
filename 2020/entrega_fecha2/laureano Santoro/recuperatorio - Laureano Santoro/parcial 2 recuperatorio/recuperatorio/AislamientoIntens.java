import java.util.Vector;

public class AislamientoIntens extends Centro
{
   private Medicos medico;
   
   private Vector<Medicos> medicos = new Vector<Medicos>();
    
    public void agregarMedicos(Medicos Med){
        
     medicos.add(Med);
    
    }
    public void eliminarMedicos(Medicos Med){
       
        medicos.remove(Med);
    }
    public Vector<Medicos>getMedicos(){
    
        return this.medicos;
    }
    
    public int cantidadDeMedicos(){
       
        return medicos.size();
    }
}
