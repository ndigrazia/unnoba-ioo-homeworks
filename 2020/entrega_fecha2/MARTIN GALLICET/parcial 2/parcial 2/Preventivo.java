public class Preventivo extends CentroAislamiento{
    private Responsable responsable;
    
    public Preventivo(Localidad localidad, String nombre, Responsable responsable){
        super(localidad, nombre);
        this.responsable = responsable;
    }

    public int cantidadDeMedicos(){
        return 0;
    }

}