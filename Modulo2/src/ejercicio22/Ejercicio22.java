package ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {

		System.out.println("Teclea un número entero");
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();

		System.out.println("Escribe una frase");
		Scanner teclado2 = new Scanner(System.in);
		String d = teclado2.nextLine();

		System.out.println("Has escrito: " + a+ " " + d);
		
		teclado.close();
		teclado2.close();
	}

}