import java.util.Iterator;

public class Cine {

	private Pelicula pelicula;
	private double precio;
	private int filas;
	private int columnas;
	private Asiento[][] asientos;
	
	private static final int DEFAULT_FILAS = 8;
	private static final int DEFAULT_COLUMNAS = 9;
	
	public Cine() {
		this.filas = DEFAULT_FILAS;
		this.columnas = DEFAULT_COLUMNAS;
		asientos = new Asiento[this.filas][this.columnas];
		
		for (int fila = 0; fila < this.filas; fila++) {
			for (int columna = 0; columna < this.columnas; columna++) {
				char letra = (char) ('A' + columna);
				asientos[fila][columna] = new Asiento(fila + 1, letra);
			}
		}
	}
}
