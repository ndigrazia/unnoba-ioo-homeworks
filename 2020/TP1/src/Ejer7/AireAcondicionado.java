public class AireAcondicionado
{
    private int temperatura;
    private boolean encendido;
 
    public AireAcondicionado()
    {
        encendido = false;
        temperatura = 0;
    }
    
    public int getTemperatura() {
        return temperatura;
    }
    
    public boolean estaEncendido() {
        return encendido;
    }
    
    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }
    
    public void subirTemperatura() {
        temperatura++;
    }

    public void bajarTemperatura() {
        temperatura--;
    }

}
