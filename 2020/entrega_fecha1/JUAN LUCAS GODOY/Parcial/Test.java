import java.util.Date;

public abstract class Test{
    
    private Persona persona;
    private Date fechaInicioDeTest;
    
    public Test(){
    }
    
    abstract public int getTiempo();
    
    abstract public boolean testSerologico();
}
