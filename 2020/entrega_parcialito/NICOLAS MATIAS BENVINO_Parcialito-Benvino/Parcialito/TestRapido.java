
import java.util.Date;

public class TestRapido extends Test{
    
    public TestRapido(Persona persona, Date fechaInicio){
        super(persona, fechaInicio);
    }
    
    public float calcularTiempo(){return 0.0f;} //Valor de retorno 0.0f para que no salte error
}