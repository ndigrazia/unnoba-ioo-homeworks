package eje8;

public class OnLine extends Estado {

	@Override
	public void enviarMensaje(Mensajero mensajero, Mensaje mensaje) {
		mensajero.addMensajeEnviado(mensaje);
	}

	@Override
	public String recibirMensaje(Mensajero mensajero, Mensaje mensaje) {
		mensajero.addMensajeRecibido(mensaje);
		return "OK.";
	}

}
