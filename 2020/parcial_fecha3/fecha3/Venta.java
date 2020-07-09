import java.util.Date;
import java.util.Vector;

public abstract class Venta
{
    private Date fecha;
    private Persona vendedor;
    private Vehiculo vehiculo;
    private Cliente cliente;
    
    public Venta()
    {
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public Persona getVendedor() {
        return vendedor;
    }
    
    public void setVendedor(Persona vendedor) {
        this.fecha = fecha;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public float monto() {
        float monto = vehiculo.calcularPrecioTotal();
        return ajustarMonto(cliente.aplicarDescuento(monto));
    }
    
    public abstract float ajustarMonto(float monto);

    public abstract int sumarContado(int t);
    
    public abstract void agregarContado(Vector<Venta> contados);
}
