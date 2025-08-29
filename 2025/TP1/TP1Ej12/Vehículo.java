
public class Vehículo
{
    private String marca;
    private String modelo;
    private int anio;
    private String tipo; // Auto, Moto, Camion, etc.
    private double velocidad; // km/h
    private boolean encendido;
    
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El vehículo está encendido.");
        } else {
            System.out.println("El vehículo ya estaba encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            velocidad = 0;
            System.out.println("El vehículo se apagó.");
        } else {
            System.out.println("El vehículo ya estaba apagado.");
        }
    }

    public void acelerar() {
        if (encendido) {
            velocidad ++;
            System.out.println("El vehículo aceleró a " + velocidad + " km/h.");
        } else {
            System.out.println("No se puede acelerar, el vehículo está apagado.");
        }
    }

    public void frenar() {
        if (encendido && velocidad > 0) {
            velocidad --;
            if (velocidad < 0) velocidad = 0;
            System.out.println("El vehículo frenó a " + velocidad + " km/h.");
        } else {
            System.out.println("El vehículo está detenido o apagado.");
        }
    }
}