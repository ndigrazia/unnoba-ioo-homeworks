import java.util.Date;
public class Resultado
{
    private Date fechaDeResultado;
    private Institucion institucion;
    private boolean positividad;
    private Test test;
    
    public void setFechaDeResultado(Date unaFecha){
        fechaDeResultado  = unaFecha;
    }

    public Date getFechaDeReultado(){
        return fechaDeResultado;
    }
    
    public void SetInstitucion(Institucion unaInstitucion){
        institucion = unaInstitucion;
    }
    
    public Institucion getInstitucion (){
        return institucion;
    }
    
    public void setPositividad(boolean VoF){
        positividad = VoF;
    }
    
    public boolean getPositividad(){
        return positividad;
    }
    
    public void setTest(Test unTest){
        test = unTest;
    }
    
    public Test getTest(){
        return test;
    }
}
