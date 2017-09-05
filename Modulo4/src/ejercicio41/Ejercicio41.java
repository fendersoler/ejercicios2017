package ejercicio41;

import java.util.Random;

public class Ejercicio41 {
	
	public static void main(String[] args) {
		
		//Generate the array:
		int [] numbers = new int[6];
						
		//Set a number in each position of the array
		Random randomNumber = new Random();
		for (int i=0; i<=5; i++){
			numbers [i] = randomNumber.nextInt(49)+1;		
		}
		
		int position = 1;
		for (int index:numbers){
			System.out.println("El valor en la posicion " + position + " es: "+ index);
			position = position+1;
		}
	}
}