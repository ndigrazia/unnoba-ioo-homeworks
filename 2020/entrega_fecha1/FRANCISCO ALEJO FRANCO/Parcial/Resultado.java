import java.util.*;
public class Resultado
{
    private Institucion institucion;
    private Date fechaDeResultado;
    private boolean resultado;
    private Test test;
    public void setInstitucion(Institucion i){
        institucion=i;
    }
    public Institucion getInstitucion(){
        return institucion;
    }
    public void setFechaDeResultado(){
        fechaDeResultado=Calendar.getInstance().getTime();
    }
    public Date getFechaDeResultado(){
        return fechaDeResultado;
    }
    public void setResultado(boolean p){
        resultado=p;
    }
    public boolean getResultado(){
        return resultado;
    }
    public void setTest(Test t){
        test=t;
    }
    public Test getTest(){
        return test;
    }
    
}
