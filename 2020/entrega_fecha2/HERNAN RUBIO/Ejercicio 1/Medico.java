
public class Medico extends Persona
{
    private int numeroMatricula;
    private String especialidad;
    
    public void setNumeroMatricula(int unNumero){
        this.numeroMatricula = unNumero;
    }
    
    public int getNumeroMatricula(){
        return numeroMatricula;
    }
    
    public void setEspecialidad(String unaEspecialidad){
        this.especialidad = unaEspecialidad;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
}
