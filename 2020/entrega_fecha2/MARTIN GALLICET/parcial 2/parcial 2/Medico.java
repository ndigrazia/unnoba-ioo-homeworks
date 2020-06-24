public class Medico extends Persona{
    private int matricula; 
    private String especialidad;
    
    public Medico()
    {
    }

    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getNumeroMatricula(){
        return matricula;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
}