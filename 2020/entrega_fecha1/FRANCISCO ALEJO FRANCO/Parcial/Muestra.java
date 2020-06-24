public class Muestra
{
    public static String TIPOA="A";
    public static String TIPOB="B";
    public static String TIPOAB="AB";
    public static String TIPO0="0";
    private String tipo;
    private boolean factor;
    public Muestra(String t,boolean factor){
        tipo=t;
        this.factor=factor;
    }
    public void setFactor(boolean factor){
        this.factor=factor;
    }
    public boolean getFactor(){
        return factor;
    }
}
