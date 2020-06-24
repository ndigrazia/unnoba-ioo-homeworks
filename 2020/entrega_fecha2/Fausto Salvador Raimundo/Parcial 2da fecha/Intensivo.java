import java.util.Vector;
public class Intensivo extends CentroDeAislamiento
{
    private Vector<Medico> medicos = new Vector<Medico>();

    public Intensivo(/*Localidad localidad, String nombre*/)
    {
        //super(localidad, nombre);
    }
    
    public void agregarMedico(Medico m){
        if(medicos.contains(m)==false)
            medicos.add(m);}
    public void quitarMedico(Medico m){
        medicos.remove(m);}
    public int cantidadDeMedicos(){
        return medicos.size();} 
    public Vector<Medico> getMedicos(){return medicos;}
}
