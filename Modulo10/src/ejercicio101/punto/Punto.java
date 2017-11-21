package ejercicio101.punto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

public class Punto implements LimitesSistema{

	private int x;
	private int y;
	public static int counter;
	public static int capacidad = new Random().nextInt(10)+1;
	

	public Punto(int x, int y) {					
		counter++;			
		normalizar (x,y);		
	}

	private void normalizar(int x, int y) {
		if (x>XMAX){this.x = XMAX;}
		else if (x<XMIN) {this.x = XMIN;}
		else {this.x=x;}
		
	
		if (y>YMAX){this.y = YMAX;}
		else if (y<YMIN) {this.y = YMIN;}
		else {this.y=y;}
		
	}

	public static String pintarMenu() {

		String option;

		System.out.println("\n"+"=========MENU PUNTOS=========");
		System.out.println("C: Crear un punto");
		System.out.println("B: Buscar un punto");
		System.out.println("D: Borrar un punto");
		System.out.println("L: Listar puntos");
		System.out.println("G: Guardar puntos en un archivo");
		System.out.println("V: Leer puntos de un archivo");
		System.out.println("X: Salir");
		System.out.println("=============================");
		System.out.println("Teclea una opción (C,B,D,L,X)");
		System.out.println("=======FIN DE PROGRAMA=======");

		Scanner teclado = new Scanner(System.in);
		option = teclado.next();

		return option;
	}

	public static boolean crearPunto(Punto[] losPuntos, int counter) {

		if (counter < capacidad) {
			Random aleatorio = new Random();
			
			int primeraCoord = aleatorio.nextInt(500);					
			int segundaCoord = aleatorio.nextInt(500);			
			
			Punto nuevoPunto = new Punto(primeraCoord, segundaCoord);			
			
			System.out.println(counter);
			
			losPuntos[counter] = nuevoPunto;
			System.out.println("El punto en la posición " + (counter) + " es " + losPuntos[counter]);

			return true;
		} else {
			System.out.println("El array esta lleno");
			return false;
		}
	}

	public static void buscarPunto(Punto[] losPuntos, int counter) {
		System.out.println("Introduce la primera coordenada");

		Scanner teclado = new Scanner(System.in);
		int primeraCoordBusqueda = teclado.nextInt();

		System.out.println("Introduce la segunda coordenada");
		int segundaCoordBusqueda = teclado.nextInt();

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

	public static boolean borrarPunto(Punto[] losPuntos, int counter) {
		boolean sePuedeBorrar;	
		counter--;
		
		if ((counter)>0 && losPuntos[counter] != null) {			
			losPuntos[counter]=null;
			System.out.println("El punto ha sido borrado. Nuevo contador: "+ counter);
			Punto.setCounter(Punto.counter-1);
			sePuedeBorrar = true;
		}else if((counter)==0){
			if (losPuntos[counter] != null){
				losPuntos[counter]=null;
				Punto.setCounter(Punto.counter-1);
				System.out.println("El array está vacio");				
			}
			sePuedeBorrar= true;
		}else {
			System.out.println("No hay puntos para borrar");
			sePuedeBorrar= false;
		}		
		return sePuedeBorrar;
	}

	public static void listarPunto(Punto[] losPuntos, int counter) {

		for (int i = 0; i <capacidad; i++) {			
			System.out.println("El punto en la posición " + i + " es " + losPuntos[i]);			
		}
	}
	
	public static void guardarPuntos(Punto[] losPuntos) {
		
		//Si el archivo existe hay que borrarlo con la clase File: 
		File fichero = new File("C:/Users/ifender/Desktop/puntos.txt");		
		if (fichero.exists()==true){fichero.delete();}

		try {
			RandomAccessFile ficheroPuntos = new RandomAccessFile("C:/Users/ifender/Desktop/puntos.txt", "rw");
			for (int i = 0; i < capacidad; i++) {				
				if (losPuntos[i]== null) {
					ficheroPuntos.close();
				} else {
					String punto = losPuntos[i].toString();
					ficheroPuntos.writeBytes(punto);
					ficheroPuntos.writeBytes("\n");
				}
			}
			ficheroPuntos.close();

		} catch (IOException ioe) {	ioe.printStackTrace();}		
	}
	
	public static int leerPuntos(Punto[] losPuntos){
		int numeroPuntos=0;
		
		try {
			BufferedReader leer = new BufferedReader(new FileReader(new File("C:/Users/ifender/Desktop/puntos.txt")));
			
			while((leer.readLine() != null)){
				numeroPuntos++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("El numero de puntos en el archivo es: " + numeroPuntos);
		return numeroPuntos;		
	}
	
	public boolean equals(Punto puntoAComparar) {
		if (puntoAComparar.x == this.x && puntoAComparar.y == this.y) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int getCounter(){return counter;}
	public static void setCounter(int counter){Punto.counter = counter;}
	
	@Override
	public String toString() {return "("+x + ","+ y+")" ;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public void pintar() {pintarMenu();	}	
}