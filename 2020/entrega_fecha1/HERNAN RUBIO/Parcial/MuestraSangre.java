
public class MuestraSangre
{
    public static String TIPO1 = "A";
    public static String TIPO2= "B";
    public static String TIPO3= "AB";
    public static String TIPO4= "0";
      
    private String tipo;
    private boolean factor;
    
    public void setTipo(String unTipo){
        this.tipo = unTipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setFactor(boolean unFactor){
        this.factor = unFactor;
    }
    
    public boolean getFactor(){
        return factor;
    }
}
