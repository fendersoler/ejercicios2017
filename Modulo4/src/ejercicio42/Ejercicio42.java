package ejercicio42;

import java.util.Scanner;

public class Ejercicio42 {
	
	public static void main(String[] args) {

		//Resquest a 8 digits number and create a chain
		System.out.println("Teclea tu DNI");
		Scanner keyboard = new Scanner(System.in);
		int dni = keyboard.nextInt();
		String edni= Integer.toString(dni);
		
		//Check if the number has 8 digits
		while (edni.length()<8) {
			System.out.println("El DNI debe tener al menos 8 cifras. Teclea tu DNI de nuevo");
			int dni2 = keyboard.nextInt();
			edni= Integer.toString(dni2);	
			}
				
		//Sum the 8 digits of the number
		int sum=0;
		for (int i=0; i<=7; i++){
			char digit= edni.charAt(i);
			String digito = String.valueOf(digit); 
			int value= Integer.parseInt(digito);
			sum = sum + value;
		}
		
		//Letters of the DNI
		char letters [] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H',
			'L','C','K','E'};
		
		//Get the letter of DNI: the position is the result of the modulus of sum/23
		int modulusSum = sum%23;	
		char letterOfNif = letters[modulusSum-1];
		System.out.println("Tu NIF es: " + dni + "-" + letterOfNif);
	
	keyboard.close();
	}
}