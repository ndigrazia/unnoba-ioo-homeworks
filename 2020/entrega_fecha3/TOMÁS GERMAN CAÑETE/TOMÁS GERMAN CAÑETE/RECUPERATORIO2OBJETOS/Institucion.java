public class Institucion
{
    private String nombre;
    private int CUIT;
    public Institucion(String nombre, int CUIT)
    {
        setNombre(nombre);
        setCUIT(CUIT);
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCUIT(int CUIT){
        this.CUIT=CUIT;
    }
    public int getCUIT(){return this.CUIT;}
    public String getNombre(){return this.nombre;}
}
