import java.util.List;
import java.util.ArrayList;
public class Subsistema
{
    private List<Centro> centros=new ArrayList<Centro>();
    
    
    public void addCentro(Centro c){
        centros.add(c);
    }
    public void removeCentro(Centro c){
        centros.remove(c);
    }
    public void agregarPaciente(Centro centro,Paciente paciente){
        centro.agregarPaciente(paciente);
    }
    
    public int cantidadDeMedicos(){
        int n=0;
        for (Centro f:centros){
            n+=f.cantidadMedicos();
        }
        return n;
    }
     public void agregarNuevaSala(Centro centro, int capacidad){
         Sala n=new Sala();
        n.setCapacidadMaxima(capacidad);
        centro.addSala(n);
    }
    public int totalCentroAislamiento(){
        int n=0;
        for(Centro f:centros){
            n+=1;
        }
        return n;
    }
    
    
    
            
            
}
