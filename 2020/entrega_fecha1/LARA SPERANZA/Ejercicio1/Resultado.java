import java.util.Date;
public class Resultado
{   private Date fecha;
    private Institucion institucion;
    private boolean positivo;
    private Test test;
    
    public Resultado(){}
    
    public int getTiempoDelTest(){return test.getTiempoEnMinutos();}
    
    public void setInstitucion(Institucion i){institucion=i;}
    public Institucion getInstitucion(){return institucion;}
    
    public void setEsPositivo(boolean TrueOFalse){positivo=TrueOFalse;}
    public boolean getEsPositivo(){return positivo;}
    
    public void setTest(Test t){test=t;}
    public Test get(){return test;}
}
