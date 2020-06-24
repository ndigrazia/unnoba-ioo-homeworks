import java.util.Date;
public abstract class Test
{
    private Persona paciente;
    private Date fechaInicioTest;
    
    public void setFechaInicioTest(Date fechaInicioTest){this.fechaInicioTest=fechaInicioTest;}
    
    public Date getFechaInicioTest(){return fechaInicioTest;}
    
    public void setPacientes(Persona pacientes){this.paciente=paciente;}
    
    public Persona getPacientes(){return paciente;}
    
    public abstract double TiempoTest();
    
    public abstract int es_Serologico();
}
