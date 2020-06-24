import java.util.List;
import java.util.ArrayList;
public abstract class Centro
{
    private String nombre;
    private Localidad localidad;
    private List<Sala>salas=new ArrayList<Sala>();
    
    public void setNombreCentro(String n){
        nombre=n;
    }
    public String getNombreCentro(){
        return nombre;
    }
    public void setLocalidad(Localidad l){
         localidad=l;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    public void addSala(Sala f){
        salas.add(f);
    }
    public void removeSala(Sala r){
        salas.remove(r);
    }
    public void agregarPaciente(Paciente f){
        for(Sala s:salas){
            if(s.agregarPaciente(f)){
                break;  //Puse el break porque si ya lo agregue a una sala, no tiene que seguir iterando.
            }
        }
    }

    public abstract int cantidadMedicos();
        
}
