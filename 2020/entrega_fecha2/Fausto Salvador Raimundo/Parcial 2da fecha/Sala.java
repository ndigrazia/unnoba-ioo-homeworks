import java.util.Vector;
public class Sala
{
    private int capacidadMaxima;
    private boolean lleno = false;
    private Vector<Paciente> pacientes = new Vector<Paciente>();

    public Sala(int capacidad)
    {
        setCapacidadMaxima(capacidad);
    }
    
    public void setCapacidadMaxima(int capacidad){
        capacidadMaxima=capacidad;}
    public int getCapacidadMaxima(){return capacidadMaxima;}
    
    public void agregarPaciente(Paciente p){
        if(pacientes.size()<capacidadMaxima){
            pacientes.add(p);}
        if(pacientes.size()>=capacidadMaxima)
            lleno=true;
            /*Hago esta parte para que luego de agregar el último paciente
            la sala pueda reconocer que está llena.*/
        }
    public void quitarPaciente(Paciente p){
        pacientes.remove(p);
        lleno = false;}
    public void removerPacientes(){
        pacientes.clear();}
    public int cantidadPacientes(){return pacientes.size();}
    public boolean salaLlena(){return lleno;}
    public Vector<Paciente> getPacientes(){return pacientes;}
}