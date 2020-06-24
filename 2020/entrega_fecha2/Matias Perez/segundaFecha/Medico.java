
public class Medico extends Persona
{
  
   private int matricula;
   private String especialidad;
   private void setMatricula(int matricula){
        this.matricula=matricula;
   }
    
    private int getMatricula(){
    return matricula;
    } 
    
    private void setEspecialidad(String especialidad){
    this.especialidad=especialidad;
    }
    
    private String getEspecialidad(){
    return especialidad;
    }
    
}
