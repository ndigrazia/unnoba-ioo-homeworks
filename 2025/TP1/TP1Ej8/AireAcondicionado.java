
public class AireAcondicionado
{
    private String marca;
    private boolean encendido;
    private int temperatura; // en °C
    private String modo;     // Frío, Calor, Ventilador, Deshumidificador
    private int velocidadVentilador; // 1 = baja, 2 = media, 3 = alta
    
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El aire acondicionado está encendido.");
        } else {
            System.out.println("El aire ya estaba encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El aire acondicionado está apagado.");
        } else {
            System.out.println("El aire ya estaba apagado.");
        }
    }

    public void subirTemperatura() {
        if (encendido && temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura aumentada a " + temperatura + "°C.");
        } else if (!encendido) {
            System.out.println("No se puede cambiar la temperatura, el aire está apagado.");
        }
    }

    public void bajarTemperatura() {
        if (encendido && temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura disminuida a " + temperatura + "°C.");
        } else if (!encendido) {
            System.out.println("No se puede cambiar la temperatura, el aire está apagado.");
        }
    }

    public void cambiarModo(String nuevoModo) {
        if (encendido) {
            this.modo = nuevoModo;
            System.out.println("Modo cambiado a: " + modo);
        } else {
            System.out.println("No se puede cambiar el modo, el aire está apagado.");
        }
    }
}

