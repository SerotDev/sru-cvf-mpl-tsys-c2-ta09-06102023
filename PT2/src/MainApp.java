
public class MainApp {

	public static void main(String[] args) {
		
		// Creamos arrays de videojuegos y de series
		Videojuego array_videojuegos[] = new Videojuego[5];
		Serie array_series[] = new Serie[5];
		
		sv(array_videojuegos, array_series);
		entregaSV(array_videojuegos, array_series);
		entregadosSV(array_videojuegos, array_series);
		printMaxs(array_videojuegos, array_series);
		
	}

	private static void sv(Videojuego[] array_videojuegos, Serie[] array_series) {
		// Llenamos videojuegos
		array_videojuegos[0] = new Videojuego();
		array_videojuegos[1] = new Videojuego("Super mario Bros", 15);
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

	
	private static Videojuego getVideojuegoMayorHoras(Videojuego[] videojuegos) {
		Videojuego videojuegoMaxHours = videojuegos[0];
		
		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegoMaxHours.compareTo(videojuegos[i]) == -1)
				videojuegoMaxHours = videojuegos[i];
		}
		
		return videojuegoMaxHours;
	}
	
	
	private static Serie getSerieMayorTemporadas(Serie[] series) {
		Serie serieMaxTemporadas = series[0];
		
		for (int i = 0; i < series.length; i++) {
			if (serieMaxTemporadas.compareTo(series[i]) == -1)
				serieMaxTemporadas = series[i];
		}
		
		return serieMaxTemporadas;
	}
	
	
	private static void printMaxs(Videojuego[] array_videojuegos, Serie[] array_series) {
		Videojuego maxHoursVideojuego = getVideojuegoMayorHoras(array_videojuegos);
		Serie maxTemporadasSerie = getSerieMayorTemporadas(array_series);
		String maxVideojuego = "\nEl videojuego con más horas de juego es " + maxHoursVideojuego.getTitulo() +  " con " + maxHoursVideojuego.getHorasEstimadas() + " horas estimadas.";
		String maxSerie = "La serie con mas temporadas " + maxTemporadasSerie.getTitulo() +  " con " + maxTemporadasSerie.getTemporadas() + " temporadas.";
		
		System.out.println(maxVideojuego + "\n" + maxSerie);
	}

	private static void entregadosSV(Videojuego[] array_videojuegos, Serie[] array_series) {
		//Cuenta cuantas series y videojuegos hay entregados, al contarlos se devuelven
		System.out.println("SERIES ENTREGADAS:");
		for (int i = 0; i < array_series.length; i++) {
			if (array_series[i].isEntregado()) {
				System.out.println(array_series[i].toString());
			}
		}
		System.out.println("\nVIDEOJUEGOS ENTREGADOS:");
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

}
