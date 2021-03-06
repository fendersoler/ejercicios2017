package ejercicio64_empresa;

import java.util.concurrent.ThreadLocalRandom;

import ejercicio64.Empleado;
import ejercicio64.Obrero;
import ejercicio64.Tecnico;

public class Empresa {
	
	public static void main(String[] args) {
		
		int indiceArrayEmpresa = ThreadLocalRandom.current().nextInt(1,10);		
		Empleado [] empresa = new Empleado [indiceArrayEmpresa];
		
		crearEmpleados(empresa);
		visualizarEmpleados(empresa);
		subirSueldo(empresa);		
	}
	
	public static void crearEmpleados(Empleado [] empresa){
		for (int i = 0; i < empresa.length; i++) {
			int persona = ThreadLocalRandom.current().nextInt(1,5);				
			if (persona == 3) {empresa [i]= new Tecnico();} 
			else {empresa [i]= new Obrero();}
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