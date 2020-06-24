import java.util.Date;

public class Resultado
{
    private Date fechaDeResultado;
    private Institucion institucion;
    private Test test;
    private boolean estadoPosNeg;

    public Resultado()
    {

    }
    
    public void setInstitucion(Institucion institucion){
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
    
    
}
