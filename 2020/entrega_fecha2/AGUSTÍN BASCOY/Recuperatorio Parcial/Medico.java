public class Medico extends Persona 
{
    private Persona persona;
    private int nroMatricula;
    private String especialidad;
    
    public void setPersona(Persona f){
        persona=f;
    }
    public Persona getPersona(){
         return persona;
    }
    public void setNroMatricula(int n){
        nroMatricula=n;
    }
    public int getNroMatricula(){
        return nroMatricula;
    }
    public void setEspecialidad(String esp){
        especialidad=esp;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    
    
}
