import java.util.Vector;

public class Cuota extends Venta
{
    private int cantidad;
    
    public Cuota()
    {
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
      
    public float ajustarMonto(float monto) {
        return monto + (monto * ((5 * cantidad)/100));
    }   
    
    public int sumarContado(int t) {
        return t;
    }

    public void agregarContado(Vector<Venta> contados) {
    }
}
