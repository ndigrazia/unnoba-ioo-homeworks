import java.util.List;
import java.util.ArrayList;
public class Institucion
{
    private Localidad localidad;
    private List<Tecnico>tecnicos = new ArrayList<Tecnico>();
    
    private void setLocalidad(Localidad unaLocalidad){
        this.localidad = unaLocalidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void agregarTecnico(Tecnico unTecnico){
        tecnicos.add(unTecnico);
    }
    
    public void eliminarTecnico(Tecnico unTecnico){
        tecnicos.remove(unTecnico);
    }
}
