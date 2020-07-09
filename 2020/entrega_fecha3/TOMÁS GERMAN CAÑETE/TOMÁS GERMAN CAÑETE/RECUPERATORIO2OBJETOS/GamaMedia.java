
public class GamaMedia extends Auto
{
    public GamaMedia(String marca, String modelo, double preciobase)
    {
        super(marca,modelo,preciobase);
    }
     @Override
    public double getPrecioTotal(){
    double preciototal=getPrecioBase();
    return preciototal;
    }
}
