
public abstract class Producto implements Entregable {

	protected int horasEstimadas;
	protected String titulo;
	protected boolean entregado;
	protected String genero;

	public void entregar() {
		this.entregado = true;
	}
	
	public void devolver() {
		this.entregado = false;
	}
	
	public boolean isEntregado() {
		return this.entregado;
	}
	 
	 public abstract int compareTo(Object a);

		
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
}
