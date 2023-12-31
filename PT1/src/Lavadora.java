
public class Lavadora extends Electrodomestico{

	protected int carga;
	
	private final int CARGA_DEFAULT = 5;
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEFAULT;
	}

	public Lavadora(double precio, int peso) {
		super(precio, peso);
		this.peso = peso;
		this.carga = CARGA_DEFAULT;

	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
		
	}
	
	//Implementando metodo getCarga de electrodomestico
	public int getCarga() {
		return carga;
	}
	
	//PrecioFinal
	@Override
	public double precioFinal() {
		double precio = super.precioFinal();
		
		if (carga > 30)
			precio = precio + 50;
		return precio;
	}
	
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "Precio base=" + String.format("%.2f", precioBase) + ", precioFinal=" + String.format("%.2f",precioFinal()) + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	

	
}
