package eje11;

public class Suma  implements Operacion {

    private final Operacion izquierda;
    private final Operacion derecha;

    public Suma(Operacion izquierda, Operacion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public double calcular() {
        return izquierda.calcular() + derecha.calcular();
    }

     public String toString() {
        return "(" + izquierda + " + " + derecha + ")";
    }
}
