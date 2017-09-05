package serie;

public class Videojuego implements Entregable {
	
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
	public Videojuego() {
		this.titulo = "sony";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "drama";
		this.compa�ia = "nintendo";
	}
	
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "drama";
		this.compa�ia = "nintendo";
	}
	
	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}

	public String getTitulo(){return titulo;}
	public int getHorasEstimadas(){return horasEstimadas;}
	public String getGenero(){return genero;}
	public String getCompa�ia(){return compa�ia;}

	public void setTitulo(String titulo){this.titulo = titulo;}
	public void setHorasEstimadas(int horasEstimadas){this.horasEstimadas = horasEstimadas;}
	public void setGenero(String genero){this.genero = genero;}
	public void setCompa�ia(String compa�ia){this.compa�ia = compa�ia;}

	@Override
	public String toString() {
		return  titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compa�ia=" + compa�ia;
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