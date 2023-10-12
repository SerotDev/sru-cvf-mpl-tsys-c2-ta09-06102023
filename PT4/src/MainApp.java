import java.util.Scanner;

public class MainApp {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("valor de a: ");
		double a = sc.nextDouble();
		System.out.println("valor de b: ");
		double b = sc.nextDouble();
		System.out.println("valor de c: ");
		double c = sc.nextDouble();
		
		Raices ecuacion = new Raices(a, b, c);
		
		System.out.println("El discriminante es: " + ecuacion.getDiscriminante());
		System.out.println("Tiene una solucion: " + ecuacion.tieneRaiz());
		System.out.println("Tiene dos soluciones: " + ecuacion.tieneRaices());
		
		ecuacion.calcular();
		ecuacion.obtenerRaices();
		ecuacion.obtenerRaiz();
		
		sc.close();
	}

}