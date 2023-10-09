
public class Television extends Electrodomestico {
	private final int RESOLUCION_DEFAULT = 20;
	private final boolean SINTONIZADOR_TDT_DEFAULT = false;
	
	private int resolucion;
	private boolean sintonizador_tdt;
	
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizador_tdt = SINTONIZADOR_TDT_DEFAULT;
	}
	
	public Television(double precio, int peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION_DEFAULT;
		this.sintonizador_tdt = SINTONIZADOR_TDT_DEFAULT;
	}
	
	public Television(int resolucion, boolean sintonizador_tdt, double precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizador_tdt = sintonizador_tdt;
	}
	
	//Getters
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizador_tdt() {
		return sintonizador_tdt;
	}
	
	@Override
	public double precioFinal(){
		double precioFinal = super.precioFinal();
		
		if (this.resolucion > 40) {
			precioFinal = super.precioFinal() * 1.3;
		} else if(this.sintonizador_tdt){
			precioFinal = super.precioFinal() + 50;
		}
		return precioFinal;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador_tdt=" + sintonizador_tdt + ", precioBase="
				+ String.format("%.2f", precioBase) + ", precioFinal=" + String.format("%.2f",precioFinal()) + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + "]";
	}
	
	
	
	

	
	
	
}
