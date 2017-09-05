package electrodomestico;

public class Television extends Electrodomestico {
	
	private int resolucion;
	private boolean sintonizadorTDT;
	

	public Television() {
		super();
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}

	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion=20;
		this.sintonizadorTDT=false;
	}

	public Television(double precioBase, String color, char consumoEnergetico, int peso, 
			int resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	public double precioFinal(){		
		double precioFinalTelevision = super.precioFinal();
		if (sintonizadorTDT==true){precioFinalTelevision = precioFinalTelevision+50;}
		if (resolucion>40){precioFinalTelevision = precioFinalTelevision*1.3;}
		return precioFinalTelevision;		
	}

	public int getResolucion() {return resolucion;}
	public boolean isSintonizadorTDT(){return sintonizadorTDT;}
}