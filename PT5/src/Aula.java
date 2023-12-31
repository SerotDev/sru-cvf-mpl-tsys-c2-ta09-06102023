import java.util.ArrayList;
import java.util.List;

public class Aula {
	private int id;
	private int maxAlumnos;
	private String asignatura;
	private Profesor profesor;
	private List<Estudiante> alumnos;
	private static int counter = 0;
	
	
	private final int DEFAULT_MAX_ALUMNOS = 0;
	private final String DEFAULT_ASIGNATURA = "";

	public Aula() {
		this.id = counter;
		this.maxAlumnos = DEFAULT_MAX_ALUMNOS;
		this.asignatura = DEFAULT_ASIGNATURA;
		this.profesor = new Profesor();
		this.alumnos = new ArrayList<Estudiante>();
		counter++;
	}

	public Aula(int maxAlumnos, String asignatura, Profesor profesor, List<Estudiante> estudiantes) {
		this.id = counter;
		this.maxAlumnos = maxAlumnos;
		this.asignatura = asignatura;
		this.profesor = profesor;
		this.alumnos = estudiantes;
		counter++;
	}
	
	
	public boolean checkCondicionesClase() {
		// el profesor imparte la misma asignatura que la clase asignatura
		if(!profesorImparteAsignatura()) {
			System.out.println("ERROR: La asignatura del profesor y la asignatura de la clase no coinciden");
			return false;
		}
		
		//profesor !ausentarse() 
		if (!profesor.ausentarse()) {
			System.out.println("ERROR: El profesor esta ausente.");
			return false;
		}
		
		// alumnos (mas un 50% no se da clase
		if (masDe50Por100AlumnosAusentes()) {
			System.out.println("ERROR: El minimo de alumnos por clase no se cumple D:");
			return false;
		}
		return true;
	}
	
	public boolean masDe50Por100AlumnosAusentes() {
		int ausenciasTotales = 0;
		
		for (Estudiante estudiante : alumnos) {
			if (estudiante.ausentarse())
				ausenciasTotales++;
		}
		return ((alumnos.size()/2) < ausenciasTotales);
	}

	public void darClase() {
		
		if(checkCondicionesClase()) {
			System.out.println("Se puede dar clase");
			System.out.println("Alumnos en clase: ");
			printAlumnos();
		} else 
			System.out.println("No se puede dar clase, no cumples con las condiciones");
	}
	
	public boolean profesorImparteAsignatura() {
		return (profesor.getAsignatura() == asignatura);
	}
	
	public void printAlumnos() {
		int contM = 0;
		int contH = 0;
		
		for (Estudiante estudiante : alumnos) {
			System.out.println(estudiante.toString());
			if (estudiante.getSexo() == 'M') 
				contM++;
			if (estudiante.getSexo() == 'H') 
				contH++;
		}
		System.out.println("Total Hombres estudiantes : " + contH);
		System.out.println("Total Mujeres estudiantes : " + contM);
	}

}
