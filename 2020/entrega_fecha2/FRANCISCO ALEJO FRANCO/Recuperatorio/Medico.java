public class Medico extends Persona
{
  private int numeroDeMatricula;
  private String especialidad;
  public void setNumeroDeMatricula(int n){
      numeroDeMatricula=n;
    }
  public int getNumeroDeMatricula(){
      return numeroDeMatricula;
    }
  public void setEspecialidad(String s){
      especialidad=s;
    }
  public String getEspecialidad(){
      return especialidad;
    }
}
