import java.util.List;
import java.util.ArrayList;

public class Subsistema
{
    private List<Centro>centros = new ArrayList<Centro>();
    
    public void agregarCentro(Centro unCentro){
        centros.add(unCentro);
    }
    
    public void eliminarCentro(Centro unCentro){
        centros.remove(unCentro);
    }
    
    public void agregarNuevaSala(Centro centro, int capacidad){
        Sala sala = new Sala();
        sala.setCapacidadMaxima(capacidad);
        centro.agregarSalas(sala);
    }
    
    public void agregarPaciente(Centro centro, Paciente paciente){
        centro.agregarPaciente(paciente);
    }
    
    public int cantidadDeMedicos(){
        int total = 0;
        for (Centro c : centros){
            total += c.cantidadMedicos();
        }
        return total;
    }
    
    public int totalCentroAislamiento(){
        return centros.size();
    }
}
