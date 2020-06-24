import java.util.Date;
public class Pcr extends Test
{
    private int TIEMPO=120;
    private String tipodesangre;
    private boolean factor;
    public Pcr(Persona persona, Date fechainicio)
    {
        super(persona,fechainicio);
    }
    public void setFactor(boolean factor){
    this.factor=factor;
    }
    public boolean getFactor(){
    return this.factor;
    }
    public void setTipoSangre(String tiposangre){
    this.tipodesangre=tiposangre;
    }
    public String getTipoSangre(){
    return this.tipodesangre;
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
