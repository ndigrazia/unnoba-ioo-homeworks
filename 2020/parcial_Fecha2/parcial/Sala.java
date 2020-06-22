import java.util.Vector;

public class Sala
{
    private int capMax;
    
    private Vector<Paciente> pacientes = new Vector<Paciente>();
    
    public Sala()
    {
    }

    public boolean addPaciente(Paciente p) {
        if(!estaLlena()) {
            return pacientes.add(p);
        }
        return false;
    }
    
    public void removePaciente(Paciente p) {
         pacientes.remove(p);
    }

    public int getCapMax() {
        return capMax;
    }
    
    public void setCapMax(int c) {
        capMax = c;
    }

    public boolean estaLlena() {
        return  pacientes.size() >= capMax;
    }

    public void addSalaLLena(Vector<Sala> salasLLenas) {
        if(estaLlena())
           salasLLenas.add(this);
    }
}
