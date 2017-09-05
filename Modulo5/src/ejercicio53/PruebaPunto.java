package ejercicio53;

import java.util.Random;
import java.util.Scanner;

public class PruebaPunto {
	
	public static void main(String[] args) {
		
		Punto pointA = new Punto();	
		pointA.pintar();
		
		Punto pointB = new Punto(1,8);
		pointB.pintar();
		
		Punto pointC = new Punto(pointB);
		pointC.pintar();
		
		System.out.println("----------------------------");
		
		//Create an array of points no bigger than 20 points with points between 0 and  100
		Random randomNumber = new Random();
		int indexArray = randomNumber.nextInt(20);
		Punto [] points = new Punto[indexArray];
		
		for (int a=0; a<points.length; a++){
			int firstCoord= randomNumber.nextInt(500);
			int secondCoord = randomNumber.nextInt(500);
			Punto newPoint =  new Punto(firstCoord,secondCoord);
			points [a]= newPoint;
		}		
		
		for (int a=0; a<points.length; a++){
			points[a].pintarPuntoValido();
		}
		
		System.out.println("----------------------------");
		//Metodos sobrecargados
		
		pointA.pintarMoverPunto();
		
		System.out.println("Introduce a new point: ");
		Scanner keyboard = new Scanner(System.in);		
		int a= getInputInteger(keyboard);
		int b= getInputInteger(keyboard);
		
		System.out.println("How many coordenates you want to move the point?");
		int distance = getInputInteger(keyboard);
		
		Punto pointD = new Punto(a,b);
		System.out.print("The original point was: ");
		pointD.pintar();
		System.out.print("The final point was: ");
		pointD.moverPunto(distance);
		pointD.pintar();
		
		Punto pointE = new Punto(a,b);
		pointE.moverPunto(a, b);
	}
	
	public static int getInputInteger(Scanner keyboard){
		int a = keyboard.nextInt();
		return a; 		
	}
}