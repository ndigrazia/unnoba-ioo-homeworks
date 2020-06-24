public class Serologico extends Test
{
    private Muestra muestraDeSangre;
    
    public Serologico(){}
    
    public int getTiempoEnMinutos(){return 15;}
    
    public void setMuestraDeSangre(Muestra m){muestraDeSangre=m;}
    public Muestra getMuestraDeSangre(){return muestraDeSangre;}
}
