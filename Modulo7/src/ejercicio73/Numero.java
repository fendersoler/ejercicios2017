package ejercicio73;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Numero {
	
	double numero;
	
	public Numero(){
		int aleatorioInt = ThreadLocalRandom.current().nextInt();
		double aleatorioDouble= ThreadLocalRandom.current().nextDouble();		
		this.numero = Math.abs(aleatorioDouble * aleatorioInt);
		System.out.println("El n�mero es: " + formato(numero));
	}
	
	public void raizCuadrada(){	
		double raiz = Math.sqrt(numero); 
		System.out.println("Su raiz cuadrada es: " + formato(raiz));
	}
	
	public void elevarPotencia(){	
		double elevar=Math.pow(numero, 2);
		System.out.println("El n�mero elevado al cuadrado es: " + formato(elevar));
	}
	
	public String formato(double numero){	
		DecimalFormat formato = new DecimalFormat("#,###.00");
		return formato.format(numero);
	}
}