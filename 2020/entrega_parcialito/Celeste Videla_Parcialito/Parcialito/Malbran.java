import java.util.ArrayList;
import java.util.List;
public class Malbran
{
    private List<Institucion> instituciones = new ArrayList<Institucion>();
    private List<Resultado> resultados = new ArrayList<Resultado>();
    private Director director;
    
    public void setDirector(Director director){this.director=director;}
    public Director getDirector(){return director;}
    
    public void agregarInstituciones(Institucion i){
        instituciones.add(i);
    }
    
    public void eliminarInstituciones(Institucion i){
        instituciones.remove(i);
    }
    
    public List<Institucion> getInstitucion(){return this.instituciones;}
    
    public void agregarResultados(Resultado r){
        resultados.add(r);
    }
    
    public void eliminarResultados(Resultado r){
        resultados.remove(r);
    }
    
    public List<Resultado> getResultados(){return this.resultados;}
    
}
