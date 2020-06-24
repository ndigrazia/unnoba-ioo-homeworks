import java.util.Vector;
public class Intensivo extends CentroAislamiento{
    
    private Vector<Medico> medicos = new Vector<Medico>();
    
    public Intensivo(Localidad localidad, String nombre){
        super(localidad, nombre);
    }
    
    public int cantidadDeMedicos(){
        return medicos.size();
    }
    
    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }
    
}