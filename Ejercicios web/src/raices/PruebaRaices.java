package raices;

public class PruebaRaices {

	public static void main(String[] args) {

		Raices raiz = new Raices(1, 3, -4);
		
		System.out.println("Discriminante: "+ raiz.getDiscriminante());
		System.out.println("Tiene dos soluciones: "+ raiz.tieneRaices());
		System.out.println("Tiene una solución: "+ raiz.tieneRaiz());
		
		raiz.calcular();		
	}
}