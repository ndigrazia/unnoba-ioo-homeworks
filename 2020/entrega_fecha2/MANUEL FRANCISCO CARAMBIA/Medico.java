
public class Medico extends Persona
{
    private int numeroMatricula;
    private String especialidad;
    
    public Medico(){
    
    }
    
   public int getNumeroMatricula(){
       return numeroMatricula;
   }
   
   public void setNumeroMatricula (int numeroMatricula){
       this.numeroMatricula=numeroMatricula;
   }
   
   public String getEspecialidad(){
       return especialidad;
   }
   
   public void setEspecialidad (String especialidad){
       this.especialidad=especialidad;
   }
}
