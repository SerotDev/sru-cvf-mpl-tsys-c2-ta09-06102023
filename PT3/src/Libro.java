
public class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	private int numeroDePaginas;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	
	@Override
	public String toString() {
		return "el libro con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numeroDePaginas + " páginas.";
	}
}
