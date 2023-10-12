import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		List<Estudiante> estudiantes = new ArrayList<>();
        Random random = new Random();

        String[] nombres = {"Juan", "María", "Carlos", "Luisa", "Pedro", "Ana", "Sofía", "Javier", "Laura", "Miguel"};
        char[] sexos = {'M', 'H'};
        
        for (int i = 0; i < 20; i++) {
            String name = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(13) + 18;
            char sexo = sexos[random.nextInt(sexos.length)];
            int calificacion = random.nextInt(101);

            Estudiante estudiante = new Estudiante(name, edad, sexo, calificacion);
            estudiantes.add(estudiante);
        }
        
        Profesor profesorDeFilosofia = new Profesor("Dr. Filósofo", 40, 'M', Asignaturas.filosofía.name());
        
        Aula aulaFilosofia = new Aula(30, Asignaturas.filosofía.name(), profesorDeFilosofia, estudiantes);
        Aula aulaOtraAsignatura = new Aula(25, Asignaturas.física.name(), profesorDeFilosofia, estudiantes);
        
        aulaFilosofia.darClase();
        aulaOtraAsignatura.darClase();


	}

}
