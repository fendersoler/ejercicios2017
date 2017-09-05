package persona;

import java.util.concurrent.ThreadLocalRandom;

public class Persona {
	
	private static final char MUJER = 'M';
	private static final char HOMBRE = 'H';
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso; 
	private double altura;
	
	
	//Contructores:	
	
	//Por defecto:
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.dni= generaDNI();
		this.sexo= HOMBRE;
		this.peso = 0.0;
		this.altura = 0.0 ;
	}
	
	//Constructor con el nombre, edad y sexo, el resto por defecto:
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	//Constructor con todos los atributos como parámetro:
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//Métodos:
	
	public int calcularIMC(){
		double imc = peso / (altura * altura);
		int pesoIdeal;
		
		if (imc<20){
			pesoIdeal = -1;
			System.out.println("Estas en tu peso ideal");
			}
		else if (imc>=20 && imc<=25){
			pesoIdeal = 0;
			System.out.println("Estas por debajo de tu peso ideal");
			} 
		else {
			pesoIdeal = 1;
			System.out.println("Estas por encima de tu peso ideal");
			}
		return pesoIdeal;
	}
	
	public boolean esMayorDeEdad(){
		boolean mayorEdad;
		
		if (edad>=18){
			mayorEdad = true;
			System.out.println("Eres mayor de edad");
			}
		else {
			mayorEdad = false;
			System.out.println("Eres menor de edad");
		}
		
		return mayorEdad;		
	}
	
	protected char comprobarSexo(char sexo) {
		if (sexo == 'M') this.sexo = MUJER;
		else this.sexo = HOMBRE;
		return sexo;
	}
	
	@Override
	public String toString() {
		return "Persona: [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", "
				+ "sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	public String generaDNI(){
		String[] letrasAbecedario = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
				"p","q","r","s","t","u","v","w","x","y","z"};
		
		int sumaArrayNumeros=0;
		String nif ="";
		for (int i= 0; i<8; i++){						
			int numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10); 
			sumaArrayNumeros = sumaArrayNumeros + numeroAleatorio;
			Integer numero = numeroAleatorio;
			nif= nif + numero.toString();
		}
		
		String letra= letrasAbecedario [sumaArrayNumeros%26];
		
		String dni= nif + letra;
		return dni;		
	}
	
	//Métodos set de cada parámetro, excepto de DNI:
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}	
}