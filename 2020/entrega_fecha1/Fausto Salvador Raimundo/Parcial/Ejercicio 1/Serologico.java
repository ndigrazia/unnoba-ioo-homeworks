public class Serologico extends Test
{
    private MuestraSangre muestra;
    
    public Serologico(){
    }
    
    public double tiempo(){return 15.0;}
    
    public void setMuestra(MuestraSangre m){
        muestra=m;}
    public MuestraSangre getMuestra(){return muestra;}
}
