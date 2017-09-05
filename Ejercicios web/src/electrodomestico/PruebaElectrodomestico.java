package electrodomestico;

public class PruebaElectrodomestico {

	public static void main(String[] args) {
		
		Electrodomestico [] misElectrodomesticos = new Electrodomestico[10];
		
		misElectrodomesticos[0] = new Electrodomestico(200,"gris",'b',10);		
		misElectrodomesticos[1] = new Lavadora(500,"NEGRO",'a',25,40);		
		misElectrodomesticos[2] = new Television(400,"azul",'c',10,45,true);		
		misElectrodomesticos[3] = new Electrodomestico(300,"verde",'f',50);		
		misElectrodomesticos[4] = new Lavadora(100,"BLANCO",'E',85,60);		
		misElectrodomesticos[5] = new Television(50,"ROJO",'F',20,25,false);		
		misElectrodomesticos[6] = new Electrodomestico(70,"amarillo",'d',10);		
		misElectrodomesticos[7] = new Lavadora(80,"gris",'d',45,20);		
		misElectrodomesticos[8] = new Television(600,"ROJO",'a',20,35,true);
		misElectrodomesticos[9] = new Electrodomestico(60,"azul",'c',40);
		
		double precioDeTodasLasLavadoras=0.0;
		double precioDeTodasLasTelevisiones=0.0;		
		double precioDeTodo= 0.0;
		
		for (int i = 0; i < misElectrodomesticos.length; i++) {
						
			if( misElectrodomesticos [i] instanceof Lavadora) {
				double precioLavadora = misElectrodomesticos[i].precioFinal();
				precioDeTodasLasLavadoras= precioDeTodasLasLavadoras + precioLavadora;
			}else if( misElectrodomesticos [i] instanceof Television) {
				double precioTelevision = misElectrodomesticos[i].precioFinal();
				precioDeTodasLasTelevisiones= precioDeTodasLasTelevisiones + precioTelevision;				
			}
			
			if (misElectrodomesticos [i] instanceof Electrodomestico){
				double precioElectrodomestico = misElectrodomesticos[i].precioFinal();
				precioDeTodo= precioDeTodo + precioElectrodomestico;
			}
		}
		
		System.out.println("Todas las lavadoras valen:  " +  precioDeTodasLasLavadoras + " €");
		System.out.println("Todas las televisiones valen: " +  precioDeTodasLasTelevisiones + " €");
		System.out.println("Todos los electrodomesticos valen " +  precioDeTodo + " €");
	}
}