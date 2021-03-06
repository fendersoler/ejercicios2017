package ejercicio91;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PruebaExcepcion {

	public static void main(String[] args) {
		int indiceArrayEmpresa = ThreadLocalRandom.current().nextInt(1,10);		
		Empleado [] empresa = new Empleado [indiceArrayEmpresa];
		
		crearEmpleados(empresa);		
		visualizarEmpleados(empresa);
	}	

	public static void crearEmpleados(Empleado [] empresa){
		for (int i = 0; i < empresa.length; i++) {
			int persona = ThreadLocalRandom.current().nextInt(1,5);				
			if (persona == 3) {
				Tecnico tecnico = new Tecnico();				
				
				System.out.println("Introduce tu nombre: ");				
				String nombre = new Scanner(System.in).nextLine();
				tecnico.setNombre(nombre);
				
				System.out.println("Introduce tu edad: ");
				byte edad = new Scanner(System.in).nextByte();
				tecnico.setEdad(edad);
				
				System.out.println("Introduce tu sexo (H/M): ");				
				String sexo = new Scanner(System.in).nextLine();
				tecnico.setSexo(sexo.charAt(0));
				
				System.out.println("Introduce tu DNI: ");
				String dni = new Scanner(System.in).nextLine();
				try {tecnico.setDni(dni);} 
				catch (PersonalNumberException pne) {
					System.out.println(pne);
					System.out.println(pne.getMessage());
					pne.printStackTrace();
				}
				
				System.out.println("Introduce tu estado civil (casado/ soltero): ");				
				String estado= new Scanner(System.in).nextLine();		
				if (estado.contains("casado")){
					boolean bCasado = true;
					tecnico.setbCasado(bCasado);
				}else {
					boolean bCasado = false;
					tecnico.setbCasado(bCasado);
				}				
				
				System.out.println("Introduce tu id personal: ");				
				String idpersonal = new Scanner(System.in).nextLine();
				tecnico.setIdpersonal(idpersonal);
				
				System.out.println("Introduce tu sueldo: ");
				float sueldo = new Scanner(System.in).nextFloat();
				tecnico.setSueldo(sueldo);
				
				empresa [i]= tecnico;		
				
			}else {
				Obrero obrero = new Obrero();				
				
				System.out.println("Introduce tu nombre: ");
				String nombre = new Scanner(System.in).nextLine();
				obrero.setNombre(nombre);
				
				
				System.out.println("Introduce tu edad: ");
				byte edad = new Scanner(System.in).nextByte();
				obrero.setEdad(edad);
				
				System.out.println("Introduce tu sexo (H/M): ");
				String sexo = new Scanner(System.in).nextLine();
				obrero.setSexo(sexo.charAt(0));
				
				System.out.println("Introduce tu DNI: ");
				String dni = new Scanner(System.in).nextLine();
				try {obrero.setDni(dni);} 
				catch (PersonalNumberException pne) {
					System.out.println(pne);
					System.out.println(pne.getMessage());
					pne.printStackTrace();
				}
				
				System.out.println("Introduce tu estado civil (casado/ soltero): ");				
				String estado= new Scanner(System.in).nextLine();						
				if (estado.contains("casado")){
					boolean bCasado = true;
					obrero.setbCasado(bCasado);
				}else {
					boolean bCasado = false;
					obrero.setbCasado(bCasado);
				}
				
				System.out.println("Introduce tu id personal: ");				
				String idpersonal = new Scanner(System.in).nextLine();
				obrero.setIdpersonal(idpersonal);
				
				System.out.println("Introduce tu sueldo: ");
				float sueldo = new Scanner(System.in).nextFloat();
				obrero.setSueldo(sueldo);
				
				empresa [i]= obrero;
			}
			System.out.println(empresa [i]);
		}
	}
	
	public static void visualizarEmpleados(Empleado [] empresa){
		for (int i = 0; i < empresa.length; i++) {			
			empresa[i].pintar();
		}
	}	
}