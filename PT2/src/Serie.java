public class Serie extends Producto {
  
	private int temporadas;
	private String creador;
	
	private static final int HORAS_ESTIMADAS_DEFAULT = 3;
	private static final boolean ENTREGADO_DEFAULT = false;
	
	public Serie() {
		super("", ENTREGADO_DEFAULT, "");
		this.temporadas  = HORAS_ESTIMADAS_DEFAULT;
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		super(titulo, ENTREGADO_DEFAULT, "");
		this.temporadas = HORAS_ESTIMADAS_DEFAULT;
		this.creador = creador;
	}
	
	public Serie(String titulo, int temporadas, boolean entregado, String genero, String creador) {
		super(titulo, entregado, genero);
		this.temporadas = temporadas;
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
	
	@Override
	public int compareTo(Object a) {
        if (a instanceof Serie) {
            Serie newSerie = (Serie) a;
            return Integer.compare(this.temporadas, newSerie.getTemporadas());
        }
        return 0;
    }

}

