import java.util.Vector;
import java.util.Date;
public class malbaran extends persona{
    private Vector<resultado> resultados_totales =new Vector<resultado>();
    private Vector<institucion> instituciones= new Vector <institucion>();
    private malbaran(String nombre, Date fecha_nacimiento, int dni, String direccion){
        super(nombre,fecha_nacimiento,dni,direccion);
}
    
}