package ejercicio54;

import java.util.Random;
import java.util.Scanner;

public class Punto {

	private int x;
	private int y;
	public static int counter;

	public Punto(int x, int y) {
		counter++;
		this.x = x;
		this.y = y;
	}

	public static String pintarMenu() {

		String option;

		System.out.println("=========MENU PUNTOS=========");
		System.out.println("C: Crear un punto");
		System.out.println("B: Buscar un punto");
		System.out.println("D: Borrar un punto");
		System.out.println("L: Listar puntos");
		System.out.println("X: Salir");
		System.out.println("=============================");
		System.out.println("Teclea una opción (C,B,D,L,X)");
		System.out.println("=======FIN DE PROGRAMA=======");

		Scanner teclado = new Scanner(System.in);
		option = teclado.next();

		return option;
	}

	static boolean crearPunto(Punto[] losPuntos, int counter) {

		if (counter < 10) {
			Random aleatorio = new Random();
			int primeraCoord = aleatorio.nextInt(100);
			int segundaCoord = aleatorio.nextInt(100);
			Punto nuevoPunto = new Punto(primeraCoord, segundaCoord);
			losPuntos[counter] = nuevoPunto;

			System.out.println("El punto en la posición " + (counter) + " es " + primeraCoord + "," + segundaCoord);

			return true;
		} else {
			System.out.println("El array esta lleno");
			return false;
		}
	}

	static void buscarPunto(Punto[] losPuntos, int counter) {
		System.out.println("Introduce la primera coordenada");

		Scanner teclado = new Scanner(System.in);
		int primeraCoordBusqueda = teclado.nextInt();

		System.out.println("Introduce la segunda coordenada");
		int segundaCoordBusqueda = teclado.nextInt();
		
		teclado.close();

		Punto puntoBuscado = new Punto(primeraCoordBusqueda, segundaCoordBusqueda);

		boolean puntoEncontrado = false;

		for (int i = 0; i < counter; i++) {
			if (losPuntos[i] != null) {
				if (losPuntos[i].equals(puntoBuscado)) {
					puntoEncontrado = true;
					System.out.println("El punto buscado ocupa la posición " + i);
				}
			}
		}
		
		if (!puntoEncontrado){System.out.println("El punto buscado no existe");}
	}

	static boolean borrarPunto(Punto[] losPuntos, int counter) {
		boolean sePuedeBorrar;
		
		if ((counter-1)>0 && losPuntos[counter-1] != null) {
			losPuntos[counter-1]=null;
			counter--;				
			System.out.println("El punto ha sido borrado. Nuevo contado: "+ counter);
			sePuedeBorrar = true;
		}
		else {
			System.out.println("No hay puntos para borrar");
			sePuedeBorrar= false;
		}
		
		return sePuedeBorrar;
	}

	static void listarPunto(Punto[] losPuntos, int counter) {

		for (int i = 0; i <= 9; i++) {			
			System.out.println("El punto en la posición " + i + " es " + losPuntos[i]);			
		}
	}
	
	public boolean equals(Punto puntoAComparar) {
		if (puntoAComparar.x == this.x && puntoAComparar.y == this.y) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {return "("+x + ","+ y+")" ;}		
}