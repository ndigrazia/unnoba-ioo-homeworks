
public class Contado extends Venta
{
    
    public Contado(){
    
    }
    private double descuento;
    
    public double getDescuento(){
        return descuento;
    }
    
    public void setDescuento(double descuento){
        this.descuento=descuento;
    }

    public double monto(double precio){
        return precio-descuento;
    }
    
    public int ventasContado(){
        return 1;
    }
 }
