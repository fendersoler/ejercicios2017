package ejercicio51;

public class Punto {
	
	int x;
	int y;
	
	//constructor with no parameters	
	public Punto(){
		this.x = 5;
		this.y = 5;
	}
	
	//Constructor with 2 integer 
	public Punto (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//Constructor with an object of class Punto 		
	public Punto (Punto punto){
		this.x = punto.x;
		this.y = punto.y;		
	}
	
	public void pintar(){
		System.out.println("Coordenadas x,y del punto: ("+ x +"," + y + ")" );
	}
}