import java.util.Vector;
public abstract class Centro
{
   private Localidad unaLocalidad;
   private String nombre;
   private Vector<Sala> salas = new Vector<Sala>();
   private Vector<Centro> centros = new Vector<Centro>();
   
   public Centro(){
    
    }
   
   public Localidad getUnaLocalidad(){
       return unaLocalidad;
    }
    
   public void setUnaLocalidad(Localidad unaLocalidad){
       this.unaLocalidad=unaLocalidad;
   } 
   
   public String getNombre(){
       return nombre;
   }
   
   public void setNombre (String nombre){
       this.nombre=nombre;
   }
    
   public Vector<Sala> getSalas() {
        return salas;
    }

    public void setSalas(Vector<Sala> salas) {
        this.salas = salas;
    }
       public Vector<Centro> getCentros() {
        return centros;
    }

    public void setCentro(Vector<Centro> centros) {
        this.centros = centros;
    }
    
        /*Agrega una sala al centro que se pasa como parámetro)*/
    public void agregarNuevaSala(Centro centro, int capacidad){
        Sala sala = new Sala( );
    	getSalas().add(sala);
    }
}
