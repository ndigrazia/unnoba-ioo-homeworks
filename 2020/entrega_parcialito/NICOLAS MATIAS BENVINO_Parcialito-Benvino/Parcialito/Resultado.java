
import java.util.Date;

public class Resultado{
    private Test test;
    private boolean positivo;
    private Institucion institucion;
    private Date fechaDeResultado;
    
    public Resultado(Test test, boolean positivo, Institucion institucion, Date fechaDeResultado){
        setTest(test);
        setPositivo(positivo);
        setInstitucion(institucion);
        setFechaDeResultado(fechaDeResultado);
    }
    
    public void setTest(Test test){this.test = test;}
    public void setPositivo(boolean positivo){this.positivo = positivo;}
    public void setInstitucion(Institucion institucion){this.institucion = institucion;}
    public void setFechaDeResultado(Date fechaDeResultado){this.fechaDeResultado = fechaDeResultado;}
    
    public Test getTest(){return this.test;}
    public boolean getPositivo(){return this.positivo;}
    public Institucion getInstitucion(){return this.institucion;}
    public Date getFechaDeResultado(){return this.fechaDeResultado;}
}