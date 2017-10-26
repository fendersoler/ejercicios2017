package ejercicio91;

public class PersonalNumberException extends Exception {
	
	private String mensaje;
	
	public PersonalNumberException (String mensaje){
		this.mensaje= mensaje;
	}

	public String getMensaje() {
		return "Se ha producido una PersonalNumberException";
	}
}