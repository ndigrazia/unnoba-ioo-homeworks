import java.util.*;
public class Institucion
{
    private Persona[] tecnicos;
    private Localidad localidad;
    private Resultado[] resultados;
    private String nombre;
    public Institucion(String nombre, int cantTecnicos, String nombreLocalidad)
    {
        Persona[] tecnicos = new Persona[cantTecnicos];
        this.nombre = nombre;
        localidad = new Localidad(nombreLocalidad);
        resultados = new Resultado[1000];
    }
    
    public String getNombre()
    {
        return nombre;
    }
}
