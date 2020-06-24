import java.util.List;
import java.util.ArrayList;
import java.util.*;


public class Subsistema{
    private List<centroDeAislamiento>centros = new ArrayList<centroDeAislamiento>();
    
    public void agregarCentro(centroDeAislamiento centro){
        centros.add(centro);
    }
    
    public void eliminaCentro(centroDeAislamiento centro){
        centros.remove(centro);
    }
    
    public void agregarNuevaSala(centroDeAislamiento centro, int capacidad){
        centro.agregarNuevaSala(capacidad);
     }
    
    public void agregarPaciente(centroDeAislamiento centro,Paciente paciente){
        centro.agregarPaciente(paciente);
    } 
    
    public int cantidadDeMedicos(){
        int cantidadMedicos=0;
        for(centroDeAislamiento c: centros){
            cantidadMedicos+=c.cantidadMedicos();
        }
        return cantidadMedicos;
        }
    
    public int totalCentroAislamiento(){ 
       return centros.size();    
    }
   }
    
     
    



        
     
 






     