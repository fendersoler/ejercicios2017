package ejercicio61;

public class Prueba61 {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		System.out.println(persona1);
		persona1.pintar();
		System.out.println("\n");
		
		Persona persona2 = new Persona("Pepito", (byte) 50, 'H', "89651974Z",true);
		System.out.println(persona2);
		persona2.pintar();
		System.out.println("\n");

		Empleado empleado1 = new Empleado();
		System.out.println(empleado1);
		empleado1.pintar();
		System.out.println("\n");
		
		Empleado empleado2 = new Empleado("3543574354H", 1000);
		System.out.println(empleado2);
		empleado2.pintar();
		System.out.println("\n");
		
		Empleado empleado3 = new Empleado("Churra", (byte) 30, 'M', "89524648A", false);
		System.out.println(empleado3);
		empleado3.pintar();
		System.out.println("\n");
		
		Empleado empleado4 = new Empleado("Perico", (byte) 19, 'H', "33221155G", false, "654354343aa", 500);
		System.out.println(empleado4);
		empleado4.pintar();
		System.out.println("\n");

	}
}