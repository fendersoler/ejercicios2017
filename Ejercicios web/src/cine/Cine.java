package cine;

public class Cine {
		
	private String pelicula;
	private int precio;
	
	public Cine(int precio){
		this.pelicula = "";
		this.precio = precio;
	}

	public String getPelicula(){return pelicula;}
	public int getPrecio(){return precio;}
	
	public void setPelicula(String pelicula){this.pelicula = pelicula;}

	@Override
	public String toString(){return "Cine [pelicula=" + pelicula + ", precio=" + precio + "]";}	
}