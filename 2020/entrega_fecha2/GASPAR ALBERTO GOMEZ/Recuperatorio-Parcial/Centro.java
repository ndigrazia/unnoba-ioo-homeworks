import java.util.List;
import java.util.ArrayList;
public abstract class Centro
{
    private String nombre;
    private Localidad localidad;
    private List<Sala> salas = new ArrayList<Sala>();
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    public void setLocalidad(Localidad l){
        this.localidad = l;
    }
    
    public void agregarSala(Sala s){
        salas.add(s);
    }
    public void borrarSala(Sala s){
        salas.remove(s);
    }
    
    public void agregarPaciente(Paciente p){
        for (Sala s:salas){
            if (s.agregarPaciente(p)) //intento agregar el paciente a la sala
                break;                //si retorna verdadero termino de iterar
        }                             //en caso de que retorne falso sigo buscando una sala disponible
    }
    
    public abstract int contarMedicos(int t); 
}
