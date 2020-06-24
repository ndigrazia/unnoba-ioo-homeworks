import java.util.Vector;

public abstract class Centro
{
    private String nombre;
    private Localidad localidad;
    private Vector<Sala> salas = new Vector<Sala>();
    
    public void agregarSala(int capacidad){
        Sala nuevaSala = new Sala();
        nuevaSala.setCapMax(capacidad);
        salas.add(nuevaSala);
    }
    
    public void agregarPaciente(Paciente paciente){
        for(Sala s : salas){
            if(s.espacioDisponible() == true){
                s.agregarPaciente(paciente);
            }
        }
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setLocalidad(Localidad l){
        this.localidad = l;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
    public abstract int cantidadDeMedicos();
}
