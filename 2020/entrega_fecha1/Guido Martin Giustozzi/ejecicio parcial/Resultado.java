import java.util.Date; 


public class Resultado
{
    private Date fecha;
    private Institucion institucion; 
    private boolean valorResultado;
    private Test test;
  
    public Resultado()
    {
        
    }

    public Date getFecha(){return fecha;}
    public Institucion getInstitucion(){return institucion;}
    public boolean getValorResultado(){return valorResultado;}
    public Test getTest(){return test;}
    
    public void setFecha(Date fecha){this.fecha=fecha;}
    public void setInstitucion(Institucion insticucion){this.institucion=institucion;}
    public void setValorResultado(boolean resultado){this.valorResultado=valorResultado;}
    public void setTest(Test test){this.test=test;}
    
    public int sereologico(){
        return getTest().esSereologico();
        
    } 
    
    public double tiempoTarda(){
        return getTest().calcularTiempo();
        
    }
}
