package universidad;

import java.util.concurrent.ThreadLocalRandom;

public class Profesor extends Persona {
	
	private String materia;
	private boolean estaDisponible;
	
	public Profesor(){}

	public Profesor(String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);				
		this.materia = asignaturaImpartida ();		
		this.estaDisponible = disponible();
	}	

	public boolean disponible(){
		//El profesor tiene un 20% de no encontrarse disponible
		int indiceDeBaja = ThreadLocalRandom.current().nextInt(0, 100);
		boolean estaDisponible = super.disponible();	
		if (indiceDeBaja <=20){estaDisponible = false;}
		return estaDisponible;
		}
	
	private String asignaturaImpartida () {				
		Integer indiceDeMaterias = ThreadLocalRandom.current().nextInt(0, 3);		
		materia= super.asignaturas(indiceDeMaterias);		
		return materia;
	}	
	
	public String getMateria(){return materia;}	
	public boolean isEstaDisponible() {return estaDisponible;}

	@Override
	public String toString() {
		
		int a=9;
		
		return "Profesor [materia=" + materia + ", nombre=" + nombre + ", edad=" + edad	+ ", sexo=" + sexo + 
				", estaDisponible=" + estaDisponible + a+"]";
	}
}