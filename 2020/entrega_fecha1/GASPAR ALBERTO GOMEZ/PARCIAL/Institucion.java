import java.util.ArrayList;
import java.util.List;

public class Institucion
{
    private Localidad localidad; //localidad de la institucion
    private List<Tecnico> tecnicos = new ArrayList<Tecnico>(); //tecnicos
    private List<Resultado> resultadosDeLaInstitucion = new ArrayList<Resultado>(); //resultados realizados en la inst
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    public void setLocalidad(Localidad localidad){
        this.localidad = localidad;
    }
       
    public void agregarResultado(Resultado r){
        resultadosDeLaInstitucion.add(r);
    }
    public void removerResultado(Resultado r){
        resultadosDeLaInstitucion.remove(r);
    }
    
    public void agregarTecnico(Tecnico e){
        tecnicos.add(e);
    }
    public void removerTecnico(Tecnico e){
        tecnicos.remove(e);
    }
}
