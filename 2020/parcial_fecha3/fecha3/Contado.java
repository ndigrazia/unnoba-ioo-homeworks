import java.util.Vector;

public class Contado extends Venta
{
    private float descuento;
    
    public Contado()
    {
    }
    
    public float ajustarMonto(float monto) {
        return monto - descuento;
    }   
    
    public float getDescuento() {
        return descuento;
    }
    
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    public int sumarContado(int t) {
        return t +1;
    }
    
    public void agregarContado(Vector<Venta> contados) {
        contados.add(this);
    }
    
}
