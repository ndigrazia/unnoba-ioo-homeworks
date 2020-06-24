import java.util.Date;
public class Antigeno extends Test
{
    private int TIEMPO=10;
    public Antigeno(Persona persona, Date fechainicio)
    {
        super(persona,fechainicio);
    }
    @Override
    public int getTiempoResultado(){
    return TIEMPO;
    }
    
  
    @Override
    public boolean isSerologico(){
        return false;
    }
}
