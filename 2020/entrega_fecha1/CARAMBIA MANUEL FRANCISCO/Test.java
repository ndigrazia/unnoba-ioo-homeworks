
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.Date;
import java.util.*;
public abstract class Test
{
    private Persona unaPersona;
    private Date fechaInicioTest;
    private float tiempoTest;
    private Vector<Test> Testeos = new Vector<Test>();
    
    public Test(){
        
    }
    
    public void setUnaPersona(Persona otraPersona){
        this.unaPersona= otraPersona;
    }
    
    public Persona getUnaPersona(){
        return this.unaPersona;
    }
    
    public void setFechaInicioTest(Date inicioTest){
        this.fechaInicioTest=inicioTest;
    }
    
    public Date getFechaInicioTest(){
        return this.fechaInicioTest;
    }
    
    public void setTiempoTest(float unTest){
        this.tiempoTest=unTest;
    }
    public float getTiempoTest(){
        return this.tiempoTest;
    }
    
    public void agregarUnTest(Test unTest){
        Testeos.add(unTest);
    }
    
    public double tiempoTotalMinutos(Vector<Test>Testeos){
        double total;
        for(int i=0; i<Testeos.size(); i++){
            //total+=Testeos[i].tiempoTest;//
        }
            
        return 0;
    }
    public int getTotalSerologicos(){
        return 0;
    }
}
