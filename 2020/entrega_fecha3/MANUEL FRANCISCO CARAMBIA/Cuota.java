
public class Cuota extends Venta

{
    
    public Cuota(){
    
    }
    private double cantCuotas;
    
    public double getCantCuotas(){
        return cantCuotas;
    }
    
    public void setCantCuotas(double cantCuotas){
        this.cantCuotas=cantCuotas;
    } 
    
    public double monto(double precio){
        return precio+precio*cantCuotas*0.05f;
    }
    
    public int ventasContado(){
        return 0;
    }
    
}
