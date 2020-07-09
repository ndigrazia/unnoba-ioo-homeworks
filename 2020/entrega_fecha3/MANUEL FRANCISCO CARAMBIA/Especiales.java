
public class Especiales extends Auto
{
    
    public Especiales(){
    
    }
    private double descuento;
    
    public double getDescuento(){
        return descuento;
    }
    
    public void setDescuento(double descuento){
        this.descuento=descuento;
    }
    @Override
	public double valorAuto() {
		return getPrecioBase()-getPrecioBase()*descuento;
	}
}
