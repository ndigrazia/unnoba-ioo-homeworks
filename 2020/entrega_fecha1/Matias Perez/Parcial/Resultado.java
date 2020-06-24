import java.util.Date;
public class Resultado
{
    private Date fechaResultado;
    private Institucion institucion;
    private boolean pos;
    private Test test;
    
    public boolean getPos(){
        return pos;
    }
     public Institucion getinstitucion(){
        return institucion;
    }
     public void setTest(Test test){
        this.test=test;
    }
    public void setPositivo(boolean pos){
        this.pos=pos;
    }
     public void setFechaResultado(Date fechaResultado){
        this.fechaResultado=fechaResultado;
    }
    public void setInstitucion(Institucion institucion){
        this.institucion=institucion;
    }
    
    public Date getFechaResult(){
        return fechaResultado;
    }
    public Test getTest(){
        return test;
    }
}
