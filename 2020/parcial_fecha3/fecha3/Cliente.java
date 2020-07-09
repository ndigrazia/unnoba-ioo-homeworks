public abstract class Cliente
{
    private String numero;
    
    public Cliente()
    {
    }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public abstract float aplicarDescuento(float monto);

}
