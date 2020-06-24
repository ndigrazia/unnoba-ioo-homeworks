import java.util.ArrayList;
import java.util.List;

public class Malbran
{
    private Director directorMalbran;
    private List<Resultado> resultadosDelPais= new ArrayList<Resultado>();
    private List<Institucion> instituciones= new ArrayList<Institucion>();
    private int cantidadSerologicos;

    public Malbran()
    {
       
    }
    
    public void agregarInstitucion(Institucion institucion){
        instituciones.add(institucion);
    }
    public void quitarInstitucion(Institucion institucion){
        instituciones.remove(institucion);
    }
    
   
    
    public int getTotalSerologicos(){
        return cantidadSerologicos;
    }
    
    public void agregarResultado(Resultado resultado){
        if (resultado.getTest().esSerologico()==true){
            cantidadSerologicos+=1;
        }
        resultadosDelPais.add(resultado);
    }
    
    public void quitarResultado(Resultado resultado){
        resultadosDelPais.remove(resultado);
    }
    
    public void setDirector(Director director){
        directorMalbran=director;
    }
    public Director getDirector(){
        return directorMalbran;
    }
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado newResultado= new Resultado(true);
        newResultado.setTest(test);
        newResultado.setInstitucion(institucion);
        //Profe: Aca por lo que yo entendi, se agrega la institucion al resultado
        resultadosDelPais.add(newResultado);
    }
    
    public double tiempoTotalMinutos(){
        double tiempoTotal=0;
        for (Resultado r: resultadosDelPais){
            tiempoTotal+=r.getTest().tiempo();
        }
        return tiempoTotal;
    }
        

}
