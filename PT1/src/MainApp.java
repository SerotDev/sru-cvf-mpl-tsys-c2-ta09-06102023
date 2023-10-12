
public class MainApp {

	public static void main(String[] args) {
		Electrodomestico electrodomesticos[] = craeteAndPopulateArray();
		
		printElectrodomesticos(electrodomesticos);
        printPreciosFinalesArray(electrodomesticos);
        
        printPrecioTotalTodasLavadoras(electrodomesticos);
        printPrecioTotalTodosTelevisores(electrodomesticos);
        printPrecioTotalElectrodomesticos(electrodomesticos);
	}
	
	
	public static Electrodomestico[] craeteAndPopulateArray() {
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		
		electrodomesticos[0] = new Lavadora(450.0, 25);
		electrodomesticos[1] = new Lavadora(600.0, 35);
		electrodomesticos[2] = new Lavadora(700.0, "Plateado", 'C', 29, 36);
		electrodomesticos[3] = new Lavadora(480.0, 28);
		electrodomesticos[4] = new Lavadora(600.0, "Negro", 'B', 32, 35);
		electrodomesticos[5] = new Television(65, true, 800.0, "Gris", 'A', 28);
		electrodomesticos[6] = new Television(50, false, 750.0, "Negro", 'B', 24);
		electrodomesticos[7] = new Television(55, true, 720.0, "Plateado", 'A', 26);
		electrodomesticos[8] = new Television(40, false, 450.0, "Blanco", 'C', 18);
		electrodomesticos[9] = new Television(75, true, 1000.0, "Negro", 'A', 32);
		
		return electrodomesticos;
	}
	
	
	public static void printElectrodomesticos(Electrodomestico electrodomesticos[]) {
		System.out.println("\nINFORMACION DE LOS ELECTRODOMESTICOS:");
        for (Electrodomestico electodomestico : electrodomesticos) {
            System.out.println(electodomestico.toString());
        }
	}
	
	public static void printPreciosFinalesArray(Electrodomestico electrodomesticos[]) {
		 System.out.println("\nPRECIOS FINALES:");
	        for (Electrodomestico electodomestico : electrodomesticos) {
	            System.out.println("Precio final " + electodomestico.precioFinal());
	        }
	}
	
	public static void printPrecioTotalTodasLavadoras(Electrodomestico electrodomesticos[]) {
		double total = 0;
		 System.out.println("\nPRECIOS LAVADORAS:");
	        for (Electrodomestico electodomestico : electrodomesticos) {
	        	if (electodomestico instanceof Lavadora) {
	        		System.out.println("Precio final unidad lavadora " + electodomestico.precioFinal());
	        		total += electodomestico.precioFinal();
	        	}
	        }
	        System.out.println("PRECIO FINAL LAVADORAS: " + total);
	}
	
	public static void printPrecioTotalTodosTelevisores(Electrodomestico electrodomesticos[]) {
		double total = 0;
		 System.out.println("\nPRECIOS LAVADORAS:");
	        for (Electrodomestico electodomestico : electrodomesticos) {
	        	if (electodomestico instanceof Television) {
	        		System.out.println("Precio final unidad televisor " + electodomestico.precioFinal());  
	        		total += electodomestico.precioFinal();
	        	}
	        }
	     System.out.println("PRECIO FINAL TELEVISORES: " +  total);
	}
	
	public static void printPrecioTotalElectrodomesticos(Electrodomestico electrodomesticos[]) {
		double total = 0;
		 System.out.println("\nPRECIOS TODO:");
	        for (Electrodomestico electodomestico : electrodomesticos) {
	        		System.out.println("Precio final unidad " + electodomestico.precioFinal());
	        		total += electodomestico.precioFinal();
	        }
	        System.out.println("PRECIO FINAL TODO: " + total);
		
	}

}
