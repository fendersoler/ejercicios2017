package persona;

import java.util.Locale;
import java.util.Scanner;

public class PruebaPersona {

	public static void main(String[] args) {
		//Para definir que los double son 0.0 y no 0,0 se usa el locale
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, introduce los siguientes datos:");
		
		System.out.println("Nombre: ");
		String nombre= teclado.nextLine();
		
		System.out.println("Edad: ");
		int edad= teclado.nextInt();
		
		System.out.println("Sexo (H para hombre, M para mujer): ");
		char sexo= teclado.next().toUpperCase().charAt(0);
		
		System.out.println("Peso: ");
		double peso= teclado.nextDouble();
		
		System.out.println("Altura: ");
		double altura= teclado.nextDouble();
		
		teclado.close();
		
		Persona persona1= new Persona();
		persona1.setNombre(nombre);
		persona1.setEdad(edad);
		persona1.comprobarSexo(sexo);
		persona1.getDni();
		persona1.setPeso(peso);
		persona1.setAltura(altura);
		
		System.out.println(" ");
		
		System.out.println(persona1);
		persona1.calcularIMC();
		persona1.esMayorDeEdad();
				
		System.out.println(" ");
		
		Persona persona2= new Persona(nombre, edad, sexo);
		persona2.comprobarSexo(sexo);
		System.out.println(persona2);
		persona2.calcularIMC();
		persona2.esMayorDeEdad();
		
		System.out.println(" ");
		
		Persona persona3= new Persona(nombre, edad, sexo, peso, altura);
		persona3.comprobarSexo(sexo);
		System.out.println(persona3);
		persona3.calcularIMC();
		persona3.esMayorDeEdad();				
	}
}