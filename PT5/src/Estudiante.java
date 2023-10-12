
public class Estudiante extends Persona{
	
	private int calificacion = 0;
	
	public int getCalificacion() {
		
		return calificacion;
	}
	
	public void setCalificacion() {
		
		this.calificacion = calificacion;
	}
	
	@Override
	public boolean novillos() {
		
		int rnd = (int)(Math.random()*2+1); // 1/2->50%
		
		return (rnd == 1);
	}
	
}
