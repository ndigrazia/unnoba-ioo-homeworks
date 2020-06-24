import java.util.Vector;

public class Malbran
{
    private Vector<Resultado> resultados = new Vector<Resultado>();
    private Vector<Institucion> instituciones = new Vector<Institucion>();
    private Director director;
    
    public void agregarInstitucion(Institucion institucion){
        instituciones.add(institucion);
    }
    
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado nuevoResultado = new Resultado();
        nuevoResultado.setTest(test);
        nuevoResultado.setPositivo(true);
        if(this.buscarInstitucion(institucion) != true){
            this.agregarInstitucion(institucion);
        }
    }
    public boolean buscarInstitucion(Institucion institucion){
        for (Institucion instituciones : instituciones){
            if (instituciones == institucion){
                return true;
            }
        }
        return false;
    }
    
    public double tiempoTotalMinutos(){
        double t = 0;
        for (Resultado resultado:resultados)
            t += resultado.getTest().tiempoTest();
        return t;
    }
    

}
