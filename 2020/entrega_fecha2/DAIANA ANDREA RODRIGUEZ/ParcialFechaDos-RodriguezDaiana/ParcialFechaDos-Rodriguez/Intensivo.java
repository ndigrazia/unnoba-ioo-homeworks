import java.util.Vector;

public class Intensivo extends Centro
{
    private Vector<Medico> medicos = new Vector<Medico>();
    
    public int cantidadDeMedicos(){
        return medicos.size();
    }
    
    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }
    public void eliminarMedico(Medico medico){
        medicos.remove(medico);
    }
    
}
