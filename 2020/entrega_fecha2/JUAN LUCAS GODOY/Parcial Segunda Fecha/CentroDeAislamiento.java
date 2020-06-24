import java.util.List;
import java.util.ArrayList;

public abstract class CentroDeAislamiento {

    private String nombre;
    private Localidad localidad;
    private List<Sala> salas = new ArrayList<Sala>();
        
    public CentroDeAislamiento(String nombre, Localidad localidad){
        this.nombre = nombre;
        this.localidad = localidad;
    }
        
    public void nuevaSala(Sala sala){
        salas.add(sala);
    }
        
    public boolean nuevoPaciente(Paciente paciente){
        for (Sala sala : salas){
            if (sala.capacidadDisponible() > 0){
                sala.nuevoPaciente(paciente);
                paciente.setSala(sala);
                return true;
            }
        }
        return false;
    }
        
    public int cantidadSalas(){
        int cantidad = 0;
        for (Sala sala : salas){
            cantidad ++;
        }
        return cantidad;
    }
        
    abstract public int cantidadMedicos();
}
