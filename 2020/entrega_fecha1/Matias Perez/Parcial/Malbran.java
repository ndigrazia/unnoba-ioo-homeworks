import java.util.*;
public class Malbran
{    private Director director;
    private Vector<Institucion> instituciones =new Vector<Institucion>();
    private Vector<Resultado> resultados =new Vector<Resultado>();
    
    
    
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
        resultados.add(resultado);}
   public void removeResultado(Resultado resultado){
        resultados.remove(resultado);
    }
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado nuevoResultado = new Resultado();
        nuevoResultado.setTest(test);
        nuevoResultado.setPositivo(true);
        if (this.buscarInstitucion(institucion)!=true){
            //COMPILO
           // this.agregarInstitucion(institucion);
        }
    }
    public boolean buscarInstitucion(Institucion institucion){
        //COMPILO
        for (Institucion Institucion:instituciones){

//        for (Institucion Institucion:Instituciones){
            if (Institucion==institucion){
                return true;
            }
        }
        return false;
    }
    public double tiempoTotalMinutos(){
        double total=0;
        //COMPILA
        for (Resultado resultado:resultados){
        //resultados
        //for (Resultado resultado:misResultados){
            
            total+=resultado.getTest().tiempoTest();
        }
        return total;
    }
    public int getTotalSerologicos(){
        int total=0;
        //COMPILA
        for (Resultado resultado:resultados){
        //for (Resultado resultado:Resultados){
            total+=resultado.getTest().esSerologico();
        }
        return total;
    
    }
}

