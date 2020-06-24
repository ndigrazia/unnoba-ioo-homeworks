import java.util.ArrayList;
import java.util.List;


public class Malbran
{
    private List<Institucion> instituciones = new ArrayList<Institucion>(); //instituciones
    private List<Resultado> resultados = new ArrayList<Resultado>();  //resultados
    private Director director; //director de malbran
    
    public Director getDirector(){
        return this.director;
    }
    public void setDirector(Director dir){
        this.director = dir;
    }
    
    /* Agrega la institución si es que la misma no está agregada aun */
    public void agregarInstitucion(Institucion e){
        if (!instituciones.contains(e)){
            instituciones.add(e);
        }
    }
    public void removerInstitucion(Institucion e){
        instituciones.remove(e);
    }
    
    /*Agrega un resultado positivo en la colección de resultados. Además agrega la institución si es que la misma no está agregada aun */
    public Resultado agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado resPositivo = new Resultado();
        
        resPositivo.setTest(test); /*agrego el test*/         
        resPositivo.setInstitucion(institucion);   /*agrego la institucion*/
        resPositivo.setResultado(true);  /*marco el test como positivo*/

        resultados.add(resPositivo); 
        agregarInstitucion(institucion);
        institucion.agregarResultado(resPositivo);
        
        return resPositivo;
    }   
    
    public void removerResultado(Resultado r){
        resultados.remove(r);
    }
    
    /* Retorna el tiempo total de todos los tests */
    public double tiempoTotalMinutos(){
        double total = 0;
        for(Resultado r:resultados) {
            total += r.getTest().calcularTiempo();
        }
        return total;
    }

    /* Retorna la cantidad de test Serologicos realizados */
    public int getTotalSerologicos(){
        int total = 0;
        
        for(Resultado r:resultados) {
            if (r.getTest().getMuestra() != null){
                total += 1;
            }
        }
        return total;
    }
}
