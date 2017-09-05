package ejercicio31;

import java.util.Scanner;

public class Ejercicio31 {
	
	public static void main(String[] args) {
		
		//Request 2 numbers
		Scanner keyboard = new Scanner(System.in);
		int firstNumber= getInputInteger(keyboard);
		int lastNumber= getInputInteger(keyboard);
		
		//Check which is the bigger number
		int max = firstNumber < lastNumber ? lastNumber : firstNumber;
		int min = firstNumber < lastNumber ? firstNumber : lastNumber;
		
		//Calculate the middle point
		int middlePoint = max-((max-min)/2);
		
		//Calculate the result
		int even= ((max+min)*((max-min)/2))+ middlePoint;
		int odd= (((max-min)+1)/2)*(max+min);
		
		//Verify if the sequence between first and last number is even or odd 
		double checkEvenOrOdd = (max-min)%2;
		int resultEvenOrOdd = checkEvenOrOdd>0 ? odd : even;		
		
		System.out.println("La suma de todos los números entre " + firstNumber + " y " 
				+lastNumber + " es: " + resultEvenOrOdd);
	}

	public static int getInputInteger(Scanner keyboard){
		System.out.println("Teclea un número entero");
		int number = keyboard.nextInt();
		return number; 		
	}	
}