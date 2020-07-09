import java.util.Date;
public abstract class Venta
{
    private Date fecha;
    private Persona vendedor;
    private Auto auto;
    private Cliente cliente;
    private int cantidadcuotas;
    public Venta(Date fecha, Persona vendedor)
    {
        setFecha(fecha);
        setVendedor(vendedor);
    }
    public void setFecha(Date fecha){
        this.fecha=fecha;
    }
    public void setVendedor(Persona vendedor){
        this.vendedor=vendedor;
    }
    public Persona getVendedor(){return this.vendedor;}
    public Date getFecha(){return this.fecha;}
    public abstract int getCantidadCuotas();
    public double getAPagar()
     {
        double apagar=auto.getPrecioTotal();
        if (cliente.getEsPersona()==false)
        {
            apagar-=apagar*0.10;
        }
        apagar+=apagar*(0.05*getCantidadCuotas());
     return apagar;
     }
}
