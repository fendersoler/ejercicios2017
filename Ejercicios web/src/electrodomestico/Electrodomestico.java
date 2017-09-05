package electrodomestico;

public class Electrodomestico {
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	protected static final double precio = 100.0;
	protected static final String colorBlanco = "blanco";
	protected static final char consumo = 'F';
	protected static final int kilos = 5;
	
	public Electrodomestico() {
		this.precioBase = precio;
		this.color = colorBlanco;
		this.consumoEnergetico = consumo;
		this.peso = kilos;
	}
	
	public Electrodomestico(double precioBase, int peso) {
		this.precioBase = precioBase;
		this.color = colorBlanco;
		this.consumoEnergetico = consumo;
		this.peso = peso;
	}	
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}	
	
	private char comprobarConsumoEnergetico(char letra){
		char[] letraConsumoEnergetico = {'A','B','C','D','E','F'};	
		
		String letraPorTeclado = Character.toString(letra);
		String mayuscula= letraPorTeclado.toUpperCase();
		char letraMayuscula= mayuscula.charAt(0);
		
		int i =0;
		do {
			if (letraConsumoEnergetico[i] == letraMayuscula){
				this.consumoEnergetico=letraConsumoEnergetico[i];
				i=letraConsumoEnergetico.length;
			}else{
				this.consumoEnergetico=consumo;
				i++;
			}
		} while (i<letraConsumoEnergetico.length);
		
		return consumoEnergetico;
	}
	
	private String comprobarColor(String color){
		
		String [] coloresDisponibles ={"blanco","rojo","azul","gris","negro"};
		
		String colorEnMinusculas = color.toLowerCase();
		
		int i =0;
		do {
			if (coloresDisponibles[i].equals(colorEnMinusculas)){
				this.color=coloresDisponibles[i];
				i=coloresDisponibles.length;
			}else{
				this.color=colorBlanco;
				i++;
			}
		} while (i<coloresDisponibles.length);

		return this.color;		
	}
	
	public double precioFinal(){
		
		double precioFinalDelElectrodomestico = this.precioBase;
		
		switch (this.consumoEnergetico) {
		case 'A':
			precioFinalDelElectrodomestico= precioFinalDelElectrodomestico+100;
			break;			
		case 'B':
			precioFinalDelElectrodomestico= precioFinalDelElectrodomestico+80;
			break;			
		case 'C':
			precioFinalDelElectrodomestico= precioFinalDelElectrodomestico+60;
			break;
		case 'D':
			precioFinalDelElectrodomestico= precioFinalDelElectrodomestico+50;
			break;
		case 'E':
			precioFinalDelElectrodomestico= precioFinalDelElectrodomestico+30;
			break;
		case 'F':
			precioFinalDelElectrodomestico= precioFinalDelElectrodomestico+10;
			break;
		}
		
		if (this.peso>=0 && this.peso<=19){precioFinalDelElectrodomestico = precioFinalDelElectrodomestico+10;}
		else if (this.peso>=20 && this.peso<=49){precioFinalDelElectrodomestico = precioFinalDelElectrodomestico+50;}
		else if (this.peso>=50 && this.peso<=79){precioFinalDelElectrodomestico = precioFinalDelElectrodomestico+80;}
		else if (this.peso>=80){precioFinalDelElectrodomestico = precioFinalDelElectrodomestico+100;}
		
		return precioFinalDelElectrodomestico;
	}
	
	public double getPrecioBase(){return precioBase;}
	public String getColor(){return color;}
	public char getConsumoEnergetico(){return consumoEnergetico;}
	public int getPeso(){return peso;}	
}