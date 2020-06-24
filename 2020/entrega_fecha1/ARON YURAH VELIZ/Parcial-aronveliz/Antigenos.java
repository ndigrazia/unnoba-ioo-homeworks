public class Antigenos extends Test
{
    private double tiempo=10;

    public Antigenos(Persona paciente){
        set_paciente(paciente);
    }
    
    public double calcular_tiempo(){
        return tiempo;
    }                
}
