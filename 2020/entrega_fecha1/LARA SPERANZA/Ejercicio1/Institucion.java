import java.util.List;
import java.util.ArrayList;
public class Institucion
{
    private Localidad localidad;
    private List<Tecnico> tecnicos=new ArrayList<Tecnico>();
    private List<Resultado> resultados=new ArrayList<Resultado>();
    
    public Institucion(){}
    
    public void agregarTecnico(Tecnico t){tecnicos.add(t);}
    public void eliminarTecnico(Tecnico t){tecnicos.remove(t);}
    
    public void agregarResultado(Resultado r){resultados.add(r);}
    public void eliminarResultado(Resultado r){resultados.remove(r);}
    
    private void setLocalidad(Localidad l){localidad=l;}
    private Localidad getLocalidad(){return localidad;}
}
