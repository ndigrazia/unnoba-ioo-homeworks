import java.util.Vector;

public class Intensivo extends CentroAislamiento
{
    private Vector<Medico> medicos = new Vector<Medico>();
    
    public Intensivo()
    {
    }
    
    public void addMedico(Medico m) {
         medicos.add(m);
    }
    
    public void removeMedico(Medico m) {
         medicos.remove(m);
    }
    
    public int cantidadDeMedicos() {
        return medicos.size();
    }

}
