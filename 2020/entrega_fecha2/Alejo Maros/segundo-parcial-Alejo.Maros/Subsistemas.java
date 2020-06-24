import java.util.List;
import java.util.ArrayList;
public class Subsistemas
{
    private List<CentroAislamiento> centroaislamientos = new ArrayList<CentroAislamiento>();
    
    public void addCentroAislamiento(CentroAislamiento centroaislamiento){
        centroaislamientos.add(centroaislamiento);
    }
    
    public void removeCentroAislamiento(CentroAislamiento centroaislamiento){
        centroaislamientos.remove(centroaislamiento);
    }
    
    public void agregarNuevaSala(CentroAislamiento centro, int capacidad) {
        for(CentroAislamiento c : centroaislamientos) {
            if(c == centro) {
                c.agregarSala(capacidad);
            }
        }
    }
    
    public void agregaPaciente(CentroAislamiento centro, Pacientes paciente){
        for(CentroAislamiento c : centroaislamientos){
            if(c == centro){
                c.agregarPaciente(paciente);
            }
        }
    }
    
    public int cantidadDeMedicos(){
        int total = 0;
        for(CentroAislamiento c : centroaislamientos){
            total += c.cantidadMedicos();
        }
        
        return total;
    }
    
    public int totalCentroAislamiento(){
        return centroaislamientos.size();
    }
}
    