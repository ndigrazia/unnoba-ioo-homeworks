
public class Serologico extends Test
{
    private MuestraSangre muestra;
    
    public void setMuestra(MuestraSangre unaMuestra){
        this.muestra = unaMuestra;
    }
    
    public MuestraSangre getMuestra(){
        return muestra;
    }
    
    public int tiempoTest(){
        return 15;
    }
}
