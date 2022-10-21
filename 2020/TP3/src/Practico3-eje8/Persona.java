import java.util.Date;

public class Persona
{

    public static int MASCULINO = 0;
    public static int FEMENINO = 1;
    //Persona.MASCULINO
    //Persona.FEMENINO
    
    private String nombre;
    private String dni;
    private String dirección;
    private Date fechaNacimiento;
    private int sexo;
    
    //TODO Agregar los atributos que consideren
    
    public Persona()
    {
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    //TODO Agregar los setters/getters que consideren
}
