
public class Videojuego implements Entregable {
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;
	
	private static final int HORAS_ESTIMADAS_DEFAULT = 10;
	private static final boolean ENTREGADO_DEFAULT = false;
	

	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = HORAS_ESTIMADAS_DEFAULT;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = "";
		this.compania = "";
		
	}
	
	
	public Videojuego (String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = "";
		this.compania = "";
	}
	
	public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
		this.genero = genero;
		this.compania = compania;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getHorasEstimadas() {
		return horasEstimadas;
	}


	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCompania() {
		return compania;
	}


	public void setCompania(String compania) {
		this.compania = compania;
	}


	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
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
			return Integer.compare(this.horasEstimadas, newVideojuego.getHorasEstimadas());
		}
		if (a instanceof Serie) {
			Serie newSerie = (Serie) a;
			return Integer.compare(this.horasEstimadas, newSerie.getTemporadas());
		}
		return 0;
	}
	
	
	
}
