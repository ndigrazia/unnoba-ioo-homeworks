import java.util.*;

public class Subsistema
{
   private List<Centro> centros = new ArrayList<Centro>();
   
   public void agregarCentro(Centro c){centros.add(c);}
   public void eliminatCentro(Centro c){centros.remove(c);}
   public List<Centro> getCentros(){return this.centros;}
   
   public void agregarNuevaSala(Centro centro, int capacidad)/*Agrega una sala al centro que se pasa como parámetro)*/
   {
       centro.agregarNuevaSala(capacidad);
   }
   
   public void agregarPaciente(Centro centro, Paciente paciente) /*Agrega el paciente al centro que se pasa como parámetro. 
   Suponemos que siempre hay espacio en alguna de las salas del centro. Pero no necesariamente en todas*/
   {
       centro.agregarPaciente(paciente);
   }
   
   public int cantidadDeMedicos() /* Retorna la suma de los médicos de todos los centros*/
   {
       int cantidadMedicos = 0;
       for(Centro c: centros){
           cantidadMedicos+=c.cantidadMedicos();}
       return cantidadMedicos;
   }
   
   public int totalCentroAislamiento() /* Retorna el total de los Centros de Aislamiento*/ 
   {
       return centros.size();
   }
   
}
