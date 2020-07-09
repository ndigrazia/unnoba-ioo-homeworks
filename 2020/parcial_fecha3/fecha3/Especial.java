
public class Especial extends Vehiculo
{
    private float descuento;
    
    public Especial()
    {
    }

    public float calcularPrecioTotal() {
        return getPrecio() - descuento;
    }
    
    public float getDescuento() {
        return descuento;
    }
    
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
}
