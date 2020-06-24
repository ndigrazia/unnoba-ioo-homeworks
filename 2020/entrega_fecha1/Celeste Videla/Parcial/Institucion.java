import java.util.ArrayList;
import java.util.List;
public class Institucion
{
    private List<Tecnico> tecnicos = new ArrayList<Tecnico>();
    private Localidad localidad;
    private List<Resultado> resultados = new ArrayList<Resultado>();
    
    
    private void setLocalidad(Localidad localidad){this.localidad=localidad;}
    
    private Localidad getLocalidad(){return localidad;}
    
    public void agregarTecnicos(Tecnico t){
        tecnicos.add(t);
    }
    
    public void eliminarTecnicos(Tecnico t){
        tecnicos.remove(t);
    }
    
    public List<Tecnico> getTecnico(){return this.tecnicos;}
    
    public void agregarResultados(Resultado r){
        resultados.add(r);
    }
    
    public void eliminarResultados(Resultado r){
        resultados.remove(r);
    }
    
    public List<Resultado> getResultados(){return this.resultados;}
}
