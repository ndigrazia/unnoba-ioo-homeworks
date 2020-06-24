public class Serologico extends Test
{
    private String muestraSangre;
    private boolean factor;
    public double tiempoTest(){
        return 15;
    }
    public int esSerologico(){
        return 1;
    }

    public void setMuestraSangre(String ms){
        this.muestraSangre = ms;
    }
    public String getMuestraSangre(){
        return muestraSangre;
    }

    public void setFactor(boolean f){
        this.factor = f;
    }
    public boolean getFactor(){
        return factor;
    }
}
