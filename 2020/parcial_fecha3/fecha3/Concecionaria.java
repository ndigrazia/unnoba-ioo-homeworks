import java.util.Vector;

public class Concecionaria
{
    private Vector<Venta> ventas = new Vector<Venta>();
    
    private Persona gerente;
    
    public Concecionaria()
    {
    }

    public Persona getGerente() {
        return gerente;
    }
    
    public void setGerente(Persona gerente) {
        this.gerente = gerente;
    }
    
    public void addVenta(Venta v) {
        ventas.add(v);
    }
   
    public double montoAPagarDe(Venta venta){
        return venta.monto();
    }
    
    public double montoTotalAPagar() {
        float t = 0;
        for(Venta v:ventas){
            t+= v.monto();
        }
        
        return t;
    }
    
    public int cantidadVentasAlContado() {
        int t = 0;
         
        for(Venta v:ventas){
            t+= v.sumarContado(t);
        }
        
        return t;
    }
    
    public Vector<Venta> collectVentasAlContado() {
        Vector<Venta> contados = new Vector<Venta>();
         
        for(Venta v:ventas){
            v.agregarContado(contados);
        }
        
        return contados;
    }
}
