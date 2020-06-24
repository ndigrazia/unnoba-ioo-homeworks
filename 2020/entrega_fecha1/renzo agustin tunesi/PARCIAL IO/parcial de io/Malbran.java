-import java.util.List;
import java.util.ArrayList;

public class Malbran{
    private List<Institucion> instituciones = new ArrayList<Institucion>();
    private List<Resultado> resultados = new ArrayList<Resultado>();
    private Director director;
    
    public void setDirector(Director director){
        this.director = director;
    }
    
    public Director getDirector(){
        return director;
    }
    
    public void addInstitucion(Institucion institucion){instituciones.add(institucion);}
    public void removeInstitucion(Institucion institucion){instituciones.remove(institucion);}
    
    public void addResultado(Resultado resultado){resultados.add(resultado);}
    public void removeResultado(Resultado resultado){resultados.remove(resultado);}
    
    public double tiempoTotalMinutos(){
        double t=0.0;
        for (Resultado r: resultados){
            t+=r.tiempoTarda();
        }
        return t/60;
    }
    
    public int getTotalSerologicos(){
        int j= 0;
        for (Resultado r : resultados){
            j+=r.Serologico();
        }
        //COMPILO
        return 0;
    }
    
   
}
