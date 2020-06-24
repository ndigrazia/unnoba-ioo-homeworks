import java.util.*;
public class MinisterioSalud
{
    private Set<Centro> centrosDeAislamientos;
    
    public MinisterioSalud()
    {
        this.centrosDeAislamientos = new HashSet<Centro>();
    }
    
    public void cargaCentros(Centro centro)
    {
        centrosDeAislamientos.add(centro);
    }
    
    public void agregarNuevaSala(Centro centro, int capacidad)
    {
        centro.nuevaSala(capacidad);
    }
    
    public void agregarPaciente(Centro centro, Paciente paciente)
    {
        centro.agregaPaciente(paciente);
    }
    
    public int cantidadDeMedicos()
    {
        int total = 0;
        for(Centro centro : centrosDeAislamientos)
        {
            total += centro.cantMedicos();
        }
        return total;
    }
    
    public int totalCentroAislamiento()
    {
        return centrosDeAislamientos.size(); /*Retorna 0 por que no cargue los centros, doy por hecho que ya esta todo cargado*/
    }
    
    public Vector<Sala> salasLlenas()
    {
        Vector<Sala> salasLlenas = new Vector<Sala>();
        for(Centro centro : centrosDeAislamientos)
        {
            for(Sala sala : centro.verSalas())
            {
                salasLlenas.add(sala);
            }
        }
        return salasLlenas;
    }
    /*Este metodo lo agregue para probar si funcionaba bien el de agregar salas, lo uso en la clase prueba*/
    public int cantidadTotalSalas()
    {
        int total = 0;
        for(Centro centro : centrosDeAislamientos)
        {
            total += centro.cantSalas();
        }
        return total;
    }
}
