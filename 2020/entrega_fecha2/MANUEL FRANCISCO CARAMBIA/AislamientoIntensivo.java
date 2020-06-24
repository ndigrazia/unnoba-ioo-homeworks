import java.util.Vector;
public class AislamientoIntensivo extends Centro

{
    private Vector<Medico> medicos = new Vector<Medico>();
    
    public AislamientoIntensivo(){
    
    }
    
    public Vector<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(Vector<Medico> medicos) {
        this.medicos = medicos;
    }
/* Retorna la suma de los médicos de todos los centros*/
    public int cantidadDeMedicos(){
        int i=0;
        while(i<medicos.size()){
            i++;   
        }
        return i;
    }
    
}
