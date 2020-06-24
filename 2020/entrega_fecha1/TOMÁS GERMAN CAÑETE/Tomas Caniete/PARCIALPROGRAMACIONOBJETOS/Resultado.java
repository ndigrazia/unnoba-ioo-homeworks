import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Resultado
{
    private Date fecha;
    private Institucion institucion;
    private boolean resultado;
    private Test test;
    
    public Resultado(Date fecha, Institucion institucion, boolean resultado, Test test)
    {
        setFecha(fecha);
        setInstitucion(institucion);
        setResultado(resultado);
        setTest(test);
       
    }
    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }
    public void setInstitucion(Institucion institucion)
    {
        this.institucion=institucion;
    }
    public void setResultado(boolean resultado)
    {
        this.resultado=resultado;
    }
     public void setTest(Test test)
    {
        this.test=test;
    }
    public Date getFecha(){return fecha;}
    public Institucion getInstitucion(){return institucion;}
    public boolean getResultado(){return resultado;}
    public Test getTest(){return test;}

}
