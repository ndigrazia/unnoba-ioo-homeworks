package eje8;

import java.util.Vector;

public class Mensajero {
	
	private Vector<Mensaje> enviados = new Vector<Mensaje>();
	private Vector<Mensaje> recibidos = new Vector<Mensaje>();
	
	private Estado estado;
	
	public void addMensajeEnviado(Mensaje m) {
		enviados.add(m);
	}
	public void removeMensajeEnviado(Mensaje m) {
		enviados.remove(m);
	}
	
	public void addMensajeRecibido(Mensaje m) {
		recibidos.add(m);
	}
	public void removeMensajeRecibido(Mensaje m) {
		recibidos.remove(m);
	}
	
	public void enviarMensaje(Mensaje m) {
		estado.enviarMensaje(this, m);
	}
	
	public String recibirMensaje(Mensaje m) {
		return estado.recibirMensaje(this, m);
	}
	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
