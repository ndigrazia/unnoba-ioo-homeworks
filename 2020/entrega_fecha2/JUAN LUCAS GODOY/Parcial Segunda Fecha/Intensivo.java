import java.util.List;
import java.util.ArrayList;

public class Intensivo extends CentroDeAislamiento {

    private List<Medico> medicos = new ArrayList<Medico>();
    
    public Intensivo(String nombre, Localidad localidad){
        super(nombre, localidad);
    }
    
    public void agregarMedico(Medico medico){
        medicos.add(medico);
    }
    
    public int cantidadMedicos(){
        int cantidad = 0;
        for (Medico medico : medicos){
            cantidad ++;
        }
        return cantidad;
    }
}
