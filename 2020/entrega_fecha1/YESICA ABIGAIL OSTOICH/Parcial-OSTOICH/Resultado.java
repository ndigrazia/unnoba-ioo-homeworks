import java.util.Date;

public class Resultado
{
    private Date fechaDeResultado;
    private Institucion institucion;
    private Test test;
    private boolean estado;

    public Resultado()
    {

    }
    public Resultado(boolean estado){
        this.estado=estado;
    }
    
    public void setFechaDeResultado(Date fecha){
        fechaDeResultado=fecha;
    }
    public Date getFechaDeResultado(){
    return fechaDeResultado;
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
    
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    public boolean getEstado(){
        return estado;
    }
}
