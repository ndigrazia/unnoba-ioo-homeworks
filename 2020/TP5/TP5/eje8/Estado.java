package eje8;

public abstract class Estado {

	public abstract void enviarMensaje(Mensajero mensajero, Mensaje mensaje);
	
	public abstract String recibirMensaje(Mensajero mensajero, Mensaje mensaje);
}
