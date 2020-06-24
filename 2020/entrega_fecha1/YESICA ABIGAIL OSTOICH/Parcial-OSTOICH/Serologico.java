
public class Serologico extends Test
{
    private MuestraDeSangre muestra;
    
    public Serologico()
    {
        
    }
    
    public void setMuestraDeSangre(MuestraDeSangre muestra){
        this.muestra=muestra;
    }
    public MuestraDeSangre getMuestraDeSangre(){
        return muestra;
    }

    public double tiempo(){
        return 15;
    }
    
    public boolean esSerologico(){
        return true;
    }
    
    
}
