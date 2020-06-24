
import java.util.Vector;
import java.util.*;

public class Subsistema{
    
    private Vector<Centro> centros = new Vector<Centro>();
    
   public Vector<Salas> salasLLenas(){
    Vector<Salas> salasLLenas = new Vector<Salas>();
    for(Centro centroActual: centros){
        centroActual.salasLLenas(salasLLenas);
    }
    return salasLLenas;
}
     
     public void agregarCentro(Centro centro){
       centros.add(centro);
    }
   
   public void agregarNuevaSala (Centro centro, int capacidad){
       centro.agregarNuevaSala(capacidad);
    }
   public void agregarPaciente(Centro centro, Pacientes paciente){
       centro.agregarPaciente(paciente);
    }
    
   public int cantidadMedicos(){
       
       int suma=0;
       for (Centro c: centros){
           suma += c.cantidadDeMedicos();
        }
        return suma;
    }
    
    
    
    
   
 }
