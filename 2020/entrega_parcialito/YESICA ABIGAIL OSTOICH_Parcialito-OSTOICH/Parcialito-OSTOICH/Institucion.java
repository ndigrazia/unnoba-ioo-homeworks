import java.util.ArrayList;
import java.util.List;

public class Institucion
{
    private Localidad localidad;
    private List<Resultado> resultados= new ArrayList<Resultado>();
    private List<Tecnico> tecnicos= new ArrayList<Tecnico>();

    public Institucion()
    {

    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
}
