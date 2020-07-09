
public class Institucion extends Cliente
{
    public Institucion()
    {
    }
    
    public float aplicarDescuento(float monto){
    return monto - (monto * 0.10f);
   }
}
