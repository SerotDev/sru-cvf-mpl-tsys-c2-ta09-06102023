
public class Videojuego extends Producto {
	
	private int horasEstimadas;
	private String compania;
	
	private static final int HORAS_ESTIMADAS_DEFAULT = 10;
	private static final boolean ENTREGADO_DEFAULT = false;
	

	public Videojuego() {
		super("", ENTREGADO_DEFAULT, "");
		this.titulo = "";
		this.horasEstimadas = HORAS_ESTIMADAS_DEFAULT;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = "";
		this.compania = "";
	}
	
	
	public Videojuego (String titulo, int horasEstimadas) {
		super(titulo, ENTREGADO_DEFAULT, "");
		this.horasEstimadas = horasEstimadas;
		this.compania = "";
	}
	
	public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compania) {
		super(titulo, ENTREGADO_DEFAULT, genero);
		this.horasEstimadas = horasEstimadas;
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

	@Override
	public int compareTo(Object a) {
        if (a instanceof Videojuego) {
            Videojuego newVideojuego = (Videojuego) a;
            return Integer.compare(this.horasEstimadas, newVideojuego.getHorasEstimadas());
        }
        return 0;
    }
	
}
