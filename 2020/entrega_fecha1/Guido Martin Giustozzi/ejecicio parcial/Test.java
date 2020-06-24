import java.util.Date;

public abstract class Test 
{
    private Persona persona;
    private Date fecha;
    
    
    public Test()
    {
        
    }
    
    public void setPersona(Persona persona){this.persona=persona;}
    public void setFecha(){this.fecha=fecha;}
    
    public Persona getPersona(){return persona;}
    public Date SetFecha(){return fecha;}

    public abstract int esSereologico();
    
    
    public abstract double calcularTiempo();
   
    
}
