import java.util.Date;

public abstract class Test
{

    private Persona persona; //Persona a la que se le realizo el test
    private Date fechaInicio; //Fecha de inicio del test
    private int duracion; //Duracion del test
    
    public Date getFecha(){
        return this.fechaInicio;
    }
    public void setFecha(Date fecha){
        this.fechaInicio = fecha;
    }
    
    public Persona getPersona(){
        return this.persona;
    }     
    public void setPersona(Persona persona){
        this.persona = persona;
    }
    
    public abstract int calcularTiempo();
    public abstract Muestra getMuestra();
}
