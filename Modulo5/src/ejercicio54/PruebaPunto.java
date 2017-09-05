package ejercicio54;

import java.util.Scanner;

public class PruebaPunto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Punto [] losPuntos = new Punto [10];
		losPuntos [0] = new Punto (1,5);
		losPuntos [1] = new Punto (1,5);
		
		String option = Punto.pintarMenu();
		
		System.out.println("tu opcion es " + option);

		switch (option.toUpperCase()) {
		
		case "C":
			System.out.println("estas en el caso C");
			Punto.crearPunto(losPuntos, Punto.counter);
			System.out.println("El contador es " + Punto.counter);
			break;
			
		case "B":
			System.out.println("estas en el caso B");
			Punto.buscarPunto(losPuntos, Punto.counter);
			break;
			
		case "D":			
			System.out.println("estas en el caso D");
			//Punto.borrarPunto(losPuntos, Punto.counter);
			break;
			
		case "L":
			System.out.println("estas en el caso L");
			Punto.listarPunto(losPuntos, Punto.counter);
			break;
			
		case "X":
			System.out.println("Has salido del Programa");
			break;

		default:
			System.out.println("estas en el caso default");
			Punto.pintarMenu();
			break;
		}
	}
}