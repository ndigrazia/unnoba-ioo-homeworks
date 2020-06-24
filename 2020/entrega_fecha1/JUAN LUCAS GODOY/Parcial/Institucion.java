import java.util.List;
import java.util.ArrayList;

public class Institucion{
    
    private Localidad localidad;
    private List<Tecnico> tecnicos = new ArrayList<Tecnico>();
    private List<Resultado> resultados = new ArrayList<Resultado>();
    
    public Institucion(Localidad localidad){
    }
    
    public void agregarTecnico(Tecnico nuevoTecnico){
        tecnicos.add(nuevoTecnico);
    }
    
    public void agregarResultado(Resultado nuevoResultado){
        resultados.add(nuevoResultado);        
    }
    
    public List<Resultado> getResultados(){
        return resultados;
    }
}
