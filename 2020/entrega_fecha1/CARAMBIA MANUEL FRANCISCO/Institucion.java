import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Institucion
{
    private Vector<Institucion> Instituciones = new Vector<Institucion>();
    private Localidad unaLocalidad;
    
    public void agregarInstitucion(Institucion unaInstitucion){
        Instituciones.add(unaInstitucion);
    }
    

}
