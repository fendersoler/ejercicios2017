package ejercicio32;

import java.util.Random;

public class ejercicio32 {
	
	public static void main(String[] args) {
		
		Random randomNumber = new Random();
		int counter = randomNumber.nextInt(20)+1;
		
		int i;
		for (i=1; i<=counter; i++){
			
			int generator = randomNumber.nextInt(66);
			
			while (generator < 18) {
				int secondGenerator = randomNumber.nextInt(66);
				generator =secondGenerator;
				}			
			
			System.out.println("La iteración " +i+ " de "+ counter + " es: "+ generator);
		}		
	}
}