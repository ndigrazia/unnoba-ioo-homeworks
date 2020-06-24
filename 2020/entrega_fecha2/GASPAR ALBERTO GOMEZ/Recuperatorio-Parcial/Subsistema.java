import java.util.List;
import java.util.ArrayList;
public class Subsistema
{
    private List<Centro> centros = new ArrayList<Centro>();
        
    public void agregarCentro(Centro c){
        if (!centros.contains(c)){ //si el array no contiene el centro lo agrego
            centros.add(c);
        }
    }
    public void borrarCentro(Centro c){
        centros.remove(c);
    }
    
    /*Agrega una sala al centro que se pasa como parámetro)*/
    public void agregarNuevaSala(Centro centro, int capacidad){
        Sala sala = new Sala(centro, capacidad);
        centro.agregarSala(sala);
        agregarCentro(centro); //agrego el centro a la lista del subsistema si hacer falta
    }
    
    /*Agrega el paciente al centro que se pasa como parámetro.  
     suponemos que siempre hay espacio en alguna de las salas del centro. 
     Pero no necesariamente en todas */
    public void agregarPaciente(Centro centro, Paciente paciente){
        centro.agregarPaciente(paciente); 
        agregarCentro(centro); //agrego el centro si hacer falta
    }
    
    /* Retorna la suma de los médicos de todos los centros*/
    public int cantidadDeMedicos(){
        int t = 0;
        for (Centro c:centros){
            t = c.contarMedicos(t);
        }
        return t;
    }
    
    /* Retorna el total de los Centros de Aislamiento*/ 
    public int totalCentroAislamiento(){
        return centros.size(); 
    }
}
