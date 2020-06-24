import java.util.Date;

public class Resultado
{
    private Date fechaResultado; //fecha del resultado
    private Institucion institucion; //Institucion donde se realizo
    private boolean resultado; //Positivo(true) o Negativo(false)
    private Test test; //Test realizado
    
    public Date getFecha(){
        return this.fechaResultado;
    }
    public void setFecha(Date fecha){
        this.fechaResultado = fecha;
    }
    
    public Institucion getInstitucion(){
        return this.institucion;
    }
    public void setInstitucion(Institucion institucion){
        this.institucion = institucion;
    }
    
    public boolean getResultado(){
        return this.resultado;
    }
    public void setResultado(boolean resultado){
        this.resultado = resultado;
    }
    
    public Test getTest(){
        return this.test;
    }
    public void setTest(Test test){
        this.test = test;
    }
}
