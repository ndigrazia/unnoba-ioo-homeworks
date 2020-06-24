public class Serologico extends Test
{
    private double tiempo=15;
    private Muestra muestra;

    public Serologico(Persona paciente){
        set_paciente(paciente);
    }
    
    public double calcular_tiempo(){
        return tiempo;
    }               
    
    public void set_muestra(Muestra muestra){
        this.muestra=muestra;
    }
    public Muestra get_muestra(){
        return muestra;
    }
}
