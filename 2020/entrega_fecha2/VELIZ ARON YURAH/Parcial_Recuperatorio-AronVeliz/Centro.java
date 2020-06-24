import java.util.ArrayList;
import java.util.List;
public abstract class Centro
{
    private String nombre;
    private Localidad localidad;
    private List<Sala> salas=new ArrayList<Sala>();
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void agregarSala(Sala sala){
        salas.add(sala);
    }
    public void eliminarSala(Sala sala){
        salas.remove(sala);
    }
    
    public abstract int getCantMedicos();
    
    public void agregarPaciente(Paciente paciente){
        for (Sala s:salas){
            if (s.hayEspacio()){
                s.agregarPaciente(paciente);
                break;
            }
        }
    }
}
