package eje8;

public class OffLine extends Estado {

	@Override
	public void enviarMensaje(Mensajero mensajero, Mensaje mensaje) {
	}

	@Override
	public String recibirMensaje(Mensajero mensajero, Mensaje mensaje) {
		return  "Este es un mensaje automático: el cliente no está disponible momentáneamente";
	}

}
