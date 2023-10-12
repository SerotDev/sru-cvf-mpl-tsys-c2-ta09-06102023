
public abstract class Persona {

	protected String nombre;
	protected int edad;
	protected char sexo;	
	
	private final char SEXO_DEFAULT = 'H';
	private final int EDAD_DEFAULT = 0;
	
	
	public Persona() {
		this.nombre = "";
		this.edad = EDAD_DEFAULT;
		this.sexo = SEXO_DEFAULT;
	}
	
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public abstract boolean ausentarse();
	
	

}


