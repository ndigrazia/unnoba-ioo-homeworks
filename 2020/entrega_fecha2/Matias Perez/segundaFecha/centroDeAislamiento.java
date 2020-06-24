import java.util.List;
import java.util.ArrayList;
public abstract  class centroDeAislamiento
{
   
    private Localidad miLocalidad;
    private String nombre;
    private List<Sala>salas = new ArrayList<Sala>();
   
   public void agregarNuevaSala( int capacidad)/*Agrega una sala al centro que se pasa como parámetro)*/
    {
       Sala nuevaSala = new Sala();
       nuevaSala.setCapacidad(capacidad);
       agregarSalas(nuevaSala);

    } 
   public void agregarPaciente( Paciente paciente) /*Agrega el paciente al centro que se pasa como parámetro.  Suponemos que siempre hay espacio en alguna de las salas del centro. Pero no necesariamente en todas*/
    {   for (Sala x: salas){
             if(x.espacioDisponible()==true){
                 x.agregarPaciente(paciente);
                 break;
             }
     
          }
     } 
    
 
   public void setLocalidad(Localidad miLocalidad){
     this.miLocalidad=miLocalidad;
   }
   
   public Localidad getLocalidad(){
    return miLocalidad;
   }
   
   public void setNombre(String nombre){
     this.nombre=nombre;
   }
    
   public String getNombre(){
    return nombre;
    }
   
   public void agregarSalas(Sala s){
       salas.add(s);
    }
   
   public void eliminarSalas (Sala s){
       salas.remove(s);
    }
   public List<Sala> getSalas(){
       return this.salas;
    }
   public abstract int cantidadMedicos();
   
  
}
