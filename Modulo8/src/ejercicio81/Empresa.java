package ejercicio81;

import java.util.concurrent.ThreadLocalRandom;

public class Empresa {
	
	public static void main(String[] args) {
		
		int indiceArrayEmpresa = ThreadLocalRandom.current().nextInt(1,10);		
		Empleado [] empresa = new Empleado [indiceArrayEmpresa];
		
		crearEmpleados(empresa);
		System.out.println("\n");
		visualizarEmpleados(empresa);
		System.out.println("\n");
		subirSueldo(empresa);		
	}
	
	public static void crearEmpleados(Empleado [] empresa){
		for (int i = 0; i < empresa.length; i++) {
			int persona = ThreadLocalRandom.current().nextInt(1,5);				
			if (persona == 3) {empresa [i]= new Tecnico();} 
			else {empresa [i]= new Obrero();}
			System.out.println(empresa [i]);
		}
	}
	
	public static void visualizarEmpleados(Empleado [] empresa){
		for (int i = 0; i < empresa.length; i++) {			
			empresa[i].pintar();
		}
	}
	
	public static void subirSueldo(Empleado [] empresa){
		for (int i = 0; i < empresa.length; i++) {
			empresa[i].inctoSueldo(ThreadLocalRandom.current().nextInt(1,100)*10);
			empresa[i].pintar();
		}		
	}
}