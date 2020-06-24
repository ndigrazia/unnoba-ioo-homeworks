import java.util.Date;

public class Resultado 

{
    private Date fecha;
    private Test tes;
    private Boolean Valor;
    private Institucion instituciones;
    
    
    public Resultado()
    {
    } 
    public Date getFecha() {
		return fecha;
	}
    public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
    public Test getTes() {
		return tes;
	}
    public void setTes(Test tes) {
		this.tes = tes;
	}
    public Boolean getValor() {
		return Valor;
	}
    public void setValor(Boolean valor) {
		this.Valor = valor;
	}
     public Institucion getinstituciones() {
		return instituciones;
	}
    public void setInstitucion(Institucion instituciones) {
		this.instituciones = instituciones;
	}
     public double tiempoTarda(){
        return getTes().calcularTiempo();
        
    }
    
    public int sereologico(){
        //COMPILAR
        return 0;
        
       // return getTes().esSereologico();
        
    }

}