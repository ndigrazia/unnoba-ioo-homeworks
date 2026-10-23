package eje8;

public class Away extends Estado {

    @Override
    public void enviarMensaje(Mensajero mensajero, Mensaje mensaje) {
        mensajero.addMensajeEnviado(mensaje);
    }

    @Override
    public void recibirMensaje(Mensajero mensajero, Mensaje mensaje) {
        System.out.println("El cliente no puede recibir mensajes, está Away");
    }

}
