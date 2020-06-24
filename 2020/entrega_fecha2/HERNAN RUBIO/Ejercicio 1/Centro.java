import java.util.ArrayList;
import java.util.List;
public abstract class Centro
{
    private String nombre;
    private Localidad localidad;
    private List<Sala>salas = new ArrayList<Sala>();
    
    public abstract int cantidadMedicos();
    
    public void setNombreCentro(String unNombre){
        this.nombre = unNombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setLocalidad(Localidad unaLocalidad){
        this.localidad = unaLocalidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void agregarSalas(Sala unaSala){
        salas.add(unaSala);
    }
    
    public void eliminarSala(Sala unaSala){
        salas.remove(unaSala);
    }
    
    public List<Sala> getSalas(){
        return salas;
    }
    
    public void agregarPaciente(Paciente paciente){
        for(Sala s : salas){
            if (s.agregarPaciente(paciente)){
                break;
            }
        }
    }
}
