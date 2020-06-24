import java.util.List;
import java.util.ArrayList;
public class Subsistema
{
    private List<Centro> centros=new ArrayList<Centro>();
    
    public Subsistema(){
    }
    
    public void agregarCentro(Centro centro){
        centros.add(centro);
    }
    public void eliminarCentro(Centro centro){
        centros.remove(centro);
    }
    
    public void agregarNuevaSala(Centro centro, int capacidad){
        Sala nuevaSala = new Sala(capacidad);
        centro.agregarSala(nuevaSala);
    }
    
    public void agregarPaciente(Centro centro, Paciente paciente){
        centro.agregarPaciente(paciente);
    }
    
    public int cantidadDeMedicos(){
        int totalMedicos=0;
        for(Centro c:centros){
            totalMedicos+=c.getCantMedicos();
        }
        return totalMedicos;
    }
    
    public int totalCentroAislamiento(){
        int totalCentros=0;
        for(Centro c:centros){
            totalCentros+=1;
        }
        return totalCentros;
    }
}
