public class Persona
{
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private double altura;
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setPeso(double p){
        peso=p;
    }
    public double getPeso(){
        return peso;
    }
    public void setAltura(double a){
        altura=a;
    }
    public double getAltura(){
        return altura;
    }
}
