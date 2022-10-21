import java.util.List;
import java.util.ArrayList;

public class Auto
{
    //Posicion de las ruedas
    public static final int RUEDA_DELANTERA_DERECHA = 0;
    public static final int RUEDA_DELANTERA_IZQUIERDA = 1;
    public static final int RUEDA_TRASERA_IZQUIERDA = 2;
    public static final int RUEDA_TRASERA_DERECHA = 3;
    public static final int RUEDA_AUXILIO = 4;

    //Posicion de las puertas
    public static final int PUERTA_DELANTERA_DERECHA = 0;
    public static final int PUERTA_DELANTERA_IZQUIERDA = 1;
    public static final int PUERTA_TRASERA_IZQUIERDA = 2;
    public static final int PUERTA_TRASERA_DERECHA = 3;
    public static final int PUERTA_BAULERA = 4;
    
    private String marca;
    private String color;
    
    //TODO Agregar el resto de los atributos que representan al Auto
    
    private Motor motor;
    private Rueda[] ruedas = new Rueda[5];
    private Puerta[] puertas = new Puerta[5];

    public Auto()
    {
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
       this.motor = motor;
    }

    public void addRueda(Rueda rueda, int pos) {
        ruedas[pos]=rueda;
    }
    
    public Rueda getRueda(int pos) {
        return ruedas[pos];
    }

    public void addPuerta(Puerta puerta, int pos) {
        puertas[pos]=puerta;
    }
    
    public Puerta getPuerta(int pos) {
        return puertas[pos];
    }
    
    public void encender() {
        motor.encender();
    }
    
    public void apagar(){
        motor.apagar();
    }
    
    public void cerrar(){
        for(int x=0; x < puertas.length; x++)
            puertas[x].cerrar();
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
       this.color = color;
    }
    
    // TODO Getters/Setters para el resto de los atributos que representan al Auto
    
}
