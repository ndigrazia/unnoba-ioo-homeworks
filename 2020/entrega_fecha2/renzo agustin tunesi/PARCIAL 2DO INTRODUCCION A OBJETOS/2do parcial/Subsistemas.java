import java.util.List;
import java.util.ArrayList;

public class Subsistemas
{
    private List<CentroDeAislamiento> centrodeaislamientos = new ArrayList<CentroDeAislamiento>();
    
    public void addCentroDeAislamiento(CentroDeAislamiento centrodeaislamiento){
        centrodeaislamientos.add(centrodeaislamiento);}
        
    public void removeCentroDeAislamiento(CentroDeAislamiento centrodeaislamiento){
        centrodeaislamientos.remove(centrodeaislamiento);}
    
    public void agregarNuevaSala(CentroDeAislamiento centro, int capacidad) {
        for(CentroDeAislamiento c : centrodeaislamientos) {
            if(c == centro) {
                c.agregarSala(capacidad);
            }
        }
    }
    
    public void agregaPaciente(CentroDeAislamiento centro, Pacientes paciente){
        for(CentroDeAislamiento c : centrodeaislamientos){
            if(c == centro){
                c.agregarPaciente(paciente);
            }
        }
    }
    
    public int cantidadDeMedicos(){
        int total = 0;
        for(CentroDeAislamiento c : centrodeaislamientos){
            total += c.cantidadMedicos();
        }
        
        return total;
    }
    
    public int totalCentroAislamiento(){
        return centrodeaislamientos.size();
    }
        
    
   
}
