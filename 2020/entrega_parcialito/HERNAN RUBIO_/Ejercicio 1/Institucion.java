import java.util.List;
import java.util.ArrayList;
public class Institucion
{
    private Localidad localidad;    
    private List<Tecnico>tecnicos = new ArrayList<Tecnico>();
    private List<Resultado>resultados = new ArrayList<Resultado>();
    
    public void setLocalidad(Localidad unaLocalidad){
        localidad = unaLocalidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
}
