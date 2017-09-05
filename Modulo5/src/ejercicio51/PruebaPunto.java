package ejercicio51;

import java.util.Random;

public class PruebaPunto {
	
	public static void main(String[] args) {
		
		Punto pointA = new Punto();	
		pointA.pintar();
		
		Punto pointB = new Punto(1,8);
		pointB.pintar();
		
		Punto pointC = new Punto(pointB);
		pointC.pintar();
		
		System.out.println("----------------------------" );
		
		//Create an array of points no bigger than 20 points with points between 0 and  100
		Random randomNumber = new Random();
		int indexArray = randomNumber.nextInt(20);
		Punto [] points = new Punto[indexArray];
		
		for (int a=0; a<points.length; a++){
			int firstCoord= randomNumber.nextInt(100);
			int secondCoord = randomNumber.nextInt(100);
			Punto newPoint =  new Punto(firstCoord,secondCoord);
			points [a]= newPoint;
		}		
		
		for (int a=0; a<points.length; a++){
			points[a].pintar();
		}
	}	
}