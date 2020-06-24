
public class Medicos extends Persona
{
    private int numeroMatricula;
    private String especialidad;
    
    public void setnumeroMatricula(int numeroMtricula){
        this.numeroMatricula = numeroMatricula;
    }
    
    public int getnumeroMatricula(){
        return numeroMatricula;
    }
    
    public void setespecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    public String getespecialidad(){
        return especialidad;
    }

    
}