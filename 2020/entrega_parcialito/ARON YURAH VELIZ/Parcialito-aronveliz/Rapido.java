public class Rapido extends Test
{
    private double tiempo;

    public Rapido(double tiempo, Persona paciente){
        this.tiempo=tiempo;
        set_paciente(paciente);
    }
    
    public double calcular_tiempo(){
        return tiempo; // no se especifica como debe calcularse el tiempo
    }                  // solo dice que se calcula de forma diferente
}
