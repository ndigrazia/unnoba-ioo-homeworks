
public class MP3
{
    private String marca;
    private int capacidad; // en MB
    private int indiceCancionActual = 0;
    private int volumen; // 0 - 100
    private String estado; // Reproduciendo, Pausado, Detenido
    
    public void reproducir() {
        if (indiceCancionActual == 0) {
            indiceCancionActual = 1; 
        }
        estado = "Reproduciendo";
        System.out.println("Reproduciendo: " + indiceCancionActual);
    }

    public void pausar() {
        if (estado.equals("Reproduciendo")) {
            estado = "Pausado";
            System.out.println("Canción pausada: " + indiceCancionActual);
        } else {
            System.out.println("No hay canción reproduciéndose para pausar.");
        }
    }

    public void detener() {
        if (!estado.equals("Detenido")) {
            estado = "Detenido";
            System.out.println("Reproducción detenida.");
        } else {
            System.out.println("El MP3 ya está detenido.");
        }
    }
    
     public void siguiente() {
        if (indiceCancionActual < 20) {
            indiceCancionActual++;
            System.out.println("Siguiente canción: " + indiceCancionActual);
        } else {
            System.out.println("No hay más canciones en la lista.");
        }
    }

    public void anterior() {
        if (indiceCancionActual > 0) {
            indiceCancionActual--;
            System.out.println("Canción anterior: " +indiceCancionActual);
        } else {
            System.out.println("No hay canciones anteriores.");
        }
    }

    public void subirVolumen() {
        if (volumen < 100) {
            volumen++;
            System.out.println("Volumen: " + volumen);
        }
    }

    public void bajarVolumen() {
        if (volumen > 0) {
            volumen--;
            System.out.println("Volumen: " + volumen);
        }
    }

}