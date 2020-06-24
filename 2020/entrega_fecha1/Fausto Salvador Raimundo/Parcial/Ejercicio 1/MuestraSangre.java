public class MuestraSangre
{
    private boolean factor;
    private String tipo;
    
    public MuestraSangre()
    {       
    }
    
    public void setTipo(String t){
        tipo=t;}
    public void setFactor(boolean f){
        factor=f;}
    public String getTipo(){return tipo;}
    public boolean getFactor(){return factor;}
}
