import java.util.ArrayList;
public class Institucion
{
    private Localidad localidad;
    private ArrayList<Resultado> resultados=new ArrayList<Resultado>();
    private ArrayList<Tecnico> tecnicos=new ArrayList<Tecnico>();
    public void setLocalidad(Localidad l){
        localidad=l;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    public void addResultado(Resultado r){
        resultados.add(r);
    }
    public void removeResultado(Resultado r){
        resultados.remove(r);
    }
    public void addTecnico(Tecnico t){
        tecnicos.add(t);
    }
    public void removeTecnico(Tecnico t){
        tecnicos.remove(t);
    }
    
}
