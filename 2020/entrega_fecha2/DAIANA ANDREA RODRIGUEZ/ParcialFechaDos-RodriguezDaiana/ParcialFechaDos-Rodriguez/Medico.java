public class Medico extends Persona
{
    private String matricula, especialidad;
    
    public void setMatricula(String m){
        this.matricula = m;
    }
    public String getMatricula(){
        return matricula;
    }
    
    public void setEspecialidad(String e){
        this.especialidad = e;
    }
    public String getEspecialdad(){
        return especialidad;
    }
}
