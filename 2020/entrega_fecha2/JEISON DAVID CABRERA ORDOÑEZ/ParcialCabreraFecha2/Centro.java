import java.util.*;
public abstract class Centro
{
    private String nombre;
    private Localidad localidad;
    private Vector<Sala> vectorSalas = new Vector<Sala>();
    
    public void agregarSala(int capacidad){
        Sala nuevaSala = new Sala();
        nuevaSala.setCapacidadMaxima(capacidad);
        vectorSalas.add(nuevaSala);
    }
    
    public void agregarPaciente(Paciente paciente){
        for (Sala x:vectorSalas){
            if (x.espacioDisponible()==true){
                x.agregarPaciente(paciente);
                break;
            }
        }
    }
    
    public abstract int cantidadDeMedicos();
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setLocalidad(Localidad localidad){
        this.localidad = localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
}
