
public class Estudiante extends Persona {

	private int calificacion = 0;

	private final int CALIFICACION_DEFAULT = 0;

	public Estudiante(int calificacion) {
		super();
		this.calificacion = calificacion;
	}

	public Estudiante(String name, int edad, char sexo, int calificacion) {
		super(name, edad, sexo);
		this.calificacion = calificacion;
	}

	public Estudiante(String name, int edad, char sexo) {
		super(name, edad, sexo);
		this.calificacion = CALIFICACION_DEFAULT;
	}

	public int getCalificacion() {

		return calificacion;
	}

	public void setCalificacion() {

		this.calificacion = calificacion;
	}

	@Override
	public boolean ausentarse() {

		int rnd = (int) (Math.random() * 2 + 1); // 1/2->50%

		return (rnd == 1);
	}

	@Override
	public String toString() {
		return "Estudiante [calificacion=" + calificacion + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
				+ "]";
	}

}
