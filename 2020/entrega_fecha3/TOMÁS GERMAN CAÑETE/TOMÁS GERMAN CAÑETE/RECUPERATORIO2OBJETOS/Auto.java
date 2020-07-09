public abstract class Auto
{
    private double preciobase;
    private String marca;
    private String modelo;
    public Auto(String marca, String modelo, double preciobase){
    setMarca(marca);
    setModelo(modelo);
    setPrecioBase(preciobase);
    }
    public void setMarca(String marca){
    this.marca=marca;
    }
    public void setModelo(String modelo){
    this.modelo=modelo;
    }
    public void setPrecioBase(double preciobase){
    this.preciobase=preciobase;
    }
    public String getMarca(){ return this.marca;}
    public String getModelo(){ return this.modelo;}
    public double getPrecioBase(){ return this.preciobase;}
    public abstract double getPrecioTotal();

}
