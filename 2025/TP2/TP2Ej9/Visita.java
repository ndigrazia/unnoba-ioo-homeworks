import java.util.Date;

public class Visita {
    private Date fechaVisita;
    private Persona visitante;
    private Museo museo;
    private ObraDeArte obraDestacada;

    public Visita(Date fechaVisita, Persona visitante, Museo museo, ObraDeArte obraDestacada) {
        this.fechaVisita = fechaVisita;
        this.visitante = visitante;
        this.museo = museo;
        this.obraDestacada = obraDestacada;
    }

    // Getters y Setters
    public Date getFechaVisita() { return fechaVisita; }
    public void setFechaVisita(Date fechaVisita) { this.fechaVisita = fechaVisita; }

    public Persona getVisitante() { return visitante; }
    public void setVisitante(Persona visitante) { this.visitante = visitante; }

    public Museo getMuseo() { return museo; }
    public void setMuseo(Museo museo) { this.museo = museo; }

    public ObraDeArte getObraDestacada() { return obraDestacada; }
    public void setObraDestacada(ObraDeArte obraDestacada) { this.obraDestacada = obraDestacada; }
}