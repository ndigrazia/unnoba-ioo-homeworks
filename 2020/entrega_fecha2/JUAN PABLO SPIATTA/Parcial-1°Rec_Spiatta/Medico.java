public class Medico extends Persona
{
    private int n_matricula;
    private String especialidad;
    
    public Medico(String nombre, String apellido, int edad, long dni, int n_matricula, String especialidad)
    {
        super(nombre,apellido,edad,dni);
        this.n_matricula = n_matricula;
        this.especialidad = especialidad;
    }
    
    public int getN_matricula()
    {
        return n_matricula; 
    }
    
    public String getEspecialidad()
    {
        return especialidad;
    }
    
}
