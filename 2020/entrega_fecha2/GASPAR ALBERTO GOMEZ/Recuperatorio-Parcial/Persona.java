import java.util.Date;

public class Persona
{
    //datos basicos de una persona
    private String nombre; //Nombre de la persona
    private String direccion; //Direccion de la persona
    private String telefono; //Telefono de la persona
    private String dni; //DNI de la persona
    private Date fechaNacimiento; //Fecha de nacimiento
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String getDni(){
        return this.dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public void setFechaNacimiento(String nombre){
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
