import java.util.Date;

public class Resultado
{
    private Date fechaResultado;
    private Institucion institucion;
    private boolean positivo;
    private Test test;
    
    public void setFechaResultado(Date f){
        this.fechaResultado = f;
    }
    public Date geFechaResultado(){
        return fechaResultado;
    }
    
    public void setInstitucion(Institucion miInstitucion){
        this.institucion = miInstitucion;
    }
    public Institucion getInstitucion(){
        return institucion;
    }
    
    public void setPositivo(boolean p){
        this.positivo = p;
    }
    public boolean getPositivo(){
        return positivo;
    }
    public void setTest(Test test){
        this.test = test;
    }
    public Test getTest(){
        return test;
    }

}
