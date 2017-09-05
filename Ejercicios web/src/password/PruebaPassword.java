package password;

import java.util.Scanner;

public class PruebaPassword {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cúantas contraseñas quieres crear?");		
		int numeroContraseñas = teclado.nextInt();		
		Password [] misContraseñas = new Password[numeroContraseñas];
		
		System.out.println("¿Qué longitud han de tener las contraseñas?");		
		int longitudContraseña = teclado.nextInt();
		
		teclado.close();
		
		boolean [] comprobarSiEsFuerte = new boolean [numeroContraseñas];
		
		for (int i = 0; i < numeroContraseñas; i++) {
			Password nuevaContraseña = new Password(longitudContraseña);			
			misContraseñas[i]= nuevaContraseña;	
			comprobarSiEsFuerte[i]= nuevaContraseña.esFuerte(nuevaContraseña.getContraseña());
			
			System.out.println("La contraseña " + misContraseñas[i].getContraseña()+ 
					" es fuerte: " + comprobarSiEsFuerte[i]);	
		}
	}
}