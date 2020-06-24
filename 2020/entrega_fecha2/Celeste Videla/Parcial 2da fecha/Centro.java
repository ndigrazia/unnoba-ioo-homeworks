import java.util.*;
public abstract class Centro
{
    private String nombre;
    private Localidad localidad;
    private List<Sala> salas = new ArrayList<Sala>();
    
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return nombre;}
    public void setLocalidad(Localidad localidad){this.localidad=localidad;}
    public Localidad getLocalidad(){return localidad;}
    
   public void agregarSalas(Sala s){salas.add(s);}
   public void eliminatSalas(Sala s ){salas.remove(s);}
   public List<Sala> getSalas(){return this.salas;}
   
   public void agregarNuevaSala(int capacidad){
       Sala nuevaSala = new Sala();
       nuevaSala.setCapacidad(capacidad);
       this.agregarSalas(nuevaSala);
   }
    
   public abstract int cantidadMedicos();
   
   public void agregarPaciente(Paciente p){
       for(Sala s : salas){
           if(s.puedoAgregarPaciente(p) == true){
               break;
           }
       }
   }
   
}