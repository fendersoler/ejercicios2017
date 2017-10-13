package ejercicio64;

public class Obrero extends Empleado {
	
	private char turno;
	private byte trienios;

	public Obrero() {}

	public Obrero(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal,
			float sueldo, char turno,byte trienios) {
		super(nombre, edad, sexo, dni, bCasado, idpersonal, sueldo);
		this.turno=turno;
		this.trienios= trienios;
	}
	
	public float calcularAntiguedadMensual(){
		float antiguedad=(float) (((sueldo/12)*0.03)* trienios);
		return antiguedad;}
	
	public float calcularComplementosMensuales(){
		float complemento=0;
		switch (turno) {
		case 'D':
			complemento= (3*(sueldo/12))/100;
			break;
		case 'M':
			complemento= (5*(sueldo/12))/100;
			break;
		case 'T':
			complemento= (10*(sueldo/12))/100;
			break;
		case 'N':
			complemento= (15*(sueldo/12))/100;
			break;
		}
		return complemento;}
	
	public float calcularSueldoBrutoMensual(){
		float sueldoBruto;
		sueldoBruto= (sueldo/12) + calcularAntiguedadMensual() + calcularComplementosMensuales();
		return sueldoBruto;}
	
	@Override
	public void inctoSueldo(float incremento){
		this.sueldo= sueldo+incremento;	
	}	

	@Override
	public void pintar() {		
		System.out.println("Obrero nombre=" + nombre + ", edad=" + edad + ", sexo="+ sexo + ", dni=" + dni + 
		", bCasado=" + bCasado + ", idpersonal=" + idpersonal + ", sueldo=" + sueldo +
		", turno=" + turno + ", trienios=" + trienios + ", sueldo bruto mensual: "+ calcularSueldoBrutoMensual());
	}

	@Override
	public String toString() {
		return "Obrero [nombre=" + nombre + ", edad=" + edad + ", sexo="+ sexo + ", dni=" + dni + 
				", bCasado=" + bCasado + ", idpersonal=" + idpersonal + ", sueldo=" + sueldo +
				", turno=" + turno + ", trienios=" + trienios + "]";
	}
}