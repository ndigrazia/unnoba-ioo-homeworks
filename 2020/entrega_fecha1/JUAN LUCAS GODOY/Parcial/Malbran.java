import java.util.List;
import java.util.ArrayList;

public class Malbran{
    
    private List<Resultado> resultados = new ArrayList<Resultado>();
    private List<Institucion> instituciones = new ArrayList<Institucion>();
    private Director director;
    
    public Malbran(Director director){
        this.director = director;
    }
    
    public int tiempoTotalMinutos(){
        int total = 0;
        for (Resultado resultado : resultados){
            total += resultado.getTest().getTiempo();
        }
        return total;
    }
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado nuevoResultado = new Resultado(test);
        nuevoResultado.resultadoPositivo();
        nuevoResultado.agregarInstitucion(institucion);
        institucion.agregarResultado(nuevoResultado);
        agregarInstitucion(institucion);      
    }
    
    public void agregarResultado(Resultado nuevoResultado){
        resultados.add(nuevoResultado);
    }
    
    public void agregarInstitucion(Institucion nuevaInstitucion){
        boolean seEncuentra = false;
        for (Institucion institucion : instituciones){
            if (institucion == nuevaInstitucion){
                seEncuentra = true;
                break;
            }
        }
        if (seEncuentra == false){
            instituciones.add(nuevaInstitucion);
            for (Resultado resultado : nuevaInstitucion.getResultados()){
                resultados.add(resultado);
            }
        }
    }
    
    public int getTotalSerologicos(){
        int total = 0;
        for (Resultado resultado : resultados){
            if (resultado.getTest().testSerologico()){
                total ++;
            }
        }
        return total;
    }
}
