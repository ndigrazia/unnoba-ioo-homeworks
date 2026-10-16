import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Tren {

    private Locomotora locomotora;
    private List<Vagon> vagones = new ArrayList<Vagon>();

    public float cantidadDeLitrosNecesarios(int km) {
        return locomotora.cantidadDeLitrosNecesarios(km);
    }
    
    public float pesoTotalDelTren() {
        float pesoTotal = locomotora.getPesoEspecifico();
        for (Vagon vagon : vagones) {
            pesoTotal += vagon.peso();
        }
        return pesoTotal;
    }

    public int cantidadDePasajeros() {
        int totalPasajeros = 0;
        for (Vagon vagon : vagones) {
            totalPasajeros += vagon.cantidadDePasajeros();
        }
        return totalPasajeros;
    }

    public float velocidadMaxima() {
        float velocidadMaxima = locomotora.getVelocidadMax();
        for (Vagon vagon : vagones) {
            velocidadMaxima = vagon.disminuirVelocidad(velocidadMaxima);
        }
        return velocidadMaxima;
    }

    public boolean puedeMover(List<Vagon> vagones) {
        float pesoTotal = locomotora.getPesoEspecifico();
        for (Vagon vagon : vagones) {
            pesoTotal += vagon.peso();
        }
        return pesoTotal <= locomotora.getPotenciaMax();
    }
}
