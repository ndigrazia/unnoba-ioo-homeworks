
import java.util.List;
import java.util.ArrayList;

public class Institucion{
    private List<Tecnico> tecnicos = new ArrayList<Tecnico>();
    private List<Resultado> resultados = new ArrayList<Resultado>();
    private Localidad localidad;
    
    public Institucion(Localidad localidad){
        setLocalidad(localidad);
    }
    
    public void addTecnico(Tecnico tecnico){
        getTecnicos().add(tecnico);
    }
    public void removeTecnico(Tecnico tecnico){
        getTecnicos().remove(tecnico);
    }
    
    public void addResultado(Resultado resultado){
        getResultados().add(resultado);
    }
    public void removeResultado(Resultado resultado){
        getResultados().remove(resultado);
    }
    
    public void setLocalidad(Localidad localidad){this.localidad = localidad;}
    
    public List<Tecnico> getTecnicos(){return this.tecnicos;}
    public List<Resultado> getResultados(){return this.resultados;}
    public Localidad getLocalidad(){return this.localidad;}
}