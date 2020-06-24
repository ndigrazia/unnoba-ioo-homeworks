import java.util.List;
import java.util.ArrayList;
public class Malbran
{
    private Persona director;
    private List<Institucion> instituciones=new ArrayList<Institucion>();
    private Resultado positivo;

    public Malbran(){
    }
    
    public void set_director(Persona director){
        this.director=director;
    }
    public Persona get_director(){
        return director;
    }
    
    public void agregar_institucion(Institucion institucion){
        instituciones.add(institucion);
    }
    public void eliminar_institucion(Institucion institucion){
        instituciones.remove(institucion);
    }
    
    public void agregar_resultado_positivo(Test test, Institucion institucion){
        positivo.set_test(test);
        positivo.set_positivo(true);
        positivo.set_institucion(institucion);
        institucion.agregar_resultado(positivo);
        instituciones.add(institucion);
        if(instituciones.contains(institucion)==false){
            instituciones.add(institucion);
        }
    }
    
    public double tiempo_total_minutos(){
        double tiempo_total=0;
        for (Institucion i:instituciones){
            for (Resultado r:i.listaResultados()){
                tiempo_total+=r.get_test().calcular_tiempo();
            }
        }
        return tiempo_total;
    }
    
    public double get_total_serologicos(){
        double total_serologicos=0;
        for (Institucion i:instituciones){
            for (Resultado r:i.listaResultados()){
                if(r.get_test().calcular_tiempo()==15){
                    total_serologicos+=1;
                }
            }
        }
        return total_serologicos;
    }
    
}
