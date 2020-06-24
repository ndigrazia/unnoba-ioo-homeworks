public class Persona
{
    private String nombre;
    private double altura;
    private double peso;
    private long dni;
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setAltura(double a){
        altura=a;
    }
    public double getAltura(){
        return altura;
    }
    public void setPeso(double p){
        peso=p;
    }
    public double getPeso(){
        return peso;
    }
    public void setDni(long d){
        dni=d;
    }
    public long getDni(){
        return dni;
    }
}
