import java.util.Date;
public class Paciente extends Persona
{
    private Persona paciente;
    private Sala sala;
    private Date fechaDeIngreso;
    private Localidad localidad;
    
    public void setPersona(Persona f){
        paciente=f;
    }
    public Persona getPersona(){
        return paciente;
    }
    public void setSala(Sala f){
        sala=f;
    }
    public Sala getSala(){
         return sala;
    }
    public void setFechaDeIngreso(Date fecha){
        fechaDeIngreso=fecha;
    }
    public Date getFechaDeIngreso(){
        return fechaDeIngreso;
    }
    public void setLocalidad(Localidad f){
        localidad=localidad;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    
}
