import java.util.Date;

public abstract class Test
{
    private Persona paciente;
    private Date fechaInicio;
    public abstract double tiempoTest(); 
    public abstract int esSerologico();
    
    public void setPaciente(Persona miPaciente){
        this.paciente = miPaciente;
    }
    public Persona getPaciente(){
        return paciente;
    }

    public void setFechaInicio(Date miFecha){
        this.fechaInicio = miFecha;
    }
    public Date getFechaInicio(){
        return fechaInicio;
    }
}
