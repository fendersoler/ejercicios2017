package universidad;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Prueba {

	public static void main(String[] args) {	

		Aula aula1 = new Aula();	
		System.out.println("Impresi�n para control:");
		System.out.println(aula1);
		System.out.println("");

		Profesor [] profesores = {new Profesor("Pepe", 50, "hombre"),new Profesor("Paco", 48, "hombre"),
				new Profesor("Maria", 38, "mujer"),new Profesor("Teresa", 45, "mujer"),
				new Profesor("Alfonso", 64, "hombre"),new Profesor("Juana", 43, "mujer")};

		Alumno [] alumnos = {new Alumno("Juan", 19, "hombre"),new Alumno("Pilar", 23, "mujer"),
				new Alumno("Laura", 18, "mujer"),new Alumno("David", 20, "hombre"),new Alumno("Diana", 21, "mujer"),
				new Alumno("Carlos", 22, "hombre")};
		
		System.out.println("Profesores");
		for (int i = 0; i < profesores.length; i++) {
			System.out.println(profesores[i]);
		}
		System.out.println("");
		
		System.out.println("Alumnos");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		System.out.println("------------------------------------------");
		
		//Comprobamos disponibilidad del profesor para dar clase de su asignatura
		boolean aulaYProfe;			
		int i=0;
		do {
			if (aula1.getAsignaturaDelAula().equals(profesores[i].getMateria())
					&& profesores[i].isEstaDisponible()==true){
				aulaYProfe = true;
				System.out.println("Se puede dar clase de "+aula1.getAsignaturaDelAula() + " con el profesor/a " + profesores[i].nombre);
				i=profesores.length;				
			}else{
				aulaYProfe = false;
				i++;					
			}			
		} while (i<profesores.length);

		if (aulaYProfe == false){System.out.println("No hay profesor disponible");}

		//Comprobamos si hay m�s del 50% de alumnos para dar clase
		int alumnosDisponibles=0;
		for (int j = 0; j < alumnos.length; j++) {
			if (alumnos[j].isEstaDisponible() == true){alumnosDisponibles++;}
		}
		
		boolean aulaYAlumnos;
		if (alumnosDisponibles>(aula1.getNumeroMaxDeEstudiates()/2)){aulaYAlumnos = true;}
		else {
			aulaYAlumnos = false;
			System.out.println("No hay suficientes alumnos");}

		//Comprobamos que se puede dar clase
		if (aulaYProfe == true && aulaYAlumnos == true){
			System.out.println("Se puede dar clase de " + aula1.getAsignaturaDelAula()+ " ya que hay profesor disponible y alumnos suficientes");
			System.out.println("");
			System.out.println("Impresi�n para control");
			System.out.println("------------------------------------------");
			System.out.println("Las notas de los alumnos son: ");
			
			//Entregamos las notas
			for (int j = 0; j < alumnos.length; j++) {
				Integer notas = ThreadLocalRandom.current().nextInt(0, 11);	
				alumnos[j].asignarNota(aula1.getAsignaturaDelAula(), notas);
				System.out.println(alumnos[j]);
			}
			System.out.println("------------------------------------------");
			//Mostramos cuantos alumnos y alumnas (por separado) est�n aprobados
			ArrayList<Alumno> alumnosHombres=new ArrayList<Alumno>();
			ArrayList<Alumno> alumnosMujeres=new ArrayList<Alumno>();

			for (int j = 0; j < alumnos.length; j++) {
				if (alumnos[j].sexo == "hombre" && (alumnos[j].obtenerUnaNota(aula1.getAsignaturaDelAula())>=5)) {
					alumnosHombres.add(alumnos[j]);
				} else if (alumnos[j].sexo == "mujer" && (alumnos[j].obtenerUnaNota(aula1.getAsignaturaDelAula())>=5)) {
					alumnosMujeres.add(alumnos[j]);
				}
			}			
			System.out.println("Alumnos aprobados: "); 	
			for(Object h:alumnosHombres){ 
	            System.out.println(h); 
	        }
			System.out.println("");
			System.out.println("Alumnas aprobadas: "); 	
			for(Object m:alumnosMujeres){ 
	            System.out.println(m); 
	        }
						
		}else{System.out.println("No se puede dar clase de " + aula1.getAsignaturaDelAula());} 			
	}
}