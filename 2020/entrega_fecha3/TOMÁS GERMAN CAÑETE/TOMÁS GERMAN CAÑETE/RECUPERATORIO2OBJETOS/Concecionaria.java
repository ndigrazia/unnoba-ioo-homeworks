import java.util.Vector;
public class Concecionaria
{
   private Gerente gerente;
   private String nombre;
   private Vector<Venta> ventastotales = new Vector<Venta>();
   private Vector<Contado> ventasalcontado = new Vector<Contado>();
   private Vector<Cuotas> ventasencuotas = new Vector<Cuotas>();
    public Concecionaria(String nombre, Gerente gerente)
    {
      setNombre(nombre);
      setGerente(gerente);
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setGerente(Gerente gerente){
        this.gerente=gerente;
    }
    public Gerente getGerente(){return this.gerente;}
    public String getNombre(){return this.nombre;}
    public double montoAPagarDe(Venta venta){
    return venta.getAPagar();
    }
    public void addVentaContado(Contado contado){
    ventasalcontado.add(contado);
    ventastotales.add(contado);
    }
    public void addVentaCuotas(Cuotas cuotas){
    ventasencuotas.add(cuotas);
    ventastotales.add(cuotas);
    }
    public double montoTotalAPagar(){
        double totalpago=0;
        for(Venta r:ventastotales)
                {
                    totalpago+=r.getAPagar();
                }
                return totalpago; 
    }
    public int cantidadVentasAlContado()
    {
    return ventastotales.size();
     }
}
