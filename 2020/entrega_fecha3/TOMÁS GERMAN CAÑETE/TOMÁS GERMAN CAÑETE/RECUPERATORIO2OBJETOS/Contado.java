import java.util.Date;
public class Contado extends Venta
{
    public Contado(Date fecha, Persona vendedor)
    {
        super(fecha,vendedor);
    }
    @Override
    public int getCantidadCuotas()
    {
        return 0;
    }
}
