public class PCR extends Test
{
    private double tiempo=120;

    public PCR(Persona paciente){
        set_paciente(paciente);
    }
    
    public double calcular_tiempo(){
        return tiempo;
    }                
}
