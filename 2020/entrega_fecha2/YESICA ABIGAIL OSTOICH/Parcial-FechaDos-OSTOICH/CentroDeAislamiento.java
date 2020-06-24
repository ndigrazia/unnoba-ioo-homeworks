import java.util.List;
import java.util.ArrayList;

public abstract class CentroDeAislamiento
{
    private String nombreCentro;
    private Localidad localidadDelCentro;
    private List<Sala> salas= new ArrayList<Sala>();
    
    public CentroDeAislamiento()
    {
      
    }
    
    public void agregarSala(Sala sala){
        salas.add(sala);
    }
    
    public void borrarSala(Sala sala){
        salas.remove(sala);
    } 
    
    public void setNombreDelCentro(String nombre){
        nombreCentro=nombre;
    }
    public String getNombreDelCentro(){
        return nombreCentro;
    }
    
    public void setLocalidadDelCentro(Localidad localidad){
        localidadDelCentro=localidad;
    }
    public Localidad getLocalidadDelCentro(){
        return localidadDelCentro;
    }
    
    public void agregarPaciente(Paciente paciente){
        
        for (Sala s: salas){
            if (s.hayEspacio(paciente)){
                break;
            }
        }
    }
    
    public abstract int contarMedicos();
    
    
    

}
