import java.util.ArrayList;
import java.util.List;
public class Institucion
{
    private List<Tecnico>tecnicos=new ArrayList<Tecnico>();
    private Localidad localidad;
    private List<Resultado>resultados=new ArrayList<Resultado>();
    
    
    public void agregarTecnico(Tecnico tecnico){
        tecnicos.add(tecnico);
    }
    public void removerTecnico(Tecnico tecnico){
        tecnicos.add(tecnico);
    }
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void addResultado(Resultado resultado){
        resultados.add(resultado);
    }
    public void removerResultado(Resultado resultado){
        resultados.remove(resultado);
    }
    
}
