public class Seguidor extends Observador {

    private String nombre;
    private String apellido;
    private String email;
    
    public Seguidor(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }
    
    @Override
    public void recibirNotificacion(Observado observado, String mensaje) {
        Usuario usuario = (Usuario) observado;
         System.out.println("Seguidor " + nombre + " " + apellido + 
            " recibió notificación de " + usuario.getNombre() + " " + usuario.getApellido() + ": " + mensaje);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
