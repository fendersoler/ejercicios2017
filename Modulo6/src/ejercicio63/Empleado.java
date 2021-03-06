package ejercicio63;

public abstract class Empleado {
	
	protected String nombre;
	protected byte edad;
	protected char sexo;
	protected String dni;
	protected boolean bCasado;
	protected String idpersonal;
	protected float sueldo;

	public Empleado() {}
	
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
	
	abstract public void pintar();

	@Override
	public String toString() {
		return "Empleado [idpersonal=" + idpersonal + ", sueldo=" + sueldo + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + ", dni=" + dni + ", bCasado=" + bCasado + "]";
	}	
}