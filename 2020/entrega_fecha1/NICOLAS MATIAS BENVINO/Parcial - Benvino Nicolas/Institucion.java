
import java.util.Vector;
public class Institucion{
    private Localidad localidad;
    private Vector<Tecnico> tecnicos = new Vector<Tecnico>();
    private Vector<Resultado> resultados = new Vector<Resultado>();
    
    public Institucion(Localidad localidad){
        setLocalidad(localidad);
    }
    
    public void setLocalidad(Localidad localidad){this.localidad = localidad;}
    
    public void addTecnico(Tecnico tecnico){this.getTecnicos().add(tecnico);}
    public void removeTecnico(Tecnico tecnico){this.getTecnicos().remove(tecnico);}
    
    public void addResultado(Resultado resultado){this.getResultados().add(resultado);}
    public void removeResultado(Resultado resultado){this.getResultados().remove(resultado);}
    
    public Localidad getLocalidad(){return this.localidad;}
    public Vector<Tecnico> getTecnicos(){return this.tecnicos;}
    public Vector<Resultado> getResultados(){return this.resultados;}
}