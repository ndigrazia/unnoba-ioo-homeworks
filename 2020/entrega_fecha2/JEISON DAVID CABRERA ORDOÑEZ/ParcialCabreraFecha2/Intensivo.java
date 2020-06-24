import java.util.*;
public class Intensivo extends Centro
{
    private Vector<Medico> vectorMedicos = new Vector<Medico>();
    public int cantidadDeMedicos(){
        return vectorMedicos.size();
    }
    public void agregarMedico(Medico medico){
        vectorMedicos.add(medico);
    }
    public void eliminarMedico(Medico medico){
        vectorMedicos.remove(medico);
    }
}
