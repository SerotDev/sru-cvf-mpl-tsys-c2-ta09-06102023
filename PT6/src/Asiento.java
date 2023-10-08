
public class Asiento {
	
	private char columna;
	private int fila;
	private boolean ocupado;
	
	public Asiento(int fila, char columna) {
		this.fila = fila;
		this.columna = columna;
		this.ocupado = false;
	}
	
	
	public char getColumna() {
		return this.columna;
	}
	
	public int getFila() {
		return this.fila;
	}
	
	public boolean isOcupado() {
		return this.ocupado;
	}
	
	public void ocupar() {
		this.ocupado = true;
	}
	
	public void desocupar() {
		this.ocupado = false;
	}
}
