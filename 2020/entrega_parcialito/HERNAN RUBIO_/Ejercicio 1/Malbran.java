import java.util.List;
import java.util.ArrayList;

public class Malbran
{
   private Director director;
   private List<Institucion>instituciones = new ArrayList<Institucion>();
   private List<Resultado>resultados = new ArrayList<Resultado>();
   
   public void setDirector(Director unDirector){
        director = unDirector;
   }
   
   public Director getDirector(){
        return director;
   }
}
