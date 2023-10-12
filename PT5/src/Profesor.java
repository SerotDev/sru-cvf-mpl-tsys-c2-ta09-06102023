
public class Profesor extends Persona {

	private String asignatura = "";

	private final String ASIGNATURA_DEFAULT = "";

	public Profesor(String nombre, int edad, char sexo, String asignatura) {
		super(nombre, edad, sexo);
		this.asignatura = asignatura;
	}

	public Profesor(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
		this.asignatura = ASIGNATURA_DEFAULT;
	}

	public Profesor() {
		super();
		this.asignatura = ASIGNATURA_DEFAULT;
	}

	public Profesor(String asignatura) {
		super();
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public void setAsignatura() {
		this.asignatura = asignatura;
	}

	@Override
	public boolean ausentarse() {

		int rnd = (int) (Math.random() * 5 + 1); // 1/5->20%

		return (rnd == 1);
	}
}
