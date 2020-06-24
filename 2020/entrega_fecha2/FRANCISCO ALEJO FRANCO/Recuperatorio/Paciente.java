import java.util.*;
public class Paciente extends Persona
{
    private Date fechaDeIngreso;
    private Localidad localidad;
    private Sala sala;
    public void setFecha(){
        fechaDeIngreso=Calendar.getInstance().getTime();
    }
    public Date getFecha(){
        return fechaDeIngreso;
    }
    public void setLocalidad(Localidad l){
        localidad=l;
    }
    public Localidad getLocalidad(){
        return localidad;
    }
    public void setSala(Sala s){
        sala=s;
    }
    public Sala getSala(){
        return sala;
    }
}
