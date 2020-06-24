import java.util.Vector;
public class Subsistema{
    private Vector<CentroAislamiento> centrosDeAislamientos = new Vector<CentroAislamiento>();

    
    public void agregarNuevaSala(CentroAislamiento centroAislamiento, int capacidad){
        Sala sala = new Sala(capacidad);
        centroAislamiento.agregarSala(sala);
    }
    
    public void agregarPaciente(CentroAislamiento centroAislamiento, Paciente paciente){
        for (CentroAislamiento centro: centrosDeAislamientos){
            if (!centro.agregarPaciente(paciente)){
                continue;
            }
        }
    }
    
    public int cantidadDeMedicos(){
        int total = 0;
        for(CentroAislamiento centro: centrosDeAislamientos){
            total += centro.cantidadDeMedicos();
        }
        return total;
    }

    public int totalCentroAislamiento(){
        return centrosDeAislamientos.size();
    }
    
    public void agregarCentroAislamiento(CentroAislamiento centro){
        centrosDeAislamientos.add(centro);
    }

}