import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.Date;
import java.util.*;


public class Resultado
{
    private Date fechaDeResultado;
    private Institucion unaInstitucion;
    private boolean examen;
    private Test unTest;
    private Vector<Resultado> Resultados = new Vector<Resultado>();
    private Map<Test, Institucion> resultadoPositivos = new HashMap<Test,Institucion>();
    
    public Resultado(Date fecha, Institucion unaInst, boolean resultadoExamen, Test testeo){
        
    }
    
    public void setFechaDeResultado(Date unaFecha) {
       this.fechaDeResultado = unaFecha;
    }
    public Date getFechaDeResultado() {
       return this.fechaDeResultado;
    }
    
    public void setUnaInstitucion(Institucion otraInstitucion){
        this.unaInstitucion = otraInstitucion;
    }
    
    public Institucion getUnaInstitucion(){
        return this.unaInstitucion;
    }
    
    public void setExamen(boolean unExamen){
        this.examen= unExamen;
    }
    
    public boolean getExamen(){
        return this.examen;
    }
    
    public void setUnTest(Test otroTest){
        this.unTest=otroTest;
    }
    
    public Test getUnTest(){
        return this.unTest;
    }
    
    public void agregarResultado(Resultado unResultado){
        Resultados.add(unResultado);
    }
    
    public void agregarResultadoPositivo(Test unTest, Institucion unaInstitucion){
        
    }
}
