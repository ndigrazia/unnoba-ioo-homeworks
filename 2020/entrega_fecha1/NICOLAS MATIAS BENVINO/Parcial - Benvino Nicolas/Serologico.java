
import java.util.Date;
public class Serologico extends Test{
    private static final int TIEMPO = 15;
    
    private Sangre muestra;
    
    public Serologico(Persona persona, Date fecha, Sangre muestra){
        super(persona, fecha);
        setMuestra(muestra);
    }
    
    public int tiempoDeTesteo(){
        return TIEMPO;
    }
    
    public int esSerologico(){
        return 1;
    }
    
    public void setMuestra(Sangre muestra){this.muestra = muestra;}
    
    public Sangre getMuestra(){return this.muestra;}
}