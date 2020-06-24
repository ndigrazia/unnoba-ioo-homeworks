import java.util.List;
import java.util.ArrayList;

public abstract class CentroDeAislamiento
{
    private String nombre;
    private Localidad localidad;
    private List<Sala> salas = new ArrayList<Sala>();
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad = localidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void addSala(Sala sala){
        salas.add(sala);}
        
    public void removeSala(Sala sala){
        salas.remove(sala);}
    
    public void agregarSala(int capacidad) {
       this.salas.add(new Sala(capacidad));
    }
 
   
    public void agregarPaciente(Pacientes pacientes){
        for(Sala sala : salas){
            if(sala.tieneCapacidad()){
                sala.agregarPaciente(pacientes);
           }
       }
   }
   
   public abstract int cantidadMedicos();
   
}
