import java.util.List;
import java.util.ArrayList;

public class Subsistema {
    
    private List<CentroDeAislamiento> centrosDeAislamiento = new ArrayList<CentroDeAislamiento>();
    
    public Subsistema(){       
    }
    
    public boolean centroAgregado(CentroDeAislamiento unCentro){
        for (CentroDeAislamiento centro : centrosDeAislamiento){
            if (centro == unCentro){
                return true;
            }
        }
        return false;
    }
    
    public void agregarNuevaSala(CentroDeAislamiento centro, int capacidad){
        nuevoCentro(centro);
        Sala nuevaSala = new Sala(capacidad);
        centro.nuevaSala(nuevaSala);
    }
    
    public boolean agregarPaciente(CentroDeAislamiento centro, Paciente paciente){
        nuevoCentro(centro);
        if(centro.nuevoPaciente(paciente)){
            return true;
        }
        return false;
    }
    
    public int cantidadDeMedicos(){
        int cantidad = 0;
        for (CentroDeAislamiento centro : centrosDeAislamiento){
            cantidad += centro.cantidadMedicos();
        }
        return cantidad;
    }
    
    public int totalCentroAislamiento(){
        int cantidad = 0;
        for (CentroDeAislamiento centro : centrosDeAislamiento){
            cantidad ++;
        }
        return cantidad;
    }
    
    public boolean nuevoCentro(CentroDeAislamiento centro){
        if (centroAgregado(centro) == false){
            centrosDeAislamiento.add(centro);
            return true;
        }
        return false;
    }
}