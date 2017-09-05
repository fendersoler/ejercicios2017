package universidad;

public class Persona {
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	public Persona(){};
	
	public Persona (String nombre, int edad, String sexo){
		this.nombre= nombre;
		this.edad= edad;
		this.sexo= sexo;
	}
	
	public boolean disponible(){
		boolean estaDisponible = true;		
		return estaDisponible;	
	}
	
	public String asignaturas(int materia){
		String [] asignaturasDisponibles = {"Matemáticas","Filosofia","Física"};
		return asignaturasDisponibles [materia];		
	}
}