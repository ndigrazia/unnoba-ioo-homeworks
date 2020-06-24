public class Preventivo extends CentroDeAislamiento
{
    private Responsable responsable;

    public Preventivo(/*Localidad localidad, String nombre*/)
    {
        //super(localidad, nombre);
    }
    
    public void setResponsable(Responsable r){
        responsable=r;}
    public Responsable getResponsable(){return responsable;}
    public int cantidadDeMedicos(){return 0;}
}
