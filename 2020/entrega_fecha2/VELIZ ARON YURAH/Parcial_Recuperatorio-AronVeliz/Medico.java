public class Medico extends Persona
{
    private Centro centro;
    private int matricula;
    private String especialidad;
    
    public Medico(){
    }
    
    public void setCentro(Centro centro){
        this.centro=centro;
    }
    public Centro getCentro(){
        return centro;
    }
    
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    public int getMatricula(){
        return matricula;
    }
    
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public String getEspecialidad(){
        return especialidad;
    }
}
