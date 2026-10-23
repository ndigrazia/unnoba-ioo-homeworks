package eje11;

public class Main {

     public static void main(String[] args) {
         Operacion expresion = new Division(
                new Multiplicacion(
                        new Suma(new Numero(5), new Numero(3)),
                        new Resta(new Numero(10), new Numero(2))
                ),
                new Numero(4)
        );

        System.out.println("Expresión: " + expresion);
        System.out.println("Resultado: " + expresion.calcular());
    }
}
