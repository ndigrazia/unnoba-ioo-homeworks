import java.util.*;
public abstract class Centro
{
    private String nombre;
    private Localidad localidad;
    private List<Sala> salas;
    
    public Centro(String nombre, Localidad localidad)
    {
        this.nombre = nombre;
        this.localidad = localidad;
        this.salas = new ArrayList<Sala>();
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int cantMedicos()
    {
        return 0;
    }
    
    public int cantSalas()
    {
        return salas.size();
    }
    
    public void agregaMedicos(String nombre, String apellido, int edad, long dni, int n_matricula, String especialidad)
    {
        
    }
    
    public void nuevaSala(int capacidad)
    {
        salas.add(new Sala(capacidad));
    }
    
    public void agregaPaciente(Paciente paciente)
    {
        ListIterator<Sala> it = salas.listIterator();
        while(it.hasNext())
        {
            Sala sala = it.next();
            if(!sala.estaLlena())
            {    
                sala.agregaPaciente(paciente);
                break;
            }
        }
    }
    
    public Vector<Sala> verSalas()
    {
        Vector<Sala> salasLlenas = new Vector<Sala>();
        for(Sala sala : salas)
        {
            if(sala.estaLlena())
            {
                salasLlenas.add(sala);
            }
        }
        return salasLlenas;
    }
    
}
