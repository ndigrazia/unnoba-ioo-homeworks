import java.util.List;
import java.util.ArrayList;
public class Malbran
{
    private Persona director;
    private List<Institucion> instituciones=new ArrayList<Institucion>();

    public Malbran(){
    }
    
    public void set_director(Persona director){
        this.director=director;
    }
    public Persona get_director(){
        return director;
    }
    
    public void agregar_institucion(Institucion institucion){
        instituciones.add(institucion);
    }
    public void eliminar_institucion(Institucion institucion){
        instituciones.remove(institucion);
    }
}
