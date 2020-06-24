import java.util.Date;
public class Resultado
{
    private Test test;
    private Date fechaResultado;
    private boolean positivo;
    private Institucion institucion;
    
    public Resultado(Test test, Institucion ins)
    {
        this.test=test;
        institucion=ins;
    }
    
    public void setTest(Test t){
        test=t;}
    public void setFecha(Date f){
        fechaResultado=f;}
    public void setPositivo(boolean p){
        positivo=p;}
    public void setInstitucion(Institucion ins){
        institucion=ins;}
    public Test getTest(){return test;}
    public Date getFecha(){return fechaResultado;}
    public boolean getPositivo(){return positivo;}
    public Institucion getInstitucion(){return institucion;}
}