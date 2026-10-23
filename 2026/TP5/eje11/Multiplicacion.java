package eje11;

public class Multiplicacion implements Operacion {

    private final Operacion izquierda;
    private final Operacion derecha;

    public Multiplicacion(Operacion izquierda, Operacion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public double calcular() {
        return izquierda.calcular() * derecha.calcular();
    }

     public String toString() {
        return "(" + izquierda + " * " + derecha + ")";
    }
}
