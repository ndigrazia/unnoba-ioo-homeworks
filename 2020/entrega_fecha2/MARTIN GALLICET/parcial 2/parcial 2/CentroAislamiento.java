import java.util.Vector;
public abstract class CentroAislamiento{
    private Vector<Sala> salas = new Vector<Sala>();
    private Localidad localidad;
    private String nombre;
    
    public CentroAislamiento(Localidad localidad, String nombre){
        setLocalidad(localidad);
        setNombre(nombre);
    }

    public boolean agregarPaciente(Paciente paciente){
        for (Sala sala: salas){
            if (sala.agregarPaciente(paciente)){
                return true;
            }
        }
        return false;
    }
    
    public abstract int cantidadDeMedicos();
    
    public void agregarSala(Sala sala){
        salas.add(sala);
    }
    
    public void setLocalidad(Localidad localidad){
        this.localidad = localidad;
    }
    
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
}