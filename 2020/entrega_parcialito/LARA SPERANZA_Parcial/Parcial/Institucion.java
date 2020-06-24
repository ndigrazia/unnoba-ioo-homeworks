import java.util.List;
import java.util.ArrayList;
public class Institucion
{
    private Localidad localidad;
    private List<Tecnico>tecnicos=new ArrayList<Tecnico>();
    private List<Resultado>resultados=new ArrayList<Resultado>();
    
    private void setLocalidad(Localidad l){localidad=l;}
    private Localidad getLocalidad(){return localidad;}
}
