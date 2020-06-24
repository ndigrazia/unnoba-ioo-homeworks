import java.util.*;
public class Paciente extends Persona
{
    private Date fecha_ingreso;
    private Localidad localidad;
    private Sala sala;
    
    public Paciente(String nombre, String apellido, int edad, long dni, Localidad localidad)
    {
        super(nombre,apellido,edad,dni);
        this.localidad = localidad;
        this.fecha_ingreso = new Date();
    }
     
    public void setSala(Sala sala)
    {
        this.sala = sala;
    }
}
