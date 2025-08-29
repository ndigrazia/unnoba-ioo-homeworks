
/**
 * Write a description of class Guitarra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Guitarra
{
    // instance variables - replace the example below with your own
    private String marca;
    private String tipo; // por ejemplo, Acústica, Eléctrica
    private int numeroDeCuerdas;
    private boolean afinada;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDeCuerdas() {
        return numeroDeCuerdas;
    }

    public void setNumeroDeCuerdas(int numeroDeCuerdas) {
        this.numeroDeCuerdas = numeroDeCuerdas;
    }

    public boolean isAfinada() {
        return afinada;
    }

    // Métodos de comportamiento
    public void afinar() {
        if (!afinada) {
            afinada = true;
            System.out.println("La guitarra ahora está afinada.");
        } else {
            System.out.println("La guitarra ya está afinada.");
        }
    }

    public void tocar() {
        if (afinada) {
            System.out.println("Tocando la guitarra...");
        } else {
            System.out.println("¡La guitarra no está afinada! Afínala primero.");
        }
    }
}