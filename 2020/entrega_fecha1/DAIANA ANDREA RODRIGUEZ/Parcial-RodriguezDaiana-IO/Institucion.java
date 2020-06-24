import java.util.Vector;

public class Institucion
{
    private String nombre;    
    private Vector<Tecnico> tecnicos = new Vector<Tecnico>();
    private Vector<Resultado>resultados = new Vector<Resultado>();
    private Localidad localidad;
    
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return nombre;
    }

    public void setLocalidad(Localidad l){
        this.localidad = l;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
}
