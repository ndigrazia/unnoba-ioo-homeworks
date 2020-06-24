import java.util.*;
public class Institucion
{
    private List<Resultado> resultados=new ArrayList<Resultado>();
    private List<Tecnicos> tecnicos=new ArrayList<Tecnicos>();
    private Localidad localidad;
    
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void addTecnicos(Tecnicos tecnico){
        tecnicos.add(tecnico);
    }
    public void removeTecnicos(Tecnicos tecnico){
        tecnicos.remove(tecnico);
    }
    public void addResultado(Resultado resultado){
        resultados.add(resultado);
    }
    public void removeResultado(Resultado resultado){
        resultados.remove(resultado);
    }
}