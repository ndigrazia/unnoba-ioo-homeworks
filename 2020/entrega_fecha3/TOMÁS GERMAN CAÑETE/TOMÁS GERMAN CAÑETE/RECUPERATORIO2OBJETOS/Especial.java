
public class Especial extends Auto
{
    private int IMPUESTO;
    public Especial(String marca, String modelo, double preciobase)
    {
        super(marca,modelo,preciobase);
    }
    public void setImpuesto(int IMPUESTO){
    this.IMPUESTO=IMPUESTO;}
    public int getImpuesto(){return this.IMPUESTO;}
    
    @Override
    public double getPrecioTotal(){
    double preciototal=getPrecioBase();
    preciototal+=preciototal*getImpuesto();
    return preciototal;
    }
}
