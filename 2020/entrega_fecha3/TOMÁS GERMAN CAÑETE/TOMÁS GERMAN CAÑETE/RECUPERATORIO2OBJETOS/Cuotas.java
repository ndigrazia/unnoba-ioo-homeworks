import java.util.Date;
public class Cuotas extends Venta
{
    private int CANTIDADCUOTAS;
    public Cuotas(Date fecha, Persona vendedor)
    {
        super(fecha,vendedor);
    }
    public void setCantidadCuotas(int cuotas){
    this.CANTIDADCUOTAS=cuotas;
    }
    
    @Override
    public int getCantidadCuotas()
    {
        return this.CANTIDADCUOTAS;
    }

}
