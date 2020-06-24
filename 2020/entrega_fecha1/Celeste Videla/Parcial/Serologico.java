public class Serologico extends Test
{
    private static final double TIEMPO = 15;//minutos
    private String tipoSangre;
    private boolean factor;
    
    public int es_Serologico(){return 1;} 
    
    public void setTipoSangre(String tipoSangre){this.tipoSangre=tipoSangre;}
    public String getTipoSangre(){return tipoSangre;}
    
    public void setFactor(boolean factor){this.factor=factor;}
    public boolean getFactor(){return factor;}
    
    public double TiempoTest(){
        return TIEMPO;
    }
}
