import java.util.Date;

public abstract class Test
{

    private Persona persona; //Persona a la que se le realizo el test
    private Date fechaInicio; //Fecha de inicio del test
    private int duracion; //Duracion del test
        
    public abstract void calcularTiempo();
}
