
import java.util.Date;
public class PCR extends Test{
    private static final int TIEMPO = 120;
    
    PCR(Persona persona, Date fecha){
        super(persona, fecha);
    }
    
    public int tiempoDeTesteo(){
        return TIEMPO;
    }
    
    public int esSerologico(){
        return 0;
    }
}