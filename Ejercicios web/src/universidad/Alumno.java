package universidad;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Alumno extends Persona {
	
	private String [][] asignaturasYNotas = new String [3][2];	
	private boolean estaDisponible;	
	private String [] asignaturasDisponibles = {super.asignaturas(0),super.asignaturas(1),super.asignaturas(2)};
	private String [] notasGlobales = {"0","0","0"};
	
	public Alumno(){}

	public Alumno(String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
		this.estaDisponible = disponible();	
		this.asignaturasYNotas = mostrarNotasDelAlumno(asignaturasDisponibles, notasGlobales);			
	}

	public boolean disponible(){
		//Los estudiantes tendr�n un 50% de hacer novillos
		int indiceDeBaja = ThreadLocalRandom.current().nextInt(0, 100);
		boolean estaDisponible = super.disponible();	
		if (indiceDeBaja <=50){estaDisponible = false;}
		return estaDisponible;}
	
	private String[][] mostrarNotasDelAlumno (String[] asignaturasDisponibles, String[] notasGlobales) {	
		for (int i = 0; i < 3; i++) {
			asignaturasYNotas[i][0]= asignaturasDisponibles[i]; 
			asignaturasYNotas[i][1]= notasGlobales[i];
			}		
		return asignaturasYNotas;
	}
	
	protected void asignarNota (String asignatura, Integer nota){
		int i =0;
		do {
			if (asignatura == super.asignaturas(i)){
				notasGlobales[i]=nota.toString();				
				this.asignaturasYNotas = mostrarNotasDelAlumno(asignaturasDisponibles, notasGlobales);
				i=asignaturasDisponibles.length;
			}
			else {i++;}
		} while (i<asignaturasDisponibles.length);		
	}
	
	protected Integer obtenerUnaNota(String asignatura){
		int i =0;
		int nota = 0;
		do {
			if (asignatura == super.asignaturas(i)){
			nota = Integer.parseInt(notasGlobales[i]);
			i=asignaturasDisponibles.length;
			}else {i++;}
		} while (i<asignaturasDisponibles.length);
		return nota;		
	}				
	
	public boolean isEstaDisponible(){return estaDisponible;}
	public String[] getNotasGlobales(){return notasGlobales;}

	@Override
	public String toString() {
		
		String notasEscritas="";
		
		for (int i = 0; i <= 2; i++) {
			notasEscritas = notasEscritas + Arrays.toString(asignaturasYNotas[i]);			
		}		
		
		return "Alumno [nombre=" + nombre + ", edad=" + edad+ ", sexo=" + sexo + 
				", estaDisponible= " + estaDisponible + ", notas" + notasEscritas + " ]";
	}
}