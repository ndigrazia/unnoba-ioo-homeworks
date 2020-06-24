import java.util.List;
import java.util.ArrayList;
public abstract class CentroAislamiento
{
    private Localidad localidad;
    private String nombre;
    private List<Sala> salas = new ArrayList<Sala>();
    
    public void addSala(Sala sala){
       salas.add(sala);
    }
    public void removeSala(Sala sala){
        salas.remove(sala);
    }
    
     public String getNombre() {
		return nombre;
    }
	
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    public Localidad getLocalidad() {
		return localidad;
	 }
	
    public void setLocalidad(Localidad localidad) {
		this.localidad =localidad;
	}
	
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