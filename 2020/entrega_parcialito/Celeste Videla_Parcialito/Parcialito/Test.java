import java.util.Date;
public abstract class Test
{
    private Persona pacientes;
    private Date fechaInicioTest;
    
    public void setFechaInicioTest(Date fechaInicioTest){this.fechaInicioTest=fechaInicioTest;}
    
    public Date getFechaInicioTest(){return fechaInicioTest;}
    
    public void setPacientes(Persona pacientes){this.pacientes=pacientes;}
    
    public Persona getPacientes(){return pacientes;}
}
