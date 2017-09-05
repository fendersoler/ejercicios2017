package password;

import java.util.Scanner;

public class PruebaPassword {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("�C�antas contrase�as quieres crear?");		
		int numeroContrase�as = teclado.nextInt();		
		Password [] misContrase�as = new Password[numeroContrase�as];
		
		System.out.println("�Qu� longitud han de tener las contrase�as?");		
		int longitudContrase�a = teclado.nextInt();
		
		teclado.close();
		
		boolean [] comprobarSiEsFuerte = new boolean [numeroContrase�as];
		
		for (int i = 0; i < numeroContrase�as; i++) {
			Password nuevaContrase�a = new Password(longitudContrase�a);			
			misContrase�as[i]= nuevaContrase�a;	
			comprobarSiEsFuerte[i]= nuevaContrase�a.esFuerte(nuevaContrase�a.getContrase�a());
			
			System.out.println("La contrase�a " + misContrase�as[i].getContrase�a()+ 
					" es fuerte: " + comprobarSiEsFuerte[i]);	
		}
	}
}