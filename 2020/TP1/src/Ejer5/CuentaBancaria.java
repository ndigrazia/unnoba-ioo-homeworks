import java.util.Date;

public class CuentaBancaria
{
    private static final int MAX_EXT_DEFECTO = 10;
    
    private float saldo;
    private Date fechaCreacion;
    private String titular;
    private int maxExtracciones;
    
    public CuentaBancaria(String titular, int maxExt)
    {
        this.maxExtracciones = maxExt;
        this.titular = titular;
    }
    
    public CuentaBancaria(String titular)
    {
        this(titular, MAX_EXT_DEFECTO);
    }

    public int getMaxExtracciones() {
        return maxExtracciones;
    }
    
    public void setMaxExtracciones(int maxExtracciones) {
        this.maxExtracciones = maxExtracciones;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public void depositar(float monto){ 
        saldo+=monto;
    }

    public void extraer(float monto){ 
        if(maxExtracciones > 0) {
            saldo-=monto;
            maxExtracciones--;
        }
    }

    public float getSaldo() {
        return saldo;
    }

}
