import java.util.ArrayList;
import java.util.List;

public class Observado {

	private List<Observador> observadores = new ArrayList<Observador>();
	
	public void suscribir(Observador o) {
		observadores.add(o);
	}
	
	public void quitar(Observador o) {
		observadores.remove(o);
	}
	
	public void notificar() {
		for(Observador o: observadores)
			o.actualizar(this);
	}
	
}
