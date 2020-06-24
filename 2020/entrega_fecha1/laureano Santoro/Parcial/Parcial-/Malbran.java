import java.util.*;
public class Malbran
{
    private Vector<Resultado> Resultados = new Vector<Resultado>();
    
    private Vector<Institucion> Instituciones = new Vector<Institucion>();
    
    private Director Director;
    
    public void agregarInstitucion(Institucion inst){
        
        
        Instituciones.add(inst);
        
    }
    public void agregarResultPositivo(Test test, Institucion inst){
        
        
        Resultado nuevoResult = new Resultado();
        
        nuevoResult.setest(test);
        
        nuevoResult.setPositivo(true);
        
        if (this.buscarInstitucion(inst)!=true){
            this.agregarInstitucion(inst);
        }
        
    }
    public boolean buscarInstitucion(Institucion inst){
       
        
        for (Institucion Institucion:Instituciones){
            if (Institucion==inst){
                return true;
            }
        }
        return false;
        
    }
    public double tiempoTotalMinutos(){
        
        
        double total=0;
        for (Resultado resultado:Resultados){
            total+=resultado.getTest().tiempoTest();
        }
        return total;
        
    }
    public int getTotalSerologicos(){
       
        
        int total=0;
        for (Resultado resultado:Resultados){
            total+=resultado.getTest().es_Serologico();
        }
        return total;
        
    }
}
