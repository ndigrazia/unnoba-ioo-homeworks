import java.util.*;
public class Intensivo extends Centro
{
    private Set<Medico> medicos; 
    
    public Intensivo(String nombre, Localidad localidad)
    {
        super(nombre,localidad);
        this.medicos = new HashSet<Medico>();     
    }
   
    /*Como no especifica la cantidad maxima de medicos cree una coleccion HashSet sin limite*/
    public void agregaMedicos(String nombre, String apellido, int edad, long dni, int n_matricula, String especialidad)
    {
        medicos.add(new Medico(nombre,apellido,edad,dni,n_matricula,especialidad));
    }
    
    public int cantMedicos()
    {
        return medicos.size();
    }
}
