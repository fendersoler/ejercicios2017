package ejercicio62;

public class Corredor extends Persona {
	
	private float distancia;

	public Corredor(String nombre, byte edad, char sexo, String dni, boolean bCasado, float distancia) {
		super(nombre, edad, sexo, dni, bCasado);
		this.distancia = distancia;
	}	
	
	@Override
	public void pintar(){
		
		System.out.println("Corredor [distancia=" + distancia + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
				+ ", dni=" + dni + ", bCasado=" + bCasado + "]");	
	}

	public float getDistancia(){return distancia;}
	public void setDistancia(float distancia){this.distancia = distancia;}	
}