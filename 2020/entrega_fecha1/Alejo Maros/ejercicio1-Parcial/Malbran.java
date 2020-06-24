
import java.util.List;
import java.util.ArrayList;

public class Malbran
{
   private List<Resultado> resultados = new ArrayList<Resultado>();
   private  Director director;
   private List<Institucion> instituciones = new ArrayList<Institucion>();
   
    public Malbran()
    {
     }
    
    public Director getDirector(){
        return this.director;
    }
    
    public void setDirector(Director director){
        this.director=director;
    }
    
    
    public void addInstitucion(Institucion institucion){
        instituciones.add(institucion);
    }
    public void removeInstitucion(Institucion institucion){
        instituciones.remove(institucion);
    }
    
    public void addResultado(Resultado resultado){
        resultados.add(resultado);
    }
    public void removeResultado(Resultado resultado){
        resultados.remove(resultado);
    }
    public void agregarResultadoPositivo(Test test, Institucion institucion)
    {
        double t=0.0;
        for(Resultado r: resultados){
            t+=r.tiempoTarda();
            
        }
        
        //return  t / 60;
    }
    
   
    public int getTotalSerologicos(){
        int total =0;
        for (Resultado r: resultados){
            total+=r.sereologico();
        }
         return total;
        
    }
    
    
}