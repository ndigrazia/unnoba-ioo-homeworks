import java.util.Date;
public class Paciente extends Persona
{
    private Date ingreso;
    private Localidad proviene;
    private Sala alojado;
    
    public Date getFechaIngreso(){
        return this.ingreso;
    }
    public void setFechaIngreso(Date f){
        this.ingreso = f;
    }
    
    public Localidad getLocalidad(){
        return this.proviene;
    }
    public void setLocalidad(Localidad l){
        this.proviene = l;
    }
    
    public Sala getSala(){
        return this.alojado;
    }
    public void setSala(Sala s){
        this.alojado = s;
    }
}
