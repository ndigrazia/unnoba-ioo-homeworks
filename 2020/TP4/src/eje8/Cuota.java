package eje8;

public class Cuota extends Cobro {

	public float montoAPagarBien(Moto moto) {
		return moto.getValorFiscal();
	}

	public float montoAPagarBien(Auto auto) {
		return auto.getValorFiscal()*0.05f;
	}
	
	public float montoAPagarBien(Inmueble inmueble) {
		return inmueble.getValorFiscal()*0.02f;
	}

	public float montoAPagarBien(Embarcacion embarcacion) {
		return embarcacion.getValorFiscal()*0.03f;
	}
}
