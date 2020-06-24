public class cuentaBancaria{
    
    //   --- Atributos descriptivos ---
    
    private String titular, tipoCuenta;
    private int fechaCreacion, maximoExtraccion, numeroTarjeta;
    
    //   --- Atributos funcionales ---

    private float saldo = 0;

    //   --- Constructor ---
    
    public cuentaBancaria(int maximoExtraccion, String titular, int fechaCreacion_Formato_DDMMAAAA_, String tipoCuenta, int numeroTarjeta){
        this.maximoExtraccion = maximoExtraccion;
        this.titular = titular;
        this.fechaCreacion = fechaCreacion_Formato_DDMMAAAA_;
        this.tipoCuenta = tipoCuenta;
        this.numeroTarjeta = numeroTarjeta;
    } // Instancia maximo de extraccion, titular, fecha de creacion, tipo de cuenta y numero de tarjeta.
    
    //   --- Operaciones ---
    
    public void AgregarDinero(float montoAgregado){
        saldo += montoAgregado;
    } // Agrega dinero a la cuenta
    
    public void QuitarDinero(float montoQuitado){
        if (montoQuitado <= maximoExtraccion && saldo - montoQuitado >= 0)
            saldo -= montoQuitado;
    } // Quita dinero, siempre y cuando la cuenta tenga fondos y no supere el limite de extraccion
    
    //   --- Getters ---
    
    public String getTitular(){
        return titular;
    }
    
    public String getTipoCuenta(){
        return tipoCuenta;
    }
    
    public long getFechaCreacion(){
        return fechaCreacion;
    }
    
    public int getMaximoExtracciones(){
        return maximoExtraccion;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public int getNumeroTarjeta(){
        return numeroTarjeta;
    }
}