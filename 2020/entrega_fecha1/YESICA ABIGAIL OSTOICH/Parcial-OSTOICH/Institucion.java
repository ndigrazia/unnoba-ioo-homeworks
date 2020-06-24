import java.util.ArrayList;
import java.util.List;

public class Institucion
{
    private Localidad localidad;
    private List<Resultado> resultados= new ArrayList<Resultado>();
    private List<Tecnico> tecnicos= new ArrayList<Tecnico>();

    public Institucion()
    {

    }
    
    public void agregarResultado(Resultado resultado){
        resultados.add(resultado);
    }
    public void quitarResultado(Resultado resultado){
        resultados.remove(resultado);
    }
    
    public void agregarTecnico(Tecnico tecnico){
        tecnicos.add(tecnico);
    }
    public void quitarTecnico(Tecnico tecnico){
        tecnicos.remove(tecnico);
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
}
