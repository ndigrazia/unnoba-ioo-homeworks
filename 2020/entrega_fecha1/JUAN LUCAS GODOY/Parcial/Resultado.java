import java.util.Date;

public class Resultado{
    
    private Date fechaDeResultado;
    private Institucion institucion;
    private boolean positivoONegativo;
    private Test test;
    
    public Resultado(Test test){
        this.test = test;
    }
    
    public void agregarInstitucion(Institucion institucion){
        this.institucion = institucion;
    }
    
    public void resultadoPositivo(){
        positivoONegativo = true;
    }
    
    public Test getTest(){
        return test;
    }
}
