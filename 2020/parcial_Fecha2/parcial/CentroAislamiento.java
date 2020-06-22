import java.util.Vector;

public abstract class CentroAislamiento
{
    private String nombre;
    private Localidad localidad;
    
    private Vector<Sala> salas = new Vector<Sala>();
    
    public CentroAislamiento()
    {
    }

    public void setNombre(String n) {
        nombre = n;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setLocalidad(Localidad l) {
        localidad = l;
    }
    
    public Localidad getLocalidad() {
        return localidad;
    }
    
    public void addSala(Sala s) {
         salas.add(s);
    }
    
    public void removeSala(Sala s) {
         salas.remove(s);
    }
    
    public void addPaciente(Paciente p) {
        for(Sala s:salas) {
            if(s.addPaciente(p)) {
                break;
            }
        }
    }
    
    public void addSalasLlenas(Vector<Sala> salasLLenas) {
        for(Sala s:salas) {
           s.addSalaLLena(salasLLenas);         
        } 
    }
    
    public abstract int cantidadDeMedicos();
    
}
