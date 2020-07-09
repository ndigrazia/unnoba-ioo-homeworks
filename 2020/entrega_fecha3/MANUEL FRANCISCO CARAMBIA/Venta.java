import java.util.Date;
public abstract class Venta
{
    private Vendedor vendedor;
    private Date fecha;
    private Auto auto;
    private Cliente cliente;
    
    public Venta(){
    
    }
    
    public Vendedor getVendedor(){
        return vendedor;
    }
    
    public void setVendedor(Vendedor vendedor){
        this.vendedor=vendedor;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setFecha(Date fecha){
        this.fecha=fecha;
    } 
    
    public Auto getAuto(){
        return auto;
    }
    
    public void setAuto(Auto auto){
        this.auto=auto;
    } 
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setClienteo(Cliente cliente){
        this.cliente=cliente;
    }
    
    public double montoPago(){
        double precio;
        precio=cliente.montoCliente(auto.valorAuto());
        return monto(precio);
    }
    public abstract int ventasContado();
    
    protected abstract double monto(double precio);
}
