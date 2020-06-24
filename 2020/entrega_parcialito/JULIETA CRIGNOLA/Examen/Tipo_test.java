import java.util.Date;
public class Tipo_test extends persona{
    private Date fecha_inicio;
    private String Tipo_test;
    
    public Tipo_test(String nombre, Date fecha_nacimiento, int dni, String direccion,Date fecha_inicio){
        super(nombre,fecha_nacimiento,dni,direccion);
        this.fecha_inicio=fecha_inicio;
    }
}