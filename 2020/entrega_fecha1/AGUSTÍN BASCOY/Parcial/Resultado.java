import java.util.Date;
public class Resultado
{
    private Date fecha;
    private Institucion institucion;
    private boolean positivo;
    private Test test;
    
    public void setInstitucion(Institucion insitucion){
        this.institucion=institucion;
    }
    public Institucion getInstitucion(){
        return institucion;
    }
    public void setTest(Test test){
        this.test=test;
    }
    public Test getTest(){
        return test;
    }
    public void setPositivo(boolean positividad){
        positivo=positividad;
    }
    public boolean getPositividad(){
        return positivo;
    }
    
    
   
}

