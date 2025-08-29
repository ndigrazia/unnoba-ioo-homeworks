
/**
 * Write a description of class CuentaBancaria here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
    private String titular;
    private double saldo;
    private int maxExtracciones;  
    private String fechaCreacion;
    private int extraccionesRealizadas;
    
     public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getMaxExtracciones() {
        return maxExtracciones;
    }

    public int getExtraccionesRealizadas() {
        return extraccionesRealizadas;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    // Métodos de comportamiento
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void extraer(double monto) {
        if (extraccionesRealizadas >= maxExtracciones) {
            System.out.println("No se pueden realizar más extracciones.");
        } else if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
        } else if (monto <= 0) {
            System.out.println("El monto a extraer debe ser positivo.");
        } else {
            saldo -= monto;
            extraccionesRealizadas++;
            System.out.println("Extracción realizada: $" + monto);
        }
    }
}