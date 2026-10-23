package eje11;

public class Division implements Operacion {

    private final Operacion izquierda;
    private final Operacion derecha;

    public Division(Operacion izquierda, Operacion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public double calcular() {
        double divisor = derecha.calcular();
        if (divisor == 0) {
            throw new ArithmeticException("Error: división por cero");
        }
        return izquierda.calcular() / divisor;
    }

    public String toString() {
        return "(" + izquierda + " / " + derecha + ")";
    }

}
