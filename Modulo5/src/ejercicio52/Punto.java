package ejercicio52;

public class Punto {
	
	private int x;
	private int y;
	private static int counter;
	public static final int MIN_X=0; 
	public static final int MAX_X=300; 
	public static final int MIN_Y=0; 
	public static final int MAX_Y=300; 
	
	
	//constructor with no parameters	
		public Punto(){
			this.x = 5;
			this.y = 5;
		}
		
		//Constructor with 2 integer 
		public Punto (int x, int y){
			counter++;
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
		
	//Public function to write the point coord.
	public void pintarPuntoValido(){
		makeValidPoint();
		System.out.println("Coordenadas x,y del punto: ("+ x +"," + y + ")" );
	}
	
	//Public function to return the number of points
	public static int getCounter(){
		return counter;
	}
	
	//Private function to check if the points are in between the limits
	private void makeValidPoint (){
		x = x>=0 ? x:MIN_X;
		x = x<=300 ? x: MAX_X;
		y = y>=0 ? y:MIN_Y;
		y = y<=300 ? y: MAX_Y;
	}
}