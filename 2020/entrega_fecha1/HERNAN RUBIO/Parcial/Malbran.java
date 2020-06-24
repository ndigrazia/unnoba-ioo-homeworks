import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Malbran
{
    private List<Resultado>resultados = new ArrayList<Resultado>();
    private List<Institucion>instituciones = new ArrayList<Institucion>();
    private Director director;
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado resultado = new Resultado();
        resultado.setTest(test);
        resultado.setPositividad(true);
        resultado.setFechaResultado(Calendar.getInstance().getTime());
        resultado.setInstitucion(institucion);        
        
        resultados.add(resultado);
    }
    
    public void setDirector(Director unDirector){
        this.director = unDirector;
    }
    
    public Director getDirector(){
        return director;
    }
    
    public void agregarInstitucion(Institucion unaInstitucion){
        instituciones.add(unaInstitucion);
    }
    
    public void eliminarInstitucion(Institucion unaInstitucion){
        instituciones.remove(unaInstitucion);
    }
    
    public double tiempoTotalMinutos(){
        double total = 0;
        for (Resultado r : resultados){
            total += r.getTest().tiempoTest();
        }
        return total;
    }
    
    public int getTotalSerologicos(){
        int total = 0;
        for (Resultado r : resultados){
            if (r.getTest().tiempoTest() == 15){
                total += 1;
            }
        }
        return total;
    }
}
