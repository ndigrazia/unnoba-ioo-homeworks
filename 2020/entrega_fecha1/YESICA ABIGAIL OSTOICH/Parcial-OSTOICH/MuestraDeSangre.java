
public class MuestraDeSangre
{
    
    private String tipo; 
    private boolean factor;
    
    public MuestraDeSangre(String tipo, boolean factor)
    {
       this.tipo=tipo;
       this.factor=factor;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getTipo(){
        return tipo;
    }
    
    public void setFactor(boolean factor){
        this.factor=factor;
    }
    public boolean getFactor(){
        return factor;
    }
    

    
}
