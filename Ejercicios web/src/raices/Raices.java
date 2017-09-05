package raices;
import java.lang.Math;


public class Raices {
	private int a;
	private int b;	
	private int c;
	
	private double discriminante;
	private boolean tieneUnaRaiz;
	private boolean tieneDosRaices;
	private double x1;
	private double x2;
	
	public Raices (int a, int b, int c){		
		this.a=a;		
		this.b=b;		
		this.c=c;
	}
		
	public double getDiscriminante(){		
		//devuelve el valor del discriminante ((b^2)-4*a*c)
		
		discriminante = Math.pow(b, 2)-(4*(a*c));
		return discriminante;
	}
	
	public boolean tieneRaices(){
		//booleano indicando si hay dos soluciones (discriminante >=0)	
		
		if (discriminante>0){tieneDosRaices = true;}
		else {tieneDosRaices = false;}
		return tieneDosRaices;		
	}
	public boolean tieneRaiz(){
		//booleano indicando si hay una solución (discriminante =0)
		
		if (discriminante==0){tieneUnaRaiz = true;}
		else {tieneUnaRaiz = false;}
		return tieneUnaRaiz;	
	}
	public void calcular(){
		//mostrar por consola las posibles soluciones. Si no existe solución, mostrarlo.
		
		if (tieneUnaRaiz == true){			
			this.x1=-(b)/(2*a);			
			obtenerRaiz();
		}
		else if (tieneDosRaices == true) {
			this.x1 = (-(b)+ Math.sqrt(discriminante))/(2*a);
			this.x2 = (-(b)- Math.sqrt(discriminante))/(2*a);			
			obtenerRaices();
		}
		else if (discriminante < 0){
			System.out.println("La ecuación no tiene solución");
		}		
	}
	
	public void obtenerRaices() {
		//imprime las dos soluciones
		System.out.println("x 1 = " + x1);
		System.out.println("x 2 = " + x2);
	}
	
	public void obtenerRaiz() {
		//imprime cuando sólo existe una solución
		System.out.println("x = " + x1);		
	}
}