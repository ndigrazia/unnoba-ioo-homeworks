import java.util.ArrayList;
public class Malbran
{
    private Director director;
    private ArrayList<Resultado> resultados=new ArrayList<Resultado>();
    private ArrayList<Institucion> instituciones=new ArrayList<Institucion>();
    public void setDirector(Director d){
        director=d;
    }
    public Director getDirector(){
        return director;
    }
    public void addResultado(Resultado r){
        resultados.add(r);
    }
    public void removeResultado(Resultado r){
        resultados.remove(r);
    }
    public void addInstituciones(Institucion i){
        instituciones.add(i);
    }
    public void removeInstituciones(Institucion i){
        instituciones.remove(i);
    }
    public void agregarInstitucion(Institucion institucion){
        if(instituciones.contains(institucion)){
            //nada
        }
        else{
            addInstituciones(institucion);
        }
    }
    public void agregarResultadoPositivo(Test test,Institucion institucion){
        Resultado r=new Resultado();
        r.setFechaDeResultado();
        r.setInstitucion(institucion);
        r.setResultado(true);
        r.setTest(test);
        if(instituciones.contains(institucion)==false){
            addResultado(r);
            addInstituciones(institucion);
        }
        else{
            addResultado(r);
        }
    }
    public double timepoTotalMinutos(){
        double tiempo=0;
        for(Resultado x:resultados){
            tiempo=tiempo+(x.getTest()).tiempo();
        }   
        return tiempo;
    }
    public int getTotalSerologicos(){
        int total=0;
        for(Resultado x:resultados){
            if(x.getTest().getMuestra()!=0){
                total=total+1;
            }
        }
        return total;
    }
}
