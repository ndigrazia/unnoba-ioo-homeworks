package eje11;

public class Resta implements Operacion {

    private final Operacion izquierda;
    private final Operacion derecha;

    public Resta(Operacion izquierda, Operacion derecha) {
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public double calcular() {
        return izquierda.calcular() - derecha.calcular();
    }

     public String toString() {
        return "(" + izquierda + " - " + derecha + ")";
    }

}
