public class TestSerologicos extends Test
{
    private Muestra muestraDeSangre;
    public void setMuestraDeSangre(Muestra m){
        muestraDeSangre=m;
    }
    public Muestra getMuestraDeSangre(){
        return muestraDeSangre;
    }
    public int tiempo(){
        return 15;
    }
    public int getMuestra(){
        return 1;
    }
}
