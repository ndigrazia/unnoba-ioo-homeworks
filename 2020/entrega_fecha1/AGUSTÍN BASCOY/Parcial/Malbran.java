import java.util.List;
import java.util.ArrayList;
public class Malbran
{
    private Director director;
    private List<Institucion>instituciones=new ArrayList<Institucion>();
    private List<Resultado>resultados=new ArrayList<Resultado>();
    
    public void agregarInstitucion(Institucion institucion){
        if (instituciones.contains(institucion)){
        }else{
            instituciones.add(institucion);
        }
       }
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado resultado=new Resultado();
        resultado.setTest(test);
        resultado.setInstitucion(institucion);
        resultados.add(resultado);
        agregarInstitucion(institucion);
    }
    public double tiempoTotalMinutos(){
        double tiempo=0;
        for(Resultado e:resultados){
            tiempo+=e.getTest().tiempoDeTest();
        }
        return tiempo;
    }
  
    public int getTotalSerologicos(){
        int cantidad=0;
        for(Resultado e:resultados){
            if (e.getTest().getMuestra()==null){
            }else{
                cantidad+=1;
            }
        }
        return cantidad;
    }
    }
    
        
        
    
    
    

