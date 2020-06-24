
public class Persona{
    private String nombre;
    private String apellido;
    private int documento;
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public void setapellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getapellido(){
        return apellido;
    }
    
     public void setdocumento(int documento){
        this.documento = documento;
    }
    
    public int getdocumento(){
        return documento;
    }

}
