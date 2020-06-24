import java.util.Date;

public class Paciente extends Persona{

    private Date fechaDeIngreso;
    private Localidad localidad;
    private Sala salaDeAlojamiento;
    
    public Paciente(String nombre, Localidad localidad){
        super(nombre);
        setLocalidad(localidad);
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad = localidad;
    }
    
    public void setSala(Sala salaDeAlojamiento){
        this.salaDeAlojamiento = salaDeAlojamiento;
    }
}