import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Resultado
{
    private Date fechaResultado;
    private Institucion institucion;
    private boolean positividad;
    private Test test;
    
    public void setFechaResultado(Date unaFecha){
        this.fechaResultado = unaFecha;
    }
    
    public Date getFechaResultado(){
        return fechaResultado;
    }
    
    public void setInstitucion(Institucion unaInstitucion){
        this.institucion = unaInstitucion;
    }
    
    public Institucion getInstitucion(){
        return institucion;
    }
    
    public void setTest(Test unTest){
        this.test = unTest;
    }
    
    public Test getTest(){
        return test;
    }
    
    public void setPositividad(boolean VoF ){
        this.positividad = VoF;
    }
    
    public boolean getPositividad(){
        return positividad;
    }
    
}
