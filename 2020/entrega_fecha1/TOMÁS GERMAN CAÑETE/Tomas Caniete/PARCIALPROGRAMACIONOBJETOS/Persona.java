public class Persona
{
    private String nombre;
    private int dni;
    private String sexo;
    private int edad;
    private Localidad localidad;
    public Persona(String nombre, int dni, String sexo, int edad, Localidad localidad)
    {
        setNombre(nombre);
        setDni(dni);
        setSexo(sexo);
        setEdad(edad);
        setLocalidad(localidad);
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    public void setDni(int dni){
    this.dni=dni;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public void setEdad(int edad){
    this.edad=edad;
    }
    public void setLocalidad(Localidad localidad){
    this.localidad=localidad;
    }
    public String getNombre(){return nombre;}
    public int getDNI(){return dni;}
    public String getSexo(){return sexo;}
    public int getEdad(){return edad;}
    public Localidad getLocalidad(){return localidad;}
}
