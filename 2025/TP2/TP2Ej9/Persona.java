import java.util.Date;

public class Persona {
    private String nombreCompleto;
    private String dni;
    private String domicilio;
    private String email;
    private String telefono;

    // Constructor
    public Persona(String nombreCompleto, String dni, String domicilio, String email, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.domicilio = domicilio;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y Setters
    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getDomicilio() { return domicilio; }
    public void setDomicilio(String domicilio) { this.domicilio = domicilio; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
