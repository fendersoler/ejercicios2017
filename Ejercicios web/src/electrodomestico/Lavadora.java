package electrodomestico;

public class Lavadora extends Electrodomestico {
	
	private int carga;
	protected static final int cargaPorDefecto = 5;

	public Lavadora() {
		super();
		this.carga = cargaPorDefecto;
	}

	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		this.carga = cargaPorDefecto;
	}

	public Lavadora(double precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}
	
	public double precioFinal(){		
		double precioFinalLavadora = super.precioFinal();		
		if (carga>30){precioFinalLavadora = precioFinalLavadora+50;}		
		return precioFinalLavadora;		
	}

	public int getCarga(){return carga;}	
}