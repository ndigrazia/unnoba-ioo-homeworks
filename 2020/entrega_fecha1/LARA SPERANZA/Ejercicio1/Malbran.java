import java.util.List;
import java.util.ArrayList;
public class Malbran
{
    private List<Resultado> resultados=new ArrayList<Resultado>();
    private List<Institucion> instituciones=new ArrayList<Institucion>();
    private Director director;
    
    public Malbran(){}
    
    public void agregarInstitucion(Institucion institucion){
        if(instituciones.contains(institucion)==false){instituciones.add(institucion);}
    }
    public void eliminarInstitucion(Institucion i){instituciones.remove(i);}
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado resultado=new Resultado();
        resultado.setTest(test);
        resultado.setInstitucion(institucion);
        resultados.add(resultado);
        agregarInstitucion(institucion);
    }
    public void eliminarResultado(Resultado r){resultados.remove(r);}
    
    public double tiempoTotalMinutos(){
        double tiempoTotal=0;
        for(Resultado resultado: resultados){
            tiempoTotal+=resultado.getTiempoDelTest();
        }
        return tiempoTotal;
    }
    
    public int getTotalSerologicos(){
        int total=0;
        for(Resultado resultado: resultados){
            if(resultado.getTiempoDelTest()==15){total+=1;}
        }
        return total;
    }
    
    private void setDirector(Director d){director=d;}
    private Director getDirector(){return director;}
}
