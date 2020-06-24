import java.util.*;
public class Resultado
{
    private Institucion institucion;
    private Test test;
    private Date fechaResultado;
    private boolean positivo;
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
    public void setFechaResultado(Date fechaResultado){
        this.fechaResultado=fechaResultado;
    }
    public Date getFechaResultado(){
        return fechaResultado;
    }
    public boolean getPositivo(){
        return positivo;
    }
}
