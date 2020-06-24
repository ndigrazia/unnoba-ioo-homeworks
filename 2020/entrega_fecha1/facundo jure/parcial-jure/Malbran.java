
import java.util.ArrayList;
public class Malbran
{
    private ArrayList<Resultado> resultados=new ArrayList <Resultado>();
    private Director director;
    private ArrayList<Institucion> instituciones=new ArrayList<Institucion>();
    
    public void agregarInstitucion(Institucion institucion) {
        instituciones.add(institucion);
    }
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        //COMPILO
      // resultados.add(new Resultado(test.agregarResultado(true), institucion));
    }
    
    
    public double tiempoTotalMinutos(){
        double sumador = 0.0; 
        for (Resultado r: resultados){
               
            //COMPILO
            //sumador = sumador + r.test.tiempoTarda();
            return sumador;
        }
        //COMPILO
        return 0;
    }
    
    public int getTotalSerologicos(){
        for (Resultado r: resultados){
            int contador = 0;
            contador = contador + 1;
          //  return contador;
        }
        
        //COMPILO
        return 0;
    
    }
}
