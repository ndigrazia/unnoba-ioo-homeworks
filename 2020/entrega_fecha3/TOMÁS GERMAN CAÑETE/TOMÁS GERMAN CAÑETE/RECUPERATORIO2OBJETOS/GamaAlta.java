
public class GamaAlta extends Auto
{
    private double IMPUESTO=0.25;
    
    public GamaAlta(String marca, String modelo, double preciobase)
    {
        super(marca,modelo,preciobase);
    }
    public double getImpuesto(){
    return IMPUESTO;
    }
    @Override
    public double getPrecioTotal(){
    double preciototal=getPrecioBase();
    preciototal+=preciototal*getImpuesto();
    return preciototal;
    }
}
