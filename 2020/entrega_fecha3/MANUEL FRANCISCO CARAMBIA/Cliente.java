
public abstract class Cliente
{
    private int numeroCliente;
    private double descuento;
    
    public Cliente(){
    }
    
    public int getNumerCliente(){
        return numeroCliente;
    }
    
    public void setNumeroCliente(){
        this.numeroCliente=numeroCliente;
    }
    public double getDescuento(){
        return descuento;
    }
    
    public void setDescuento(double descuento){
        this.descuento=descuento;
    }
    abstract public double montoCliente(double precio);
}