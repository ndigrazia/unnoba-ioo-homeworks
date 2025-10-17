package eje11;

public class Numero implements Operacion {

    private final double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return valor;
    }

    public String toString() {
        return String.valueOf(valor);
    }
}
