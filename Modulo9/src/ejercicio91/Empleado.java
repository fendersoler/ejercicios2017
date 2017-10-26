package ejercicio91;

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
	abstract public void inctoSueldo(float incremento);
	
	public String getNombre() {	return nombre;}
	public byte getEdad() {	return edad;}
	public char getSexo() {	return sexo;}
	public String getDni() {return dni;	}
	public boolean isbCasado() {return bCasado;	}
	public String getIdpersonal() {return idpersonal;}
	public float getSueldo() {return sueldo;}

	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setEdad(byte edad) {this.edad = edad;}
	public void setSexo(char sexo) {this.sexo = sexo;}
	
	public void setDni(String dni) throws PersonalNumberException {
		int mayusculas =0;
		int numeros=0;
		
		for (int i = 0; i <=2; i++) {
			int conversion = (int)dni.charAt(i);
			if (conversion >=65 && conversion <=90){mayusculas++;}
		}
		
		for (int i = 3; i <=7; i++) {
			int conversion = (int)dni.charAt(i);
			if (conversion >=48 && conversion<=57){numeros++;}
		}
		
		if(mayusculas == 3 && numeros == 5){this.dni = dni;}
		else{throw new PersonalNumberException("El DNI no es valido");}
	}
	
	
	public void setbCasado(boolean bCasado) {this.bCasado = bCasado;}
	public void setIdpersonal(String idpersonal) {this.idpersonal = idpersonal;}
	public void setSueldo(float sueldo) {this.sueldo = sueldo;}

	@Override
	public String toString() {
		return "Empleado [idpersonal=" + idpersonal + ", sueldo=" + sueldo + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + ", dni=" + dni + ", bCasado=" + bCasado + "]";
	}

	public void inctoSueldo() {	}	
}