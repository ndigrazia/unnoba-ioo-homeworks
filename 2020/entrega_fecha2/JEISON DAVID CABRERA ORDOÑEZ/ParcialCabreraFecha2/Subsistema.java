import java.util.*;
public class Subsistema
{
    private Vector<Centro> vectorCentros = new Vector<Centro>();
    public void agregarNuevaSala(Centro centro, int capacidad){
        centro.agregarSala(capacidad);
    }
    public void agregarPaciente(Centro centro, Paciente paciente){
        centro.agregarPaciente(paciente);
    }
    public int cantidadDeMedicos(){
        int suma=0;
        for (Centro x:vectorCentros){
            suma+=x.cantidadDeMedicos();
        }
        return suma;
    }
    public int totalCentroAislamiento(){
        return vectorCentros.size();
    }
    
}
