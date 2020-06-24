import java.util.Vector;
public class Subsistema
{
    private Vector<CentroDeAislamiento> centros = new Vector<CentroDeAislamiento>();
    
    public Subsistema()
    {
    }
    
    public void agregarCentro(CentroDeAislamiento c){
        if(centros.contains(c)==false)
            centros.add(c);}
    public void quitarCentro(CentroDeAislamiento c){
        centros.remove(c);}
    public Vector<CentroDeAislamiento> getCentros(){return centros;}
    
    //Punto 1:
    public void agregarNuevaSala(CentroDeAislamiento centro, int capacidad){
        agregarCentro(centro);
        centro.agregarNuevaSala(capacidad);}
    
    //Punto 2:
    public void agregarPaciente(CentroDeAislamiento centro, Paciente paciente){
        centro.agregarPaciente2(paciente);}
    
    //Punto 3:
    public int cantidadDeMedicos(){
        int total = 0;
        for(CentroDeAislamiento centro : centros){
            total+=centro.cantidadDeMedicos();
        }
        return total;}
        
    //Punto 4:
    public int totalCentroAislamiento(){
        return centros.size();}
        
    //Ejercicio 2:
    public Vector<Sala> salasLlenas(){
        Vector<Sala> salasLlenas = new Vector<Sala>();
        for(CentroDeAislamiento centroActual : centros){
            centroActual.agregarSalaLlena(salasLlenas);
        }
        return salasLlenas;
    }
}
