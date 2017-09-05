package cuenta;

public class PruebaCuenta {
	
	public static void main(String[] args) {
		
	Cuenta cuenta1 = new Cuenta("PEPE", 100);
	
	cuenta1.ingresar(100);
	System.out.println(cuenta1.getCantidad());
	
	cuenta1.retirar(150);
	System.out.println(cuenta1.getCantidad());	
	
	Cuenta cuenta2 = new Cuenta("PACO");
	cuenta2.ingresar(300);
	System.out.println(cuenta2.getCantidad());
	
	cuenta2.retirar(150);
	System.out.println(cuenta2.getCantidad());
	
	}	
}