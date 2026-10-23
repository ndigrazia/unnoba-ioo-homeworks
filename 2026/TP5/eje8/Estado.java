package eje8;

public abstract class Estado {

	public abstract void enviarMensaje(Mensajero mensajero, Mensaje mensaje);
	
	public abstract void recibirMensaje(Mensajero mensajero, Mensaje mensaje);
}
