import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
		
		// Creamos arrays de videojuegos y de series
		Videojuego array_videojuegos[] = new Videojuego[5];
		Serie array_series[] = new Serie[5];
		
		sv(array_videojuegos, array_series);
		
		entregaSV(array_videojuegos, array_series);
		
		entregadosSV(array_videojuegos, array_series);
		
		muestraSV(array_videojuegos, array_series);
		
	}

	private static void sv(Videojuego[] array_videojuegos, Serie[] array_series) {
		// Llenamos videojuegos
		array_videojuegos[0] = new Videojuego();
		array_videojuegos[1] = new Videojuego("Super mario Bros", 150);
		array_videojuegos[2] = new Videojuego("Super mario Bros 2", 50);
		array_videojuegos[3] = new Videojuego("Zelda BOTW", 200, false, "Open World", "Nintendo");
		array_videojuegos[4] = new Videojuego("Zelda TOTK", 290, false, "Open World", "Nintendo");
		
		// Llenamos series
		array_series[0] = new Serie();
		array_series[1] = new Serie("Stranger Things", "Netflix");
		array_series[2] = new Serie("Dark", "Netflix");
		array_series[3] = new Serie("Futurama", 11, false, "Sci-Fi", "Disney");
		array_series[4] = new Serie("The Mandalorian", 2, false, "Sci-Fi", "Disney");
	}

	private static void muestraSV(Videojuego[] array_videojuegos, Serie[] array_series) {
		// Mostramos el videojuego con mas horas y la serie con más temporadas
		int posicion_mayor = 0;
		int valor_mayor = -1;
		for (int i = 0; i < array_series.length; i++) {
			if (array_series[i].getTemporadas() > valor_mayor) {
				valor_mayor = array_series[i].getTemporadas();
				posicion_mayor = i;
			}
		}
		System.out.println("SERIE CON TEMPORADA MAYOR:\n" + array_series[posicion_mayor].toString());
		posicion_mayor = 0; //reseteamos variable
		valor_mayor = -1; //reseteamos variable
		for (int i = 0; i < array_videojuegos.length; i++) {
			if (array_videojuegos[i].getHorasEstimadas() > valor_mayor) {
				valor_mayor = array_videojuegos[i].getHorasEstimadas();
				posicion_mayor = i;
			}
		}
		System.out.println("VIDEOJUEGO CON HORAS ESTIMADAS MAYOR:\n" + array_videojuegos[posicion_mayor].toString());
	}

	private static void entregadosSV(Videojuego[] array_videojuegos, Serie[] array_series) {
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
	}

	private static void entregaSV(Videojuego[] array_videojuegos, Serie[] array_series) {
		// Entregamos algunas series y videojuegos (entregamos impares)
		for (int i = 0; i < array_series.length; i++) {
			if ((i+1)%2 == 0) {
				array_videojuegos[i].entregar();
				array_series[i].entregar();
			}
		}
	}
	
	private static int compareSerie(Serie[] array_series) {
		
		int compare = 0;
		
		for (int i = 0; i < array_series.length; i++) {
			
		
		}

		
		return compare;
		
	}

}
