public class Serologico extends Test{
    
    private MuestraDeSangre muestra;
    
    public Serologico(MuestraDeSangre muestra){
        this.muestra = muestra;
    }
    
    public int getTiempo(){
        return 15;
    }
    
    public boolean testSerologico(){
        return true;
    }
}
