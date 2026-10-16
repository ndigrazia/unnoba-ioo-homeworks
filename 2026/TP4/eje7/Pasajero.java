public class Pasajero extends Vagon {

    private final int PESO = 80; // Peso aproximado de un pasajero
    private int cantPas;

    public int getCantPas() {
        return cantPas;
    }

    public void setCantPas(int cantPas) {
        this.cantPas = cantPas;
    };

    @Override
    public float peso() {
        return cantPas * PESO; // Peso aproximado de un pasajero
    }

    @Override
    public float disminuirVelocidad(float velocidad) {
        return velocidad - (velocidad * 0.03f); 
    }

    @Override
    public int cantidadDePasajeros() {
        return cantPas;
    }
}
