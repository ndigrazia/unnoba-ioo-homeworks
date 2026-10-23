package eje7;

public class Archivo extends Nodo {

	private int peso;

	Archivo(String nombre, int peso) {
		super(nombre);
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	@Override
	public void addNodo(Nodo e) {
		throw new UnsupportedOperationException();
	}
	@Override
	public void removeNodo(Nodo e) {
		throw new UnsupportedOperationException();
	}
		
}
