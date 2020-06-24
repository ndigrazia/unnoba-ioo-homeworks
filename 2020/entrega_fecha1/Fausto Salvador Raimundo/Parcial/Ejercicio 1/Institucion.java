import java.util.Vector;
public class Institucion
{
    private String nombre;
    private Localidad localidad;
    private Vector<Tecnico> tecnicos = new Vector<Tecnico>();
    private Vector<Resultado> resultadosInstitucion = new Vector<Resultado>();
    
    public Institucion(Localidad l)
    {
        localidad=l;
    }
    
    public void addResultado(Resultado r){
        resultadosInstitucion.add(r);}
    public void removeResultado(Resultado r){
        resultadosInstitucion.remove(r);}
    public void addTecnico(Tecnico t){
        tecnicos.add(t);}
    public void removeTecnico(Tecnico t){
        tecnicos.remove(t);}
    public void setNombreInstitucion(String n){
        nombre=n;}
    public void setLocalidad(Localidad l){
        localidad=l;}
    public String getNombre(){return nombre;}
    public Localidad getLocalidad(){return localidad;}
}
