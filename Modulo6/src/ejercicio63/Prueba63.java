package ejercicio63;

public class Prueba63 {

	public static void main(String[] args) {
		Obrero obrero1= new Obrero("Pepe", (byte)50, 'H', "63984502C", true, "25435432GG", 15000, 'T', (byte)2);
		obrero1.pintar();
		obrero1.inctoSueldo(10);
		obrero1.pintar();
		
		System.out.println("\n");
		
		Tecnico tecnico1= new Tecnico("Maria", (byte) 25, 'M', "368954520S", false, "87454468AC", 20000, 15,(byte)1);
		tecnico1.pintar();
		tecnico1.inctoSueldo(5);
		tecnico1.pintar();
	}

}