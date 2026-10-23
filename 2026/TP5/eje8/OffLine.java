package eje8;

public class OffLine extends Estado {

	@Override
	public void enviarMensaje(Mensajero mensajero, Mensaje mensaje) {
		System.out.println("El mensaje no se puede enviar, el cliente está OffLine");
	}

	@Override
	public void recibirMensaje(Mensajero mensajero, Mensaje mensaje) {
		System.out.println("El cliente no puede recibir mensajes, está OffLine");
	}

}
