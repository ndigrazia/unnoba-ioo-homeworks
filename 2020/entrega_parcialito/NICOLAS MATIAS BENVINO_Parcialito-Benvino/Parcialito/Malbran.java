
import java.util.List;
import java.util.ArrayList;

public class Malbran{
    private List<Resultado> resultados = new ArrayList<Resultado>();
    private List<Institucion> instituciones = new ArrayList<Institucion>();
    private Director director;
    
    public Malbran(Director director){
        setDirector(director);
    }
    
    public void addResultado(Resultado resultado){
        getResultados().add(resultado);
    }
    public void removeResultado(Resultado resultado){
        getResultados().remove(resultado);
    }
    
    public void addInstitucion(Institucion institucion){
        getInstituciones().add(institucion);
    }
    public void removeInstitucion(Institucion institucion){
        getInstituciones().remove(institucion);
    }
    
    public void setDirector(Director director){this.director = director;}
    
    public List<Resultado> getResultados(){return this.resultados;}
    public List<Institucion> getInstituciones(){return this.instituciones;}
    public Director getDirector(){return this.director;}
}