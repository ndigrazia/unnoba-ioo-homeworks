
public class Microondas
{
    private boolean puertaAbierta;
    private boolean cocinando;
    private boolean mediaPotencia;
    
    public void abrirPuerta() {
        if (!puertaAbierta) {
            puertaAbierta = true;
            cocinando = false; 
            mediaPotencia = false;
            System.out.println("La puerta está abierta.");
        } else {
            System.out.println("La puerta ya está abierta.");
        }
    }

    public void cerrarPuerta() {
        if (puertaAbierta) {
            puertaAbierta = false;
            System.out.println("La puerta está cerrada.");
        } else {
            System.out.println("La puerta ya está cerrada.");
        }
    }

    public void cocinar() {
        if (!puertaAbierta) {
            cocinando = true;
            mediaPotencia = false;
            System.out.println("Cocinando a potencia normal...");
        } else {
            System.out.println("No se puede cocinar con la puerta abierta.");
        }
    }

    public void cocinarMediaPotencia() {
        if (!puertaAbierta) {
            cocinando = true;
            mediaPotencia = true;
            System.out.println("Cocinando a media potencia...");
        } else {
            System.out.println("No se puede cocinar con la puerta abierta.");
        }
    }

    public void parar() {
        if (cocinando) {
            cocinando = false;
            mediaPotencia = false;
            System.out.println("La cocción se ha detenido.");
        } else {
            System.out.println("El microondas no está cocinando.");
        }
    }
}