import java.util.Date;
public abstract class Test
{
    private Persona paciente;
    private Date fecha_inicio;

    public Test(){
    }
    
    public abstract double calcular_tiempo();
    
    public void set_paciente(Persona paciente){
        this.paciente=paciente;
    }
    public Persona get_paciente(){
        return paciente;
    }
    
    public void set_fecha_inicio(Date fecha_inicio){
        this.fecha_inicio=fecha_inicio;
    }
    public Date get_fecha_inicio(){
        return fecha_inicio;
    }
}
