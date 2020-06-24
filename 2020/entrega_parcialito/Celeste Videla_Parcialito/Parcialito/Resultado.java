import java.util.Date;
public class Resultado
{
    private Date fechaDeResultado;
    private Institucion institucion; 
    private boolean resultadoTest;
    private Test test;
    
    private void setFechaDeResultado( Date fechaDeResultado){this.fechaDeResultado=fechaDeResultado;}
    private Date getFechaDeResultado(){return fechaDeResultado;}
    public void setInstitucion(Institucion institucion){this.institucion=institucion;}
    public Institucion getInstitucion(){return institucion;}
    public void setTest(Test test){this.test=test;}
    public Test getTest(){return test;}
    public void setResultadoTest(boolean resultadoTest){this.resultadoTest=resultadoTest;}
    public boolean getResultadoTest(){return resultadoTest;}
    
}
