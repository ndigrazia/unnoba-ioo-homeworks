import java.util.Date;
public class Persona
{
    private String nombre;
    private String direccion;
    private Date fechaNacimiento;

    public Persona(/*String nombre, String dir, Date fechaNac*/)
    {
        /*
         * this.nombre=nombre;
         * direccion=dir;
         * setFechaNacimiento(fechaNac);*/
    }
    
    private void setNombre(String nombre){
        this.nombre=nombre;}
    private void setDireccion(String d){
        direccion=d;}
    private void setFechaNacimiento(Date fecha){
        fechaNacimiento=fecha;}
    private String getNombre(){return nombre;}
    private String getDireccion(){return direccion;}
    private Date getFechaNacimiento(){return fechaNacimiento;}
}