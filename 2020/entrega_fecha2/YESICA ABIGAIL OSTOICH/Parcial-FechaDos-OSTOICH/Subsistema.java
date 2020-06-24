import java.util.ArrayList;
import java.util.List;

public class Subsistema
{
    private List<CentroDeAislamiento> centros= new ArrayList<CentroDeAislamiento>();

    public Subsistema()
    {
        
    }
    
    public void agregarCentroDeAislamiento(CentroDeAislamiento centro){
        centros.add(centro);
    }
    public void borrarCentroDeAislamiento(CentroDeAislamiento centro){
        centros.remove(centro);
    }
    
    public void agregarNuevaSala(CentroDeAislamiento centro, int capacidad){
        Sala nuevaSala= new Sala(capacidad);
        centro.agregarSala(nuevaSala);
    }
    
    public void agregarPaciente(CentroDeAislamiento centro, Paciente paciente){
        centro.agregarPaciente(paciente);
    }
    
    public int cantidadDeMedicos(){
        int cantidadMedicos=0;
        for(CentroDeAislamiento centro: centros){
            cantidadMedicos+=centro.contarMedicos();
        }
        return cantidadMedicos;
    }
    
    public int totalCentroAislamiento(){
        return centros.size();
    }
    

}
