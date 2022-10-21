import java.util.*;

public class Editor
{
    private List<Figura> figuras = new ArrayList<Figura>();

    public Editor()
    {
    }
    
    public void addFigura(Figura f){
        figuras.add(f);
    }

    public void removeFigura(Figura f){
        figuras.remove(f);
    }
    
    public int cantidadFiguras(){
        return 0;
    }

}
