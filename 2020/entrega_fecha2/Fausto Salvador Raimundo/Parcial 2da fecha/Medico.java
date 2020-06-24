//import java.util.Date;
public class Medico extends Persona
{
    private long numeroMatricula;
    private String especialidad;

    public Medico(/*String nombre, String dir, Date fechaNac, long numero, String esp*/)
    {
        /*
         * super(nombre, dir, fechaNac);
         * numeroMatricula=numero;
         * especialidad=esp;
         */
    }
    
    public void setNumeroMatricula(long numero){
        numeroMatricula=numero;}
    public long getNumeroMatricula(){return numeroMatricula;}
    public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;}
    public String getEspecialidad(){return especialidad;}
}