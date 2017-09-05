package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a= getInputInteger(teclado);
		int b= getInputInteger(teclado);
		
		System.out.println("Ahora teclea un n�mero decimal");
		
		float c = teclado.nextFloat();
		teclado.nextLine();
		
		float suma = a + b + c;

		System.out.println("La suma de los tres n�meros es: " + suma);

		if (a > b)
			System.out.println("El n�mero mayor es " + a);
		else
			System.out.println("El n�mero mayor es " + b);

		double resto = a % b;
		double division = c / resto;
		System.out.println("La divisi�n de " + c + " entre el resto de " + a + " y " + b + " es: " + division);

		System.out.println("Escribe una frase");
		String d = teclado.nextLine();

		System.out.println("Escribe otra frase");
		String e = teclado.nextLine();

		String concatenado = d + " " + e;

		System.out.println("Has escrito: " + concatenado);
		
		teclado.close();
	}
	
	public static int getInputInteger(Scanner teclado){
		System.out.println("Teclea un n�mero entero");
		int a = teclado.nextInt();
		return a; 		
	}
}