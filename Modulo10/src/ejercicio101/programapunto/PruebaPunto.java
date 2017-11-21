package ejercicio101.programapunto;

import ejercicio101.punto.Punto;

public class PruebaPunto {

	public static void main(String[] args) {		
		
		Punto [] losPuntos = new Punto [10];
		
		String option;
		do {
			option = Punto.pintarMenu();
			
			System.out.println("tu opcion es " + option.toUpperCase());

			switch (option.toUpperCase()) {			
			case "C":
				Punto.crearPunto(losPuntos, Punto.counter);
				break;
				
			case "B":
				Punto.buscarPunto(losPuntos, Punto.counter);
				break;
				
			case "D":			
				Punto.borrarPunto(losPuntos, Punto.counter);
				break;
				
			case "L":
				Punto.listarPunto(losPuntos, Punto.counter);
				break;
				
			case "G":
				Punto.guardarPuntos(losPuntos);
				break;
				
			case "V":
				Punto.leerPuntos(losPuntos);
				break;
				
			case "X":
				System.out.println("Has salido del Programa");
				option ="X";
				break;

			default:
				Punto.pintarMenu();
				break;
			}
			
		} while (option !="X");	
	}	
}