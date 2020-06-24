import java.util.ArrayList;
import java.util.List;
public class Malbran
{
    private List<Institucion> instituciones = new ArrayList<Institucion>();
    private List<Resultado> resultados = new ArrayList<Resultado>();
    private Director director;
    
    public void setDirector(Director director){this.director=director;}
    
    public Director getDirector(){return director;}
    
    public void agregarInstituciones(Institucion institucion){
        instituciones.add(institucion);
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
    
    public boolean existeInstitucion(Institucion institucion){
        for (Institucion i: instituciones){
            if (i == institucion){
                return true;
            }
        }
        return false;
    }
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado elResultado= new Resultado();
        elResultado.setTest(test);
        elResultado.setResultadoTest(true);
        if (this.existeInstitucion(institucion) !=true){
            this.agregarResultados(elResultado);}
        
    }
        
    public double tiempoTotalMinutos(){
        double totalMinutos = 0;
        for(Resultado r: resultados){
            totalMinutos+=r.getTest().TiempoTest();}
        return totalMinutos;
    }
    
    public int getTotalSerologicos(){
        int total = 0;
        for(Resultado r: resultados){
            total+=r.getTest().es_Serologico();}
        return total;
    }
}
