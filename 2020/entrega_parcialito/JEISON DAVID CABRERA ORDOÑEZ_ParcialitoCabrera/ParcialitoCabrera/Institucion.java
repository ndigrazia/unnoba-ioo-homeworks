import java.util.*;
public class Institucion
{
    private String nombre;
    private Localidad localidad;
    private Vector<Tecnico> vTecnicos=new Vector<Tecnico>();
    private Vector<Resultado> vResultados=new Vector<Resultado>();
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    public Vector getVTecnicos(){
        return vTecnicos;
    }
    public Vector getVResultados(){
        return vResultados;
    }
}
