public class Localidad
{
    private String nombre;
    private int CP;

    public Localidad(int cp, String n)
    {
        this.CP=cp;
        nombre=n;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;}
    public String getNombre(){return nombre;}
    public void setCP(int cp){
        this.CP=cp;}
    public int getCP(){return CP;}
}
