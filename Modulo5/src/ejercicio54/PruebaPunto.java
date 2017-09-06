package ejercicio54;

public class PruebaPunto {

	public static void main(String[] args) {		
		
		Punto [] losPuntos = new Punto [10];
		losPuntos [0] = new Punto (1,5);
		losPuntos [1] = new Punto (2,6);
		
		String option;
		do {
			option = Punto.pintarMenu();
			
			System.out.println("tu opcion es " + option.toUpperCase());

			switch (option.toUpperCase()) {
			
			case "C":
				Punto.crearPunto(losPuntos, Punto.counter);
				System.out.println("El contador ahora es " + Punto.counter);
				break;
				
			case "B":
				Punto.buscarPunto(losPuntos, Punto.counter);
				break;
				
			case "D":			
				Punto.borrarPunto(losPuntos, Punto.counter);
				break;
				
			case "L":
				Punto.listarPunto(losPuntos, Punto.counter);
				break;
				
			case "X":
				System.out.println("Has salido del Programa");
				option ="X";
				break;

			default:
				Punto.pintarMenu();
				break;
			}
			
		} while (option !="X");		
	}
}