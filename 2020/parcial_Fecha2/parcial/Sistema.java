import java.util.Vector;

public class Sistema
{
    private Vector<CentroAislamiento> centros = new Vector<CentroAislamiento>();
    
    public Sistema()
    {
    }

    public void addCentroAislamiento(CentroAislamiento c) {
        if(!centros.contains(c)) 
            centros.add(c);
    }
    
    public void removePaciente(CentroAislamiento c) {
         centros.remove(c);
    }
    
    /*Agrega una sala al centro que se pasa como parámetro)*/
    public void agregarNuevaSala(CentroAislamiento centro, int capacidad) {
        centro.addSala(capacidad);
        addCentroAislamiento(centro);
    }
    
    /*Agrega el paciente al centro que se pasa como parámetro.  
     * Suponemos que siempre hay espacio en alguna de las salas del centro. 
     * Pero no necesariamente en todas*/
    public void agregarPaciente(CentroAislamiento centro, Paciente paciente) {
        centro.addPaciente(paciente);
    }
    
    /* Retorna la suma de los médicos de todos los centros*/
    public int cantidadDeMedicos() {
        int t = 0;
        for(CentroAislamiento c:centros) {
          t+=c.cantidadDeMedicos();
        }
        return t;
    }
    
    /* Retorna el total de los Centros de Aislamiento*/ 
    public int totalCentroAislamiento() {
      return centros.size();
    }
    
     /* Retorna una colección con todas las salas llenas. Una sala está llena si col.size() >= capacidadMaxima de la sala */
    public Vector<Sala> salasLlenas() {
        Vector<Sala> salas = new Vector<Sala>();

        for(CentroAislamiento c:centros) {
           c.addSalasLlenas(salas);         
        }
        
        return salas;
    }
}
