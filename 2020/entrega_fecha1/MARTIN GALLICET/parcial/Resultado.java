import java.util.Date;

public class Resultado 
{
    private Date fecha;
    private Instituto instituto;
    private boolean estado;
    private Test test;
   
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date Fecha) {
        this.fecha = fecha;
    } 

    public Instituto getInstituto() {
        return instituto;
    }
    
    public void setInstituto(Instituto instituto) {
        this.instituto = instituto;
    }
    
    public Test getTest() {
        return test;
    }
    
    public void setTest(Test test) {
        this.test = test;
    }
    
     
    public void agregarResultadoPositivo(Test test, Instituto instituto){
           
    }


}
