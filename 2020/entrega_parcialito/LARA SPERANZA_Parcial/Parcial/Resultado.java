import java.util.Date;
public class Resultado
{
    private Date fecha;
    private Institucion institucion;
    private boolean positivo=false;
    private Test test;
    
    public void setFecha(Date f){fecha=f;}
    public Date getFecha(){return fecha;}
    
    public void setInstitucion(Institucion i){institucion=i;}
    public Institucion getInstitucion(){return institucion;}
    
    public void setEsPositivo(){}
    public boolean getEsPositivo(){return positivo;}
    
    public void setTest(Test t){test=t;}
    public Test get(){return test;}
}
