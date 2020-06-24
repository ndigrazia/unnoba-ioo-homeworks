import java.util.List;
import java.util.ArrayList;
public class Malbran extends Institucion
{
    private Director director;
    private List<Resultado>resultadosDelPais=new ArrayList<Resultado>();
    private List<Institucion>instituciones=new ArrayList<Institucion>();
    
    private void setDirector(Director d){director=d;}
    private Director getDirector(){return director;}
}
