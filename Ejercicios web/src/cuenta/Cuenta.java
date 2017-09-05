package cuenta;

public class Cuenta {
	
	private String titular;
	private double cantidad;
		
	//Constructores:
	
	public Cuenta(String titular) {
		this.titular = titular;	
	//	this.cantidad=0;
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;		
	}
	
	//Metodos:

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [Titular=" + titular + ", Cantidad=" + cantidad + "]";
	}
	
	public void ingresar(double ingreso){
		
		if (ingreso>=0){			
			this.cantidad = ingreso + cantidad;			
		}			
	}
	
	public void retirar(double retirada){
		
		if (retirada>this.cantidad){
			this.cantidad = 0;			
		}
		else{
			this.cantidad = cantidad - retirada;
		}		
	}
}