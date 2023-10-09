//PT2
public class Serie {

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
	
	public Serie(String titulo, String creador) {
		
		this.titulo = titulo;
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}
	
	public Serie(String titulo, int temporadas, boolean entregado, String genero, String creador) {
		
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
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

}
