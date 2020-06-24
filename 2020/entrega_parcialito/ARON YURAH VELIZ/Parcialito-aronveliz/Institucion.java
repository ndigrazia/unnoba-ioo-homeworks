import java.util.List;
import java.util.ArrayList;
public class Institucion
{
    private String localidad;
    private List<Persona> tecnicos=new ArrayList<Persona>();
    private List<Resultado> resultados=new ArrayList<Resultado>();

    public Institucion(){
    }
    
    public void set_localidad(String localidad){
        this.localidad=localidad;
    }
    public String get_localidad(){
        return localidad;
    }
    
    public void agregar_tecnico(Persona tecnico){
        tecnicos.add(tecnico);
    }
    public void eliminar_tecnico(Persona tecnico){
        tecnicos.remove(tecnico);
    }

    public void agregar_resultado(Resultado resultado){
        resultados.add(resultado);
    }
    public void eliminar_resultado(Resultado resultado){
        resultados.remove(resultado);
    }
}
