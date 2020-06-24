import java.util.Vector;
public abstract class CentroDeAislamiento
{
    private String nombre;
    private Localidad localidad;
    private Vector<Sala> salas = new Vector<Sala>();
    
    public CentroDeAislamiento(/*Localidad localidad, String nombre*/)
    {
        /*
         * this.localidad=localidad;
         * this.nombre=nombre;*/
    }
    
    //Para el punto 3:
    public abstract int cantidadDeMedicos();
    
    public void agregarSala(Sala s){
        if(salas.contains(s)==false)
            salas.add(s);}
    public void quitarSala(Sala s){
        salas.remove(s);}
    //Para el punto 1:
    public void agregarNuevaSala(int capacidad){
        Sala nuevaSala = new Sala(capacidad);
        agregarSala(nuevaSala);
    }
    
    public int cantSalas(){return salas.size();}
    public Vector<Sala> getSalas(){return salas;}
    //Para el punto 2: 
    public void agregarPaciente2(Paciente p){
        for(Sala sala : salas){
            if(sala.salaLlena()==false){
                sala.agregarPaciente(p);
                break;}
        }
    }
    
    public void agregarSalaLlena(Vector<Sala> salasLlenas){
        for(Sala s : salas)
            if(s.salaLlena()==true)
                salasLlenas.add(s);
    }
}
