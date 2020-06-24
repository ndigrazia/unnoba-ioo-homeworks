
public class Medico extends Persona
{
    private int matricula;
    private String especialidad;

    public String getEspecialidad(){
        return this.especialidad;
    }
    public void setEspecialidad(String e){
        this.especialidad = e;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int m){
        this.matricula = m;
    }
}