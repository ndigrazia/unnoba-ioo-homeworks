import java.util.Date;
public class Persona
{
    public static int masculino=0;
    public static int femenino=1;
    
    private String nombre;
    private int dni;
    private String direccion;
    private Date fechaNacimiento;
    private int sexo;
    
    public Persona(){
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setDni(int dni){
        this.dni=dni;
    }
    public int getDni(){
        return dni;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    
    public void set_fechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    public Date get_fechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setSexo(int sexo){
        this.sexo=sexo;
    }
    public int getSexo(){
        return sexo;
    }
}