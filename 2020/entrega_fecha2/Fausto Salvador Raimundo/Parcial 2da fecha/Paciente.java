import java.util.Date;
public class Paciente extends Persona
{
    private Date fechaIngreso;
    private Localidad localidad;
    private Sala sala;
    
    public Paciente(/*String nombre, String dir, Date fechaNac, Date fechaIngreso, Localidad l, Sala s*/)
    {
        /*
         * super(nombre, dir, fechaNac);
         * this.fechaIngreso=fechaIngreso;
         * localidad=l;
         * sala=s;
         */
        
           
    }
    
    public void setFechaIngreso(Date fecha){
        fechaIngreso = fecha;}
    public void setLocalidad(Localidad localidad){
        this.localidad=localidad;}
    public void setSala(Sala s){
        sala=s;}
    public Date getFechaIngreso(){return fechaIngreso;}
    public Localidad getLocalidad(){return localidad;}
    public Sala getSala(){return sala;}
}