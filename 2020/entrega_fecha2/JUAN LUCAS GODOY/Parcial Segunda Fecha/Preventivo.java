public class Preventivo extends CentroDeAislamiento {
    
    private Responsable responsable;
        
    public Preventivo(String nombre, Localidad localidad, Responsable responsable){
        super(nombre, localidad);
        this.responsable = responsable;
    }
        
    public int cantidadMedicos(){
        return 0;
    }
}