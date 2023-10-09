
public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	private static final double PRECIO_BASE_DEFAULT = 100;
	private static final char CONSUMO_ENERGETICO_DEFAULT = 'F';
	private static final int PESO_DEFAULT = 5;
	private static final String COLOR_DEFAULT = Color.blanco.name();
	
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}
	
	public Electrodomestico(double precio, int peso) {
		this.precioBase = precio;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	
	public String comprobarColor(String color) {
		for (Color c : Color.values()) {
	        if (c.name().equalsIgnoreCase(color)) {
	            return c.name();
	        }
	    }
	    return COLOR_DEFAULT;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	
	public char comprobarConsumoEnergetico(char letra) {
		for (ConsumoEnergetico c : ConsumoEnergetico.values()) {
	        if (Character.toUpperCase(letra) == c.name().charAt(0)) {
	            return letra;
	        }
	    }
	    return CONSUMO_ENERGETICO_DEFAULT;
	}
	
	public double precioFinal() {
		int total = 0;
		total += calcularPrecioPorConsumoEnergetico();
		total += calcularPrecioPorPeso();
		return total;
		
	}
	
	private double calcularPrecioPorPeso() {
		if (this.peso >= 0 && this.peso <= 19)
			return 100;
		else if (this.peso <= 49)
			return 50;
		else if (this.peso <= 79)
			return 80;
		else if (this.peso > 80)
			return 100;
		return 0;
	}
	
	private int calcularPrecioPorConsumoEnergetico() {
		if (this.consumoEnergetico == 'A')
			return 100;
		if (this.consumoEnergetico == 'B')
			return 80;
		if (this.consumoEnergetico == 'C')
			return 60;
		if (this.consumoEnergetico == 'D')
			return 50;
		if (this.consumoEnergetico == 'E')
			return 30;
		if (this.consumoEnergetico == 'F')
			return 10;
		return 0;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + String.format("%.2f", precioBase) + ", precioFinal=" + String.format("%.2f",precioFinal()) + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
	

}
