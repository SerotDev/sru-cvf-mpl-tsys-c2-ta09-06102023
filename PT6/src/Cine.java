import java.util.Random;

public class Cine {

	private Pelicula pelicula;
	private double precio;
	private int filas;
	private int columnas;
	private Asiento[][] asientos;
	
	private static final int DEFAULT_FILAS = 8;
	private static final int DEFAULT_COLUMNAS = 9;
	
	public Cine(Pelicula pelicula, double precio) {
		this.filas = DEFAULT_FILAS;
		this.columnas = DEFAULT_COLUMNAS;
		this.pelicula = pelicula;
		this.precio = precio;
		asientos = new Asiento[this.filas][this.columnas];
		
		for (int fila = 0; fila < this.filas; fila++) {
			for (int columna = 0; columna < this.columnas; columna++) {
				char letra = (char) ('A' + columna);
				asientos[fila][columna] = new Asiento(fila + 1, letra);
			}
		}
	}
	
	public void sentarEspectador(Espectador espectador) {
		Random rand = new Random();
		boolean sentado = false;
		
		while (!sentado) {
			int fila = rand.nextInt(this.filas);
			int columna = rand.nextInt(this.columnas);
			
			Asiento asiento = asientos[fila][columna];
			if (!asiento.isOcupado() && espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precio) {
				asiento.ocupar();
				System.out.println(espectador.getNombre() + " ha ocupado el asiento " + asiento.getFila() + asiento.getColumna());
				sentado = true;
			}
			
			if (espectador.getEdad() < pelicula.getEdadMinima() || espectador.getDinero() < precio) {
				System.out.println(espectador.getNombre() + " no ha ocupado ningun asiento, no cumple con los requisitos edad " + pelicula.getEdadMinima() + "/" +  espectador.getEdad() + " dinero " + precio +  "/" +  espectador.getDinero());
				break;
			}
			
		}
	}
	
}
