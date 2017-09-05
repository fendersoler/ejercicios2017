package serie;

public class Videojuego implements Entregable {
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	public Videojuego() {
		this.titulo = "sony";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "drama";
		this.compañia = "nintendo";
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "drama";
		this.compañia = "nintendo";
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compañia = compañia;
	}

	public String getTitulo(){return titulo;}
	public int getHorasEstimadas(){return horasEstimadas;}
	public String getGenero(){return genero;}
	public String getCompañia(){return compañia;}

	public void setTitulo(String titulo){this.titulo = titulo;}
	public void setHorasEstimadas(int horasEstimadas){this.horasEstimadas = horasEstimadas;}
	public void setGenero(String genero){this.genero = genero;}
	public void setCompañia(String compañia){this.compañia = compañia;}

	@Override
	public String toString() {
		return  titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia;
	}

	@Override
	public void entregar(){this.entregado = true;}

	@Override
	public void devolver(){this.entregado = false;}

	@Override
	public boolean isEntregado() {
		if (entregado == true){return true;}
		return false;
	}

	@Override
	public int compareTo(Object a) {		
		int resultado = 0;
		if (this.horasEstimadas<((Videojuego) a).horasEstimadas){resultado = -1;}
		else if (this.horasEstimadas>((Videojuego) a).horasEstimadas){resultado = 1;}
		return resultado;
	}	
}