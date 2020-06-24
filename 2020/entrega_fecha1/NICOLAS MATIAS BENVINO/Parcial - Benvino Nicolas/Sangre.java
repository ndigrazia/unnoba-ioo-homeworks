
public class Sangre{
    private static final int A = 0;
    private static final int B = 1;
    private static final int AB = 2;
    private static final int O = 3; // es la letra O, si quiero poner 0 tira error.
    
    private static final boolean POSITIVO = true;
    private static final boolean NEGATIVO = false;
    
    private int tipo;
    private boolean factor;
    
    public Sangre(int tipo, boolean factor){
        setTipo(tipo);
        setFactor(factor);
    }
    
    public void setTipo(int tipo){this.tipo = tipo;}
    public void setFactor(boolean factor){this.factor = factor;}
}