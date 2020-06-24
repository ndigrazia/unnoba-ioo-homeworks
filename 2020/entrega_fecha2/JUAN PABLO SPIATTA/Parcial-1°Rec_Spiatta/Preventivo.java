public class Preventivo extends Centro
{
    private String responsable;
    
    public Preventivo(String nombre, Localidad localidad, String responsable)
    {
        super(nombre,localidad);
        this.responsable = responsable;
    }

}
