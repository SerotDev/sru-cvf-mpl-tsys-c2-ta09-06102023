
public class MainApp {

	public static void main(String[] args) {
		Libro libro1 = new Libro("‎8498382548", "El niño del pijama de rayas", "John Boyne", 224);
		Libro libro2 = new Libro("9788401352348", "El nombre del viento","Patrick Rothfuss", 880);
		
		mensajeCompareLibros(libro1, libro2);

	}
	
	public static void mensajeCompareLibros(Libro libro1, Libro libro2) {
		if (libro1.compareTo(libro2) < 0) {
			System.out.println("El libro " + libro2.getTitulo() + " tiene más paginas que el libro " + libro1.getTitulo());
		} else if(libro1.compareTo(libro2) > 0){
			System.out.println("El libro " + libro1.getTitulo() + " tiene más paginas que el libro " + libro2.getTitulo());
		} else {
			System.out.println("El libro " + libro1.getTitulo() + " y el libro " + libro2.getTitulo() + " tienen el mismo numero de páginas");
		}
	}

}
