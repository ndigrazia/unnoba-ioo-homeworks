import java.util.Date;
public class Persona
{
    public static int masculino=0;
    public static int femenino=1;
    
    private String nombre;
    private int dni;
    private String direccion;
    private Date fecha_nacimiento;
    private int sexo;
    
    public Persona(){
    }

    public void set_nombre(String nombre){
        this.nombre=nombre;
    }
    public String get_nombre(){
        return nombre;
    }
    
    public void set_dni(int dni){
        this.dni=dni;
    }
    public int get_dni(){
        return dni;
    }
    
    public void set_direccion(String direccion){
        this.direccion=direccion;
    }
    public String get_direccion(){
        return direccion;
    }
    
    public void set_fecha_nacimiento(Date fecha_nacimiento){
        this.fecha_nacimiento=fecha_nacimiento;
    }
    public Date get_fecha_nacimiento(){
        return fecha_nacimiento;
    }
    
    public void set_sexo(int sexo){
        this.sexo=sexo;
    }
    public int get_sexo(){
        return sexo;
    }
}
