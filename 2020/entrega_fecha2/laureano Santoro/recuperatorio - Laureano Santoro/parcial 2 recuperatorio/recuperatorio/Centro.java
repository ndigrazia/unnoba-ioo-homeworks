import java.util.Vector;
import java.util.*;

public abstract class Centro
{
  private String nombre;
  private Localidad localidadCentro;
  private Vector<Salas> salasCentro = new Vector<Salas>();
  
  public void setLocalidad(Localidad localidadCentro){
     this.localidadCentro= localidadCentro;
   }
   
   public Localidad getLocalidad(){
    return localidadCentro;
    }
   
   public void setNombre(String nombre){
     this.nombre=nombre;
   }
    
   public String getNombre(){
    return nombre;
    }
    public void agregarNuevaSala(int capacidad){
       Salas nuevaSala = new Salas();
       nuevaSala.setCapacidadMaxima(capacidad);
       salasCentro.add(nuevaSala);

    }
    
    public void agregarPaciente( Pacientes paciente){
        
        for (Salas x: salasCentro){
            if (x.espacio()==false){
                x.agregarPaciente(paciente);
            }
        }
        
    }

   
     public int cantidadMedicos() /* Retorna la suma de los médicos de todos los centros*/
    {
        int cantidadMedicos=0;
        for(Salas c: salasCentro){
            cantidadMedicos+=cantidadMedicos();
        }
        return cantidadMedicos;
        }
    public int totalCentro()
    {
        return salasCentro.size();
    
    } 
    public void salasLLenas(Vector<Salas> salasLLenas){
    for (Salas sala: salasCentro){
        if (sala.estaLLena()){
            salasLLenas.add(sala);
        }
    }
}
  
   
   public abstract int cantidadDeMedicos();
  
}
