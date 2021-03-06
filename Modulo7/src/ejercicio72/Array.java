package ejercicio72;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Array {

	int [] array;
	
	public Array(){
		this.array = new int [6];		
	}	

	public void rellenar (int aleatorio){
		Arrays.fill(array, aleatorio);
	}

	public void rellenar (){
		for (int i = 0; i < array.length; i++) {
			array[i] = ThreadLocalRandom.current().nextInt(1, 50);		
			
			for (int j = 0; j < array.length; j++) {
				if(i > j){
					if(array[i]==array[j]){
						array[i] = ThreadLocalRandom.current().nextInt(1, 50);		
					}
				}
			}
		}		
	}

	public void ordenar (){
		Arrays.sort(array);
	}

	public void visualizar (){		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Posici�n [" + i +"] = "+ array[i]);
		}		
	}
	
	public static void main (String args []){
		Array miArray = new Array();
		
		System.out.println("Rellenar con un aleatorio");
		int aleatorio = ThreadLocalRandom.current().nextInt(1, 50);
		miArray.rellenar(aleatorio);				
		miArray.visualizar();
		System.out.println("----");
		
		System.out.println("Rellenar sin repetir");
		miArray.rellenar();
		miArray.visualizar();
		System.out.println("----");
		
		System.out.println("Ordenar");
		miArray.ordenar();
		miArray.visualizar();
	}
}