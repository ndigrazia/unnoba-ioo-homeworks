import java.util.*;
public class Sala
{
    private int capacidad;
    private Set<Persona> pacientes;
    
    public Sala(int capacidad)
    {
        this.capacidad = capacidad;
        this.pacientes = new HashSet<Persona>();
    }
    
    public void agregaPaciente(Paciente paciente)
    {
        if(pacientes.size() < capacidad)
        {
            pacientes.add(paciente);
        }
    }
    
    public boolean estaLlena()
    {
        if(pacientes.size() == capacidad)
        {
            return true;
        }
        return false;
    }
    
    /*Este metodo lo cree para probar si agregaba pacientes correctamente*/
    public void imprimePacientes()
    {
        for(Persona paciente : pacientes)
        {
            System.out.println(paciente.getNombre());
        }
    }
    
}
