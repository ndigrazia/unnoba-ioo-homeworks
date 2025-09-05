
public class AireAcondicionado
{
    private boolean encendido;
    private int temperatura;
    private String modo;
    private int velocidadVentilador;
    private boolean swing;

    // Constructor
    public AireAcondicionado() {
        this.encendido = false;
        this.temperatura = 24; // temperatura por defecto
        this.modo = "frío";
        this.velocidadVentilador = 1;
        this.swing = false;
    }

    // Métodos (mensajes)
    public void encender() {
        encendido = true;
        System.out.println("Aire acondicionado encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Aire acondicionado apagado.");
    }

    public void subirTemperatura() {
        if(encendido) {
            temperatura++;
            System.out.println("Temperatura aumentada a " + temperatura + "°C");
        }
    }

    public void bajarTemperatura() {
        if(encendido) {
            temperatura--;
            System.out.println("Temperatura disminuida a " + temperatura + "°C");
        }
    }

    public void cambiarModo(String nuevoModo) {
        if(encendido) {
            this.modo = nuevoModo;
            System.out.println("Modo cambiado a: " + modo);
        }
    }

    public void cambiarVelocidad(int nuevaVelocidad) {
        if(encendido && nuevaVelocidad >= 1 && nuevaVelocidad <= 5) {
            this.velocidadVentilador = nuevaVelocidad;
            System.out.println("Velocidad cambiada a nivel " + velocidadVentilador);
        }
    }

    public void activarSwing() {
        if(encendido) {
            swing = true;
            System.out.println("Swing activado.");
        }
    }

    public void desactivarSwing() {
        if(encendido) {
            swing = false;
            System.out.println("Swing desactivado.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado: " + 
            (encendido ? "Encendido" : "Apagado") +
            " | Temp: " + temperatura + "°C" +
            " | Modo: " + modo +
            " | Velocidad: " + velocidadVentilador +
            " | Swing: " + (swing ? "Sí" : "No"));
    }
}