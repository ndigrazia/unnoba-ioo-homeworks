public class aireAcondicionado{
    
    //   --- Atributos descriptivos ---
    
    private String marca;
    private int temperaturaMaxima, temperaturaMinima;
    
    //   --- Atributos funcionales ---
    
    private int temperaturaActual;
    private boolean estado, turbo, aireCaliente;
    
    //   --- Constructor ---
    
    public aireAcondicionado(int temperaturaMaxima, int temperaturaMinima, String marca){
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.marca = marca;
    } // Instancia temperatura maxima, temperatura minima y marca del AC.
    
    //   --- Operaciones ---
    
    public void Encender(){
        if (estado==false){
            estado = true;
            temperaturaActual = 24;
            aireCaliente = false;
            turbo = false;
        }
    } // Enciende el AC, instanciando el turbo y aire caliente en false (apagado) y la tamperatura en 24, siempre y cuando no este prendido
    
    public void Apagar(){
        estado = false;
    } // Apaga el AC
    
    public void SubirTemperatura(){
        if (temperaturaActual < temperaturaMaxima && estado==true)
            temperaturaActual++;
    } // Aumenta la temperatura si no sobrepaso el limite si el AC esta prendido
    
    public void BajarTemperatura(){
        if (temperaturaActual > temperaturaMinima && estado==true)
            temperaturaActual--;
    } // Disminuye la temperatura si no sobrepaso el limite si el AC esta prendido
    
    public void ActivarAireCaliente(){
        if (estado==true)
            aireCaliente = true;
    } // Activa el aire caliente si el AC esta prendido
    
    public void DesactivarAireCaliente(){
        if (estado==true)
            aireCaliente = false;
    } // Desactiva el aire caliente si el AC esta prendido
    
    public void ActivarTurbo(){
        if (estado==true)
            turbo = true;
    } // Activa el turbo si el AC esta prendido
    
    public void DesactivarTurbo(){
        if (estado==true)
            turbo = false;
    } // Desactiva el turbo si el AC esta prendido
    
    //   --- Getters ---
    
    public String getMarca(){
        return marca;
    }
    
    public int getTemperaturaMaxima(){
        return temperaturaMaxima;
    }
    
    public int getTemperaturaMinima(){
        return temperaturaMinima;
    }
    
    public int getTmperaturaActual(){
        return temperaturaActual;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public boolean getTurbo(){
        return turbo;
    }
    
    public boolean getAireCaliente(){
        return aireCaliente;
    }
}