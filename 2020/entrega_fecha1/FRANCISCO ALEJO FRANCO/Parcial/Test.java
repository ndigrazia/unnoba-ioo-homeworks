import java.util.*;
public abstract class Test
{
    private Persona paciente;
    private Date fechaDelTest;
    public void setPersona(Persona p){
        paciente=p;
    }
    public Persona getPersona(){
        return paciente;
    }
    public void setFechaDelTest(){
        fechaDelTest=Calendar.getInstance().getTime();
    }
    public Date getFechaDelTest(){
        return fechaDelTest;
    }
    public abstract int tiempo();
    public abstract int getMuestra();
}
