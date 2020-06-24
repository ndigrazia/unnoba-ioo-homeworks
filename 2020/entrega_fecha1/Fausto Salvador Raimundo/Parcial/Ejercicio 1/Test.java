import java.util.Date;
public abstract class Test
{
    public static int PROCESANDO = 0;
    public static int ESPERA = 1;    
    public static int TERMINADO = 2;
    private Date fecha;
    private Persona persona;
    private int estado;
    public Test()
    {
       // estado = e;
    }
    public abstract double tiempo();
    public void setPersona(Persona p){
        persona=p;}
    public Persona getPersona(){return persona;}
    public void setEstado(int e){
        estado=e;}
    public int getEstado(){return estado;}
}
