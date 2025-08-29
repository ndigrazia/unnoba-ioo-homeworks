
public class LocomotoraElectrica
{
    private String marca;
    private int potencia; // en kW
    private double velocidadMaxima; // en km/h
    private boolean enMarcha;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    // Métodos de comportamiento
    public void arrancar() {
        if (!enMarcha) {
            enMarcha = true;
            System.out.println("La locomotora ha arrancado.");
        } else {
            System.out.println("La locomotora ya está en marcha.");
        }
    }

    public void detener() {
        if (enMarcha) {
            enMarcha = false;
            System.out.println("La locomotora se ha detenido.");
        } else {
            System.out.println("La locomotora ya está detenida.");
        }
    }
}