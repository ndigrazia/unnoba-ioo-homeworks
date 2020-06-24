import java.util.*;
public class Resultado
{
    private Date fechaResultado;
    
    private Institucion Institucion;
    
    private Test Test;
    
    private boolean positivo;
    
    public void setFechaResultado(Date fechaResult){
        
        
        this.fechaResultado= fechaResult;
        
    }
    public void setInstitucion(Institucion Institucion){
       
        
        this.Institucion= Institucion;
        
    }
    public void setest(Test test){
       
        
        this.Test= test;
    }
    public void setPositivo(boolean positivo){
       
        
        this.positivo= positivo;
    }
    public Date getFechaResultado(){
        
       
        return fechaResultado;
        
    }
    public Institucion getInstitucion(){
        
        
        return Institucion;
        
    }
    public Test getTest(){
        
        
        return Test;
        
    }
    public boolean getPositivo(){
        
        
        return positivo;
        
    }
}
