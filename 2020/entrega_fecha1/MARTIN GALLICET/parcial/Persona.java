import java.util.Date;

public class Persona
{
    private String nombre;
    private String apellido;
    private String direccion;
    private int dni;
    private Date fechanac;
    
        public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getDni() {
		return dni;
	}
	
	public Date getFechanac() {
		return fechanac;
	}
	
	public void setFechanac(Date Fechanac) {
		this.fechanac = fechanac;
	}
}
