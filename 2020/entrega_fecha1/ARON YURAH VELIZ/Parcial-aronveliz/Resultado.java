import java.util.Date;
public class Resultado
{
    private Date fecha_de_resultado;
    private Institucion institucion;
    private boolean positivo;
    private Test test;
    
    public Resultado(boolean positivo, Test test, Institucion institucion){
        this.positivo=positivo;
        this.test=test;
        this.institucion=institucion;
    }
    
    public void set_institucion(Institucion institucion){
        this.institucion=institucion;
    }
    public Institucion get_institucion(){
        return institucion;
    }
    
    public void set_fecha_de_resultado(Date fecha_de_resultado){
        this.fecha_de_resultado=fecha_de_resultado;
    }
    public Date get_fecha_de_resultado(){
        return fecha_de_resultado;
    }
    
    public void set_positivo(boolean positivo){
        this.positivo=positivo;
    }
    public boolean get_positivo(){
        return positivo;
    }
    
    public void set_test(Test test){
        this.test=test;
    }
    public Test get_test(){
        return test;
    }
}
