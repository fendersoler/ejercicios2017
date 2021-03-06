package universidad;

import java.util.concurrent.ThreadLocalRandom;

public class Aula {	
	
	private int idAula;
	private int numeroMaxDeEstudiates;
	private String asignaturaDelAula;
	
	public Aula(){
		this.idAula = ThreadLocalRandom.current().nextInt(0, 80);
		this.numeroMaxDeEstudiates= ThreadLocalRandom.current().nextInt(0, 15);
		this.asignaturaDelAula = asignaturaDelAula ();
	}
	
	private String asignaturaDelAula () {			
		String [] asignaturasDisponibles = {"Matem�ticas","Filosofia","F�sica"};
		int indiceDeMaterias = ThreadLocalRandom.current().nextInt(0, 3);		
		String asignaturaDelAula= asignaturasDisponibles[indiceDeMaterias];
		return asignaturaDelAula;
	}
	
	public int getIdAula(){return idAula;}
	public int getNumeroMaxDeEstudiates(){return numeroMaxDeEstudiates;}
	public String getAsignaturaDelAula(){return asignaturaDelAula;}

	@Override
	public String toString() {
		return "Aula [idAula=" + idAula + ", numeroMaxDeEstudiates=" + numeroMaxDeEstudiates + ", asignaturaDelAula="
				+ asignaturaDelAula + "]";
	}
}