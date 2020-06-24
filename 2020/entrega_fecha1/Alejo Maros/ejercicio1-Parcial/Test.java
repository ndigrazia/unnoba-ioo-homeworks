import java.util.Date;
public abstract class Test 
{
    private Persona personas;
    private Date fecha;
    

 public Test()
    {
    }
    public Persona getPersona() {
		return personas;
	}
    public void setPersona(Persona personas) {
		this.personas = personas;
	}
    public Date getFecha() {
		return fecha;
	}
    public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
    public abstract Double calcularTiempo();
}