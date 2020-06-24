import java.util.Date;

public class Persona
{
    private String nombre,apellido;
    private int dni ;
   
    public Persona()
    {   
    }

    public void setApellido(String apellido){this.apellido=apellido;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setDni(int dni){this.dni=dni;}
    
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public int getDni(){return this.dni;}
    
}
