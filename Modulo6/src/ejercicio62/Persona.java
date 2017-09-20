package ejercicio62;

public class Persona {
	
	protected String nombre;
	protected byte edad;
	protected char sexo;
	protected String dni;
	protected boolean bCasado;
	
	public Persona(){}

	public Persona(String nombre, byte edad, char sexo, String dni, boolean bCasado) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.dni = dni;
		this.bCasado = bCasado;
	}
	
	public void pintar(){
		System.out.println("Nombre: "+ nombre + ", edad: "+ edad + ", sexo: "+ sexo + ", DNI: " + dni
				+ ", casado: "+ bCasado);
	}

	public String getNombre(){return nombre;}
	public byte getEdad(){return edad;}
	public char getSexo(){return sexo;}
	public String getDni(){return dni;}
	public boolean isbCasado(){return bCasado;}

	public void setNombre(String nombre){this.nombre = nombre;}
	public void setEdad(byte edad){this.edad = edad;}
	public void setSexo(char sexo){this.sexo = sexo;}
	public void setDni(String dni){this.dni = dni;}
	public void setbCasado(boolean bCasado){this.bCasado = bCasado;}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (bCasado != other.bCasado)
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", dni=" + dni + ", bCasado="
				+ bCasado + "]";
	}	
}