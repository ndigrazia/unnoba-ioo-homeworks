import java.util.List;
import java.util.ArrayList;
public class Centro
{
    private List<Resultado> resultados = new ArrayList<Resultado>();
    
    public Centro(){
    
    }
    
    public void agregarResultado(Resultado unResultado) {
        resultados.add(unResultado);
    }
}
