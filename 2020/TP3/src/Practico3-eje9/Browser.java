import java.util.List;
import java.util.ArrayList;

public class Browser
{
    private List<String> favoritos = new ArrayList<String>();
    
    private List<Pagina> historial = new ArrayList<Pagina>();
    
    private Pagina paginaActual;
    
    public Browser()
    {
    }

    public void setPaginaActual(Pagina pagina) {
        paginaActual = pagina;
        agregarHistorial(pagina);
    }
    public Pagina getPaginaActual() {
        return paginaActual;
    }
    
    public void agregarFavoritos(String url) {
        favoritos.add(url);
    }
    public void removerFavoritos(String url) {
        favoritos.remove(url);
    }
    
    public void agregarHistorial(Pagina pagina) {
        historial.add(pagina);
    }
    public void removerHistorial(Pagina pagina) {
        historial.remove(pagina);
    }
    
    public void borrarHistorial() {
        historial.clear();
    }

    public int cantidadPaginasVisitadas() {
        return historial.size();
    }

    public Pagina ultimaPaginaVisitada() {
        return historial.get(cantidadPaginasVisitadas()-1);
    }

}
