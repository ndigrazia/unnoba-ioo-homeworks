import java.util.Date;

public class persona{
    private String nombre;
    private Date fecha_nacimiento;
    private int dni;
    private String direccion;
    
    public persona(String nombre,Date fecha_nacimiento,int dni,String direccion){
        SetNombre(nombre);
        SetFecha_nacimiento(fecha_nacimiento);
        setDNI(dni);
        set_direccion(direccion);
    }
    
    public void SetNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void SetFecha_nacimiento(Date fecha){
        fecha_nacimiento=fecha;
    }
    
    public void setDNI(int dni){
        this.dni=dni;
    }
    
    public void set_direccion(String direccion){
        this.direccion=direccion;
    }
    
    public String get_nombre(){
        return this.nombre;
    }
    
    public String get_direccion(){
        return this.direccion;
    }
    
    public int get_dni(){
        return this.dni;
    }
    
    public Date get_fecha_nacimiento(){
        return this.fecha_nacimiento;
    }
}