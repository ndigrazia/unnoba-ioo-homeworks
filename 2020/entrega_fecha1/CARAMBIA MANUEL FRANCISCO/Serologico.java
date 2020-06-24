import java.util.Date;
public class Serologico extends Test
{
    private float tiempotTest = 15;
    private String tipo;
    private boolean factor; 
    
    public float tiempo() {
        return getTiempoTest();
    }
    
    public void getTipo(String unTipo){
        this.tipo=unTipo;
    }
    
    public String setTipo(){
        return this.tipo;
    }
        
    public void getFactor(boolean unFactor){
        this.factor=unFactor;
    }
    
    public  boolean setFactor(){
        return this.factor;
    }
    
}
