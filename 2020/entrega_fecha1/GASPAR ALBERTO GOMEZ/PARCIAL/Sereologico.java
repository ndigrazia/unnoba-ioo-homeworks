
public class Sereologico extends Test
{
    private Muestra muestra;
    private static int duracion = 15;

    public Muestra getMuestra(){ 
        return muestra;
    }
    
    public void setMuestra(Muestra muestra){
        this.muestra=muestra;
    }
    
    public int calcularTiempo(){
        return duracion;
    }
}
