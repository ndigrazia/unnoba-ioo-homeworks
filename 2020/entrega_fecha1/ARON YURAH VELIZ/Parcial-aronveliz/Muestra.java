public class Muestra
{
    private String tipo;
    private boolean factor;
    public Muestra(String tipo, boolean factor){
        this.tipo=tipo;
        this.factor=factor;
    }
    
    public void set_tipo(String tipo){
        this.tipo=tipo;
    }
    public String get_tipo(){
        return tipo;
    }
    
    public void set_factor(boolean factor){
        this.factor=factor;
    }
    public boolean get_factor(){
        return factor;
    }
}
