import java.util.ArrayList;
public class Subsistema
{
  private ArrayList<Centro> centros=new ArrayList<Centro>();
  public void addCentro(Centro c){
      centros.add(c);
    }
  public void removeCentro(Centro c){
      centros.remove(c);
    }
  public void agregarNuevaSala(Centro centro,int capacidad){
      Sala nuevaSala=new Sala();
      nuevaSala.setCapacidad(capacidad);
      centro.addSala(nuevaSala);
    }
  public void agregarPaciente(Centro centro,Paciente paciente){
      centro.agregarPaciente(paciente);
    }
  public int cantidadDeMedicos(){
      int suma=0;
      for(Centro x: centros){
          suma=suma+x.sumaMedicos();
        }
      return suma;
    }
  public int totalCentroAislamiento(){
      return centros.size();
    }
}
