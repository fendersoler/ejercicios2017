package ejercicio111;

public class Tecnico extends Empleado implements Nomina{
	
	private float complemento;
	private byte quinquenios;

	public Tecnico(){}
	
	public Tecnico(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal, float sueldo, float complemento,byte quinquenios) {
		super(nombre, edad, sexo, dni, bCasado, idpersonal, sueldo);
		this.complemento=complemento;
		this.quinquenios= quinquenios;
	}
	
	public float calcularAntiguedadMensual(){
		float antiguedad=(float) (((sueldo/12)*0.05)* quinquenios);
		return antiguedad;}
	
	public float calcularComplementosMensuales(){
		float complementoM=((sueldo/12)*complemento)/100;

		return complementoM;}
	
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
		System.out.println("Tecnico nombre=" + nombre + ", edad=" + edad + ", sexo="+ sexo + ", dni=" + dni + 
		", bCasado=" + bCasado + ", idpersonal=" + idpersonal + ", sueldo=" + sueldo +
		", complemento=" + complemento + ", quinquenios=" + quinquenios + ", sueldo bruto mensual: "+ calcularSueldoBrutoMensual());
	}

	@Override
	public String toString() {
		return "Tecnico [nombre=" + nombre + ", edad=" + edad + ", sexo="+ sexo + ", dni=" + dni + 
				", bCasado=" + bCasado + ", idpersonal=" + idpersonal + ", sueldo=" + sueldo +
				", complemento=" + complemento + ", quinquenios=" + quinquenios + "]";
	}
	
}
