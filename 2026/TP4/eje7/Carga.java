public class Carga extends Vagon {

    private float pesoCarga;
    private float pesoEspecifico;

    public float getPesoEspecifico() {
        return pesoEspecifico;
    }

    public void setPesoEspecifico(float pesoEspecifico) {
        this.pesoEspecifico = pesoEspecifico;
    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public float peso() {
        return pesoCarga + pesoEspecifico; // Peso total del vagón de carga
    }

    @Override
    public float disminuirVelocidad(float velocidad) {
        return velocidad - (velocidad * 0.03f); 
    }

    @Override
    public int cantidadDePasajeros() {
        return 0;
    }
}
