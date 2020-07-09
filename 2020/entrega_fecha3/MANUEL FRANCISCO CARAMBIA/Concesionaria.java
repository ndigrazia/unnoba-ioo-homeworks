import java.util.Vector;

public class Concesionaria
{
    private Gerente gerente;
    private Vector<Venta> ventas = new Vector<Venta>();
    private Vector<Venta> ventasAlContado=new Vector<Venta>();
    
    public Concesionaria(){
    
    }
    
    public Gerente getGerente(){
        return gerente;
    }
    
    public void setGerente(Gerente gerente){
        this.gerente=gerente;
    }
    
    
     /*Retorna el monto a pagar de la venta que se pasa como parámetro*/
    public double montoAPagarDe(Venta venta){
        
        return venta.montoPago();
    }

    /*Retorna el monto a total pagar de todas las ventas*/
    public double montoTotalAPagar(){
        float total=0;
        for (Venta venta: ventas){
            total+=venta.montoPago();
        }
        return total;
    }
    /*Retorna la cantidad de ventas realizadas al contado*/
    public int cantidadVentasAlContado(){
        int cantidad=0;
        for(Venta venta:ventas){
            cantidad+=venta.ventasContado();
            if (venta.ventasContado()==1)
                ventasAlContado.add(venta);
                
        }
        return cantidad;
    }
    
    /* Retorna una colección con todas las ventas al contado */
    public Vector<Venta> collectVentasAlContado() {    
        for (Venta v: ventasAlContado){
            v.ventasContado();
        }
        return ventasAlContado;
    }

}


