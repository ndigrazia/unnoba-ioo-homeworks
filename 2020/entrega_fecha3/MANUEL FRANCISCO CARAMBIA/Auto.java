

public abstract class Auto
{
    private String Marca;
    private String Modelo;
    private double precioBase;

    public Auto(){
    
    }
    public String getMarca(){
        return Marca;
    }
    
    public void setMarca(String Marca){
        this.Marca=Marca;
    }
    
    public double getPrecioBase(){
        return precioBase;
    }
    
    public void setPrecioBase(double precioBase){
        this.precioBase=precioBase;
    }
    
    
    public abstract double valorAuto();
}
