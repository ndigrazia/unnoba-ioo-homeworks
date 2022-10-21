public class ReproductorMP3
{
    private boolean encendido;
    private boolean reproduciendo;
    private int temaActual;
    
    //TODO Agregar las propiedades que considere

    public ReproductorMP3()
    {
        encendido = false;
        reproduciendo = false;
    }
    
    public boolean estaEncendido() {
        return encendido;
    }
    
    public boolean estaReproduciendo() {
        return reproduciendo;
    }
    
    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void reproducir() {
        reproduciendo = true;
    }

    public void parar() {
        reproduciendo = false;
    }

    public void proximoTema() {
        temaActual++;
    }

    public void anteriorTema() {
        if(temaActual > 0)
            temaActual--;
    }
    
    public int getTemaActual() {
        return temaActual;
    }
    
   //TODO Agregar las operaciones que considere
}
