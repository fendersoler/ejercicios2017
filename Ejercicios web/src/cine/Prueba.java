package cine;

import java.util.concurrent.ThreadLocalRandom;

public class Prueba {

	public static void main(String[] args) {
		Pelicula pelicula = new Pelicula("Memento", 113, 16, "Christopher Nolan");
		
		Cine cine = new Cine(8);
		cine.setPelicula(pelicula.getTitulo());
		
		System.out.println(cine);
		System.out.println(pelicula+"\n");
		Sala sala = new Sala();
		
		int numeroEspectadores = ThreadLocalRandom.current().nextInt(1,81); 
		System.out.println("Espectadores: " + numeroEspectadores+"\n");
		
		Espectador espectadores[]=new Espectador [numeroEspectadores];
		
		for(int i=0; i<numeroEspectadores ;i++){		
			espectadores[i] = new Espectador();
			System.out.println(espectadores[i]);
			
			if(espectadores[i].getEdad()>=pelicula.getEdadMinima()){
				if(espectadores[i].getDinero()>=cine.getPrecio()){			
					
					int fila = ThreadLocalRandom.current().nextInt(0,8);
					//int fila =2;
					//System.out.println("Fila: " + fila);
					int columna = ThreadLocalRandom.current().nextInt(0,9);
					//int columna =2;
					//System.out.println("Columna: " + columna);
					
					sala.ocuparButaca(fila, columna);
					
				}else{System.out.println("Este espectador no tiene suficiente dinero para ver la pelicula \n");}				
			}else{System.out.println("Este espectador no tiene la edad para ver la pelicula \n");}
		}		
				
		System.out.println("\n"+sala);	
	}
}