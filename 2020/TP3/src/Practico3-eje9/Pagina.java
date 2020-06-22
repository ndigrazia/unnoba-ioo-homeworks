import java.util.Date;

public class Pagina
{
    private String url;
    private String html;
    private Date fechaVisita;
    
    //TODO Agregar los atributos que consideren
    
    public Pagina()
    {
    }

    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return url;
    }
    
    public void setHtml(String html){
        this.html = html;
    }
    public String getHtml(){
        return html;
    }

    public void setFechaVisita(Date fechaVisita){
        this.fechaVisita = fechaVisita;
    }
    public Date getFechaVisita(){
        return fechaVisita;
    }
    
    //TODO Agregar los getters/setters que consideren
}
