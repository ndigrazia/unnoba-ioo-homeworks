
import java.util.Date;

public class Tecnico extends Persona{
    private String titulo;
    
    public Tecnico(String nombre, Date fechaNacimiento, long DNI, String titulo){
        super(nombre, fechaNacimiento, DNI);
        setTitulo(titulo);
    }
    
    public void setTitulo(String titulo){this.titulo = titulo;}
}