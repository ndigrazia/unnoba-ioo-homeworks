import java.util.ArrayList;
public abstract class Centro
{
   private String nombreCentro;
   private Localidad localidad;
   private ArrayList<Sala> salas=new ArrayList<Sala>();
   public void addSala(Sala s){
       salas.add(s);
    }
   public void removeSala(Sala s){
       salas.remove(s);
    }
   public void setNombre(String n){
       nombreCentro=n;
    }
   public String getNombre(){
       return nombreCentro;
    }
   public void setLocalidad(Localidad l){
       localidad=l;
    }
   public Localidad getLocalidad(){
       return localidad;
    }
   public abstract int sumaMedicos();
   public void agregarPaciente(Paciente p){
       for(Sala x:salas){
           if(x.quedaEspacio()==true){
               x.addPaciente(p);
               break;
            }
        }
    }
}
