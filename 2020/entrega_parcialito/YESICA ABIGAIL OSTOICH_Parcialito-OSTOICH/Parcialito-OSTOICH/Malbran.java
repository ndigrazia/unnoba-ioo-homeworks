import java.util.ArrayList;
import java.util.List;

public class Malbran
{
    private Director directorMalbran;
    private List<Resultado> resultadosDelPais= new ArrayList<Resultado>();
    private List<Institucion> instituciones= new ArrayList<Institucion>();

    public Malbran()
    {
       
    }
    
    public void setDirector(Director director){
        directorMalbran=director;
    }
    public Director getDirector(){
        return directorMalbran;
    }

}
