import java.util.*;
 
public class Malbran
{
    private Director director;
    private List<Institucion> instituciones =new ArrayList<Institucion>();
    private List<Resultado> resultados =new ArrayList<Resultado>();
    
    public Malbran()
    {
        
    }
    
    public Director getDirector(){return this.director;}
    
    public void setDirector(Director director){this.director=director;}
    
    
    public void addInstitucion(Institucion institucion){instituciones.add(institucion);}
    public void removeInstitucion(Institucion institucion){instituciones.remove(institucion);}
    
    public void addResultado(Resultado resultado){resultados.add(resultado);}
    public void removeResultado(Resultado resultado){resultados.remove(resultado);}

    public double tiempoTotalMinutos(){
        double t=0.0;
        for(Resultado r: resultados){
            t+=r.tiempoTarda();
            
        }
        return t/60;
    }
 
    
    
    public int getTotalSerologicos(){
        int total =0;
        for (Resultado r: resultados){
            total+=r.sereologico();
        }
         return total;
        
    }
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado r=new Resultado();
        r.setTest(test);
        r.setInstitucion(institucion);
        r.setValorResultado(true);
        r.setFecha(feche);
        
        
        
    }
    
    
    
}
