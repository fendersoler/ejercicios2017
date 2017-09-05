package password;

import java.util.concurrent.ThreadLocalRandom;

public class Password {
	
	private int longitud;
	private String contraseña;
	
	public Password(){
		this.longitud= 8;
		this.contraseña = generarPassword(longitud);	
	};
	
	public Password (int longitud){
		this.longitud= longitud;
		this.contraseña = generarPassword(longitud);
	};
	
	public String generarPassword(int longitud){ 
		char [] miContraseña = new char [longitud];		
		for (int i= 0; i<longitud; i++){	
			int numeroAleatorio =0;
			do {
				numeroAleatorio = ThreadLocalRandom.current().nextInt(48, 122); 
			} while ((numeroAleatorio>=58 && numeroAleatorio<=64) || (numeroAleatorio>=91 && numeroAleatorio<=96));
			
			char ascii = (char)numeroAleatorio;			
			miContraseña [i]= ascii;	
		}		
		return String.valueOf(miContraseña);
	}
	
	public boolean esFuerte(String contraseña){
		
		boolean esFuerte = false;
		int mayusculas =0;
		int minusculas=0;
		int numeros = 0;
		
		for (int i = 0; i < longitud; i++) {
			int conversion = (int)contraseña.charAt(i);
			
			if (conversion >=48 && conversion<=57){numeros++;}
			else if (conversion >=65 && conversion <=90){mayusculas++;}
			else if (conversion >=97 && conversion <=122){minusculas++;}
		}	
		
		if (numeros>5 && mayusculas >2 && minusculas> 2){esFuerte= true;}		
		return esFuerte;
	}

	public int getLongitud(){return longitud;}
	public void setLongitud(int longitud){this.longitud = longitud;}
	public String getContraseña(){return contraseña;}
}