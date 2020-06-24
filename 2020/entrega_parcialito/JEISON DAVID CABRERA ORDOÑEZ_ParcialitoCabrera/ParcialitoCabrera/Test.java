;import java.util.*;
public abstract class Test
{
    private Date fechaInicio;
    private Persona paciente;
    public abstract int tiempoTest();
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio=fechaInicio;
    }
    public Date getFechaInicio(){
        return fechaInicio;
    }
    public void setPaciente(Persona paciente){
        this.paciente=paciente;
    }
    public Persona getPaciente(){
        return paciente;
    }
}
