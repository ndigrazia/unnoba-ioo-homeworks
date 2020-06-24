import java.util.Vector;

public class Subsistema
{
    private Vector<Centro> centros = new Vector<Centro>();
    
    public void agregarCentro(Centro centro){
        centros.add(centro);
    }
    
    public void eliminarCentro(Centro centro){
        centros.remove(centro);
    }
    
    public void agregarNuevaSala(Centro centro, int capacidad){
        centro.agregarSala(capacidad);
    }
    
    public void agregarPaciente(Centro centro, Paciente paciente){
        centro.agregarPaciente(paciente);
    }
    
    public int cantidadDeMedicos(){
        int suma = 0;
        for (Centro c : centros){
            suma += c.cantidadDeMedicos();
        }
        return suma;
    }
    
    public int totalCentroAislamiento(){
        return centros.size();
    }
}
