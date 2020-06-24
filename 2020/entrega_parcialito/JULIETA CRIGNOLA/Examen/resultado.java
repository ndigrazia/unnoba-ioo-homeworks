
import java.util.Date;
public class resultado extends Tipo_test{
    private Date fecha_resultado;
    private String institucion;
    private boolean positivo_o_negativo;
    
    public resultado(String nombre,Date fecha_nacimiento,int dni,String direccion,Date fecha_inicio){
        super(nombre,fecha_nacimiento,dni,direccion,fecha_inicio);
    }
}