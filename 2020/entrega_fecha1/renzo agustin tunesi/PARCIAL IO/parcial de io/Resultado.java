import java.util.Date;

public class Resultado{
    private Date fechaResultado;
    private Test test;
    private boolean positivoNegativo;
    private Institucion institucion;
    
    public void setfechaResultado(Date fechaResultado){
        this.fechaResultado = fechaResultado;
    }
    
    public Date getfechaResultado(){
        return fechaResultado;
    }
    
    public void setTest(Test test){
        this.test = test;
    }
    
    public Test getTest(){
        return test;
    }
    
    public void setpositivoNegativo(boolean positivoNegativo){
        this.positivoNegativo = positivoNegativo;
    }
    
    public boolean getpositivoNegativo(){
        return positivoNegativo;
    }
    
    public void setInstitucion(Institucion institucion){
        this.institucion = institucion;
    }
    
    public Institucion getInstitucion(){
        return institucion;
    }
    
    public double tiempoTarda(){
        return getTest().calcularTiempo();
    }
    
    public int Serologico(){
        //COMPILO
        return 0;
       // return getTest().esSerologico();
    }
    
   
}
