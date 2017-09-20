package ejercicio61;

public class Empleado extends Persona {
	
	private String idpersonal;
	private float sueldo;

	public Empleado() {}
	
	public Empleado(String idpersonal, float sueldo) {		
		this.idpersonal = idpersonal;
		this.sueldo = sueldo;
	}
	
	public Empleado(String nombre, byte edad, char sexo, String dni, boolean bCasado) {
		super(nombre, edad, sexo, dni, bCasado);	
		this.idpersonal="3543654354ZZ";
		this.sueldo= 1050;
	}

	public Empleado(String nombre, byte edad, char sexo, String dni, boolean bCasado, String idpersonal,
			float sueldo) {
		this.nombre= nombre;
		this.edad= edad;
		this.sexo= sexo;
		this.dni= dni;
		this.bCasado= bCasado;	
		this.idpersonal=idpersonal;
		this.sueldo= sueldo;
	}
	
	@Override
	public void pintar(){
		super.pintar();
		System.out.println("ID del empleado: " + idpersonal+ ", sueldo: "+ sueldo);
	}

	public String getIdpersonal(){return idpersonal;}
	public float getSueldo(){return sueldo;}

	public void setIdpersonal(String idpersonal){this.idpersonal = idpersonal;}
	public void setSueldo(float sueldo){this.sueldo = sueldo;}

	@Override
	public String toString() {
		return "Empleado [idpersonal=" + idpersonal + ", sueldo=" + sueldo + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + ", dni=" + dni + ", bCasado=" + bCasado + "]";
	}	
}