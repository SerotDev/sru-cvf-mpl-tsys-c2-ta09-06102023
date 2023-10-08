
public class Serie implements Entregable {

	public String titulo;
	public int temporadas;
	public boolean entregado;
	public String genero;
	public String creador;
	
	public Serie() {
		
		this.titulo = "";
		this.temporadas  = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
		
	}
	
	public Serie(String titulo, int temporadas, boolean entregado, String genero, String creador) {
		
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
	Serie defecto = new Serie();
	Serie dark = new Serie("Dark", temporadas, entregado, genero, "Random");
	Serie darki = new Serie("Dark", 5, entregado, "Drama", "Random");
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	@Override
	public String toString() {
		return "Serie [titulo= " + titulo + ", temporadas= " + temporadas + ", entregado= " + entregado + ", genero= "
				+ genero + ", creador= " + creador + "]";
	}
	
	public void entregar() {
		this.entregado = true;
	}
	
	public void devolver() {
		this.entregado = false;
	}
	
	public boolean isEntregado() {
		return this.entregado;
	}
	
	public int compareTo(Object a) {
		if (a instanceof Videojuego) {
			Videojuego newVideojuego = (Videojuego) a;
			return Integer.compare(this.temporadas, newVideojuego.getHorasEstimadas());
		}
		if (a instanceof Serie) {
			Serie newSerie = (Serie) a;
			return Integer.compare(this.temporadas, newSerie.getTemporadas());
		}
		return 0;
	}

}
