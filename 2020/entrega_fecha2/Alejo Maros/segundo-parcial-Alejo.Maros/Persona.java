public abstract class Persona
{
    private String nombre;
    private String apellido;
    private int numeroDoc;

    public Persona()
    { 
    }
    
    public String getNombre() {
		return nombre;
	}
	
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
    public String getApellido() {
		return apellido;
	}
	
    public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
    public int getNumeroDoc() {
		return numeroDoc;
	}
	
    public void setNumeroDoc(int NumeroDoc) {
		this.numeroDoc = numeroDoc;
	}

}
   

