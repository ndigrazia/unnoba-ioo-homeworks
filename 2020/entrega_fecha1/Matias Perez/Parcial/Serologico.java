
public class Serologico extends Test
{ 
    private String muestraDeSangre;
    private boolean factor;
    
    public double tiempoTest(){
        return 15;
    }
    public int esSerologico(){
        return 1;
    }
    
    public String getMuestraSangre(){
        return muestraDeSangre;
    }
    public void setFactor(boolean factor){
        this.factor=factor;
     }
    public boolean getFactor(){
        return factor;
    }
}
    
