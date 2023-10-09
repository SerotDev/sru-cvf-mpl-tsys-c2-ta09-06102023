import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
		// Creamos arrays de videojuegos y de series
		Videojuego array_videojuegos[] = new Videojuego[5];
		Serie array_series[] = new Serie[5];
		
		// Llenamos videojuegos
		array_videojuegos[0] = new Videojuego();
		array_videojuegos[1] = new Videojuego("Super mario Bros", 150);
		array_videojuegos[2] = new Videojuego("Super mario Bros 2", 50);
		array_videojuegos[3] = new Videojuego("Zelda BOTW", 200, false, "Open World", "Nintendo");
		array_videojuegos[4] = new Videojuego("Zelda TOTK", 290, false, "Open World", "Nintendo");
		
		// Llenamos series
		array_series[0] = new Serie();
		array_series[1] = new Serie("Cosas Extrañas", "Netflix");
		array_series[2] = new Serie("Dark", "Netflix");
		array_series[3] = new Serie("Futurama", 11, false, "Sci-Fi", "Disney");
		array_series[4] = new Serie("The Mandalorian", 2, false, "Sci-Fi", "Disney");
		
		// Entregamos algunas series y videojuegos (entregamos impares)
		for (int i = 0; i < array_series.length; i++) {
			if ((i+1)%2 == 0) {
				array_videojuegos[i].entregar();
				array_series[i].entregar();
			}
		}
		
		//Cuenta cuantas series y videojuegos hay entregados, al contarlos se devuelven
		System.out.println("SERIES ENTREGADAS:");
		for (int i = 0; i < array_series.length; i++) {
			if (array_series[i].isEntregado()) {
				System.out.println(array_series[i].toString());
			}
		}
		System.out.println("VIDEOJUEGOS ENTREGADOS:");
		for (int i = 0; i < array_videojuegos.length; i++) {
			if (array_videojuegos[i].isEntregado()) {
				System.out.println(array_videojuegos[i].toString());
			}
		}
		
		// Mostramos el videojuego con mas horas y la serie con más temporadas
		
		serieTemporadas = null;
		
		for (Serie serie : series) {
			
			if (serie != null && serie.isEntregado()) {
				if (serieTemporadas == null || serie.compareTo(serieTemporadas) > 0) {
					serieTemporadas = serie;
				}
			}
		}
		
		return serieTemporadas;
		
		System.out.println(serieTemporadas);
		
	}

}
