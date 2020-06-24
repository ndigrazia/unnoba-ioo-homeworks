
import java.util.Date;
public class Resultado{
    private Date fecha;
    private Institucion institucion;
    private boolean resultado; // se refiere a si es positivo (true) o negativo (false)
    private Test test;
    
    public Resultado(Institucion institucion, boolean resultado, Test test){
        setFecha(this.getTest().getFecha());
        setInstitucion(institucion);
        setResultado(resultado);
        setTest(test);
    }
    
    public int esSerologico(){
        return this.getTest().esSerologico();
    }
    
    public double getTiempo(){
        return this.getTest().tiempoDeTesteo();
    }
    
    public void setFecha(Date fecha){this.fecha = fecha;}
    public void setInstitucion(Institucion institucion){this.institucion = institucion;}
    public void setResultado(boolean resultado){this.resultado = resultado;}
    public void setTest(Test test){this.test = test;}
    
    public Date getFecha(){return this.fecha;}
    public Institucion getInstitucion(){return this.institucion;}
    public boolean getResultado(){return this.resultado;}
    public Test getTest(){return this.test;}
}