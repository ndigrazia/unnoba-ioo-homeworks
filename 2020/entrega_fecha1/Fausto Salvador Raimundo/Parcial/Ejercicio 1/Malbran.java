import java.util.Vector;
public class Malbran
{
    private Vector<Institucion> instituciones = new Vector<Institucion>();
    private Vector<Resultado> resultados = new Vector<Resultado>();
    private Director director;
        
    public Malbran(Director director, Vector<Institucion> i, Vector<Resultado> r)
    {
        this.director=director;
        resultados=r;
        instituciones=i;
    }
    
    public void addInstitucion(Institucion ins){
        if(institucionesRepetidas(ins) == false){
            instituciones.add(ins);}
    }
    public void removeInstitucion(Institucion i){
        instituciones.remove(i);}
    
    public void addResultado(Resultado r){
        resultados.add(r);
    }
    public void removeResultado(Resultado r){
        resultados.remove(r);}
    
    public void setDirector(Director d){
        director=d;}
    public Director getDirector(){
        return director;}
    
    public boolean institucionesRepetidas(Institucion ins){
        boolean repetido = false;
        for(Institucion i : instituciones){
            if(i==ins)
                repetido = true;
        }
        return repetido;
    }
        
    public void agregarResultadoPositivo(Test t, Institucion i){
        Resultado res = new Resultado(t, i);
        addInstitucion(i);
    }
    
    public int getTotalSerocologicos(){
        int totalSerocologicos = 0;
        for(Resultado r : resultados){
            if(r.getTest().tiempo() == 15.0){
                totalSerocologicos++;}        
        }
        return totalSerocologicos;
    }
    
    public double tiempoTotalMinutos(){
        double total = 0.0;
        for(Resultado r : resultados)
            total+=r.getTest().tiempo();
        return total;
    }
}
