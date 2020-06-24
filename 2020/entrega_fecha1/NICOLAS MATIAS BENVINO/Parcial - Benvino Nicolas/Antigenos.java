
import java.util.Date;
public class Antigenos extends Test{
    private static final int TIEMPO = 10;
    
    public Antigenos(Persona persona, Date fecha){
        super(persona, fecha);
    }
    
    public int tiempoDeTesteo(){
        return TIEMPO;
    }
    
    public int esSerologico(){
        return 0;
    }
}
