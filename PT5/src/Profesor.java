
public class Profesor extends Persona{

	private String materia = "";
	
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	
	@Override
	public boolean novillos() {
		
		int rnd = (int)(Math.random()*5+1); // 1/5->20%
		
		return (rnd == 1);
	}
}
