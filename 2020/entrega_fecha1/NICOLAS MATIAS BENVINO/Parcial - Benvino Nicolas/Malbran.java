
import java.util.Vector;
public class Malbran{
    private Vector<Institucion> instituciones = new Vector<Institucion>();
    private Vector<Resultado> resultados = new Vector<Resultado>();
    private Director director;
    
    public Malbran(Director director){
        setDirector(director);
    }
    
    public void agregarInstitucion(Institucion institucion){
        if (this.getInstituciones().contains(institucion) == false){
            this.addInstitucion(institucion);
        }
    }
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        this.agregarInstitucion(institucion);
        Resultado nuevoResultado = new Resultado(institucion,true,test);
        this.addResultado(nuevoResultado);
    }
    
    public double tiempoTotalMinutos(){
        double total = 0;
        for (Resultado resultado: resultados){
            total += resultado.getTiempo();
        }
        return total;
    }
    
    public int getTotalSerologicos(){
        int total = 0;
        for (Resultado resultado: resultados){
            total += resultado.esSerologico();
        }
        return total;
    }
    
    public void addInstitucion(Institucion institucion){this.getInstituciones().add(institucion);}
    public void removeInstitucion(Institucion institucion){this.getInstituciones().remove(institucion);}
    
    public void addResultado(Resultado resultado){this.getResultados().add(resultado);}
    public void removeResultado(Resultado resultado){this.getResultados().remove(resultado);}
    
    public void setDirector(Director director){this.director = director;}
    
    public Vector<Institucion> getInstituciones(){return this.instituciones;}
    public Vector<Resultado> getResultados(){return this.resultados;}
    public Director getDirector(){return this.director;}
}