import java.util.Vector;

public class institucion{
    private String localidad;
    private Vector<tecnico> tecnicos= new Vector<tecnico>();
    private Vector<resultado> resultados=new Vector<resultado>() ;
    
    public void setLocalidad(String localidad){
        this.localidad=localidad;
    }
    
    
}