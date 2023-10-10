
public class Raices {
	
	private double a;
	private double b;
	private double c;
	
	public Raices(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public double getDiscriminante() {
		
		return (b * b) - (4 * a * c);
		
	}

	public boolean tieneRaices() {
		
		double discriminante = getDiscriminante();
		//mas grande o igual que 0
		return discriminante >= 0;
		
	}
	
	public boolean tieneRaiz() {
		
		double discriminante = getDiscriminante();
		//igual que 0
		return discriminante == 0;
		
	}
	
	public void calcular(){
		
		double discriminante = getDiscriminante();
		
		if (discriminante > 0) {
			
			double x = ( -b + Math.sqrt(discriminante) / (2 * a));
			double y = ( -b - Math.sqrt(discriminante) / (2 * a));
			
			System.out.println("Soluciones:");
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
		} else if (discriminante == 0) {
			
			double x = -b / (2 * a);
			
			System.out.println("Solucion:");
			System.out.println("x = " + x);
			
		} else {
			
			System.out.println("No tiene solucion");

		}
		
	}
	
	public void obtenerRaices() {
		
		double discriminante = getDiscriminante();
		
		if (discriminante >= 0) {
			
			double x = ( -b + Math.sqrt(discriminante) / (2 * a));
			double y = ( -b - Math.sqrt(discriminante) / (2 * a));
			
			System.out.println("Soluciones:");
			System.out.println("x = " + x);
			System.out.println("y = " + y);

		} else {
			
			System.out.println("No tiene raiz");
		}
		
	}
	
	public void obtenerRaiz() {
		
		double discriminante = getDiscriminante();
		
		if (discriminante == 0) {
			
		double x = -b / (2 * a);
			
		System.out.println("Solucion:");
		System.out.println("x = " + x);
		
		} else {
			
			System.out.println("No tiene raiz");
		}
	}
}
