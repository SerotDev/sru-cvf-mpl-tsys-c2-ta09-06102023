
public class MainApp {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Mi Película", 120, 18, "Director X");
        Cine cine = new Cine(pelicula, 10.0);

        for (int i = 1; i <= 20; i++) {
            String nombre = "Espectador" + i;
            int edad = (int) (Math.random() * 50) + 10;
            double dinero = Math.random() * 50 + 5;

            Espectador espectador = new Espectador(nombre, edad, dinero);
            cine.sentarEspectador(espectador);
        }
	}

}
