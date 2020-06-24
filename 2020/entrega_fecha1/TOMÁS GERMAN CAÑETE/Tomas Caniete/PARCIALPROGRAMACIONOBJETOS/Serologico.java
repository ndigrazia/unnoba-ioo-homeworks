import java.util.Date;
public class Serologico extends Test
{
     private int TIEMPO=15;
    public Serologico(Persona persona, Date fechainicio)
    {
        super(persona,fechainicio);
    }
     @Override
    public int getTiempoResultado(){
    return TIEMPO;
    }
        @Override
    public boolean isSerologico(){
        return true;
    }
    
}
