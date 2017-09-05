package ejercicio53;

public class Punto {

	private int x;
	private int y;
	private static int counter;
	public static final int MIN_X = 0;
	public static final int MAX_X = 300;
	public static final int MIN_Y = 0;
	public static final int MAX_Y = 300;

	// constructor with no parameters
	public Punto() {
		this.x = 5;
		this.y = 5;
	}

	// Constructor with 2 integer
	public Punto(int x, int y) {
		counter++;
		this.x = x;
		this.y = y;
	}

	// Constructor with an object of class Punto
	public Punto(Punto punto) {
		this.x = punto.x;
		this.y = punto.y;
	}

	public void pintar() {
		System.out.println("Point x,y coordinates: (" + x + "," + y + ")");
	}

	// Public function to return the number of points
	public static int getCounter() {
		return counter;
	}

	// Private function to check if the points are in between the limits
	private void makeValidPoint() {
		x = x >= 0 ? x : MIN_X;
		x = x <= 300 ? x : MAX_X;
		y = y >= 0 ? y : MIN_Y;
		y = y <= 300 ? y : MAX_Y;
	}
		
	// Public function to write the point coord.
	public void pintarPuntoValido() {
		makeValidPoint();
		System.out.println("Point x,y coordinates: (" + x + "," + y + ")");
	}

	// Metodos sobrecargados
	
	//Primero: Sin recibir ningún parámetro, las coordenadas x e y del punto serán 0
	public void moverPunto() {
		this.x = 0;
		this.y = 0;
	}
	
	// Public function to write moverPunto.
	public void pintarMoverPunto() {
		moverPunto();
		System.out.println("Point x,y coordinates: (" + x + "," + y + ")");
	}
	
	//Segundo: Recibiendo un parámetro, cambia las coordenadas x e y, incrementado el número y sin sobrepasar los límites 
	public void moverPunto(int x1){
		//Random random = new Random();	
		//int number = random.nextInt(1000);
		this.x += x1;
		this.y += x1;
		makeValidPoints(x,y);
	}
	
	//Tercero: Recibiendo dos parámetros, cambia las coordenadas x e y, incrementado cada una con uno de los valores recibidos y sin sobrepasar los límites
	public void moverPunto(int x2, int y2) {
		this.x += x2;
		this.x += x2;
		makeValidPoints(x,y);
	}
	
	private void makeValidPoints(int x, int y) {
		this.x = x >= 0 ? x : MIN_X;
		this.x = x <= 300 ? x : MAX_X;
		this.y = y >= 0 ? y : MIN_Y;
		this.y = y <= 300 ? y : MAX_Y;
	}
}