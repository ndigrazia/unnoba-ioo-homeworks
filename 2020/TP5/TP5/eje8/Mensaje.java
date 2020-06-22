package eje8;

import java.util.Date;

public class Mensaje {

	private Date fechaCreacion;
	private String texto;
	
	public Mensaje(Date fechaCreacion, String texto) {
		this.fechaCreacion = fechaCreacion;
		this.texto = texto;
	}
	
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
		
}
