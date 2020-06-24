import java.util.List;
import java.util.ArrayList;
public class Sala
{
    private Centro centro;
    private int capacidadMaxima;
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    
    public Sala(){
    }
    
    public Sala(Centro c, int capacidad){
        this.setCentro(c);
        this.setCapacidad(capacidad);
    }
    
    public int getCapacidad(){
        return this.capacidadMaxima;
    }
    public void setCapacidad(int c){
        this.capacidadMaxima = c;
    }
    
    public Centro getCentro(){
        return this.centro;
    }
    public void setCentro(Centro centro){
        this.centro = centro;
    }
    
    public int cantidadPacientes(){
        return pacientes.size();
    }
    
    public boolean hayLugar(){ //busca si hay lugar en la sala
        return cantidadPacientes()<getCapacidad();
    }
    
    public boolean agregarPaciente(Paciente p){
        if (hayLugar()){ //si la sala tiene lugar
            pacientes.add(p); //agrego el paciente
            p.setSala(this); //le asigno al paciente esta sala
            return true; //devuelvo verdadero para terminar el bucle
        }
        return false; //si no hay lugar para el paciente retorno falso y continua
    }
    
    public void borrarPaciente(Paciente p){
        pacientes.remove(p);
    }
}
