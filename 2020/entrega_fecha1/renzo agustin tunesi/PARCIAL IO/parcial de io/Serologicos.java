

public class Serologicos extends Test 
{
 
    private Muestrasangre sangre;
    
    
    public void setMuestrasangre(Muestrasangre sangre){
        this.sangre = sangre;
    }
    
    public Muestrasangre getMuestrasangre(){
        return sangre;
    }
    
    public float calcularTiempo(){
        return 0.25f;
    }
    
    public int sSerologico(){
        return 1;
    }

}
