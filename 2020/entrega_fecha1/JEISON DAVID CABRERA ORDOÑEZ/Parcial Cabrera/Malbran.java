import java.util.*;
public class Malbran
{
    private Vector<Resultado> misResultados = new Vector<Resultado>();
    private Vector<Institucion> misInstituciones = new Vector<Institucion>();
    private Director miDirector;
    public void agregarInstitucion(Institucion institucion){
        misInstituciones.add(institucion);
    }
    public void agregarResultadoPositivo(Test test, Institucion institucion){
        Resultado nuevoResultado = new Resultado();
        nuevoResultado.setTest(test);
        nuevoResultado.setPositivo(true);
        nuevoResultado.setFechaResultado(new Date());
        if (this.buscarInstitucion(institucion)!=true){
            this.agregarInstitucion(institucion);
        }
        this.getMisResultados().add(nuevoResultado);
    }
    public boolean buscarInstitucion(Institucion institucion){
        for (Institucion miInstitucion:misInstituciones){
            if (miInstitucion==institucion){
                return true;
            }
        }
        return false;
    }
    public double tiempoTotalMinutos(){
        double total=0;
        for (Resultado resultado:misResultados){
            total+=resultado.getMiTest().tiempoTest();
        }
        return total;
    }
    public int getTotalSerologicos(){
        int total=0;
        for (Resultado resultado:misResultados){
            total+=resultado.getMiTest().es_Serologico();
        }
        return total;
    }
    public Vector<Resultado> getMisResultados(){
        return misResultados;
    }
}
