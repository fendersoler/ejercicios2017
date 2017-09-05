package serie;

public class Serie implements Entregable{
	
	 private String titulo;
	 private int numeroDeTemporadas;
	 private boolean entregado;
	 private String genero;
	 private String creador;
	 
	 public Serie(){		 
		 this.titulo = "Fargo";
		 this.numeroDeTemporadas = 3;
		 this.entregado = false;
		 this.genero = "thriller";
		 this.creador = "Noah Hawley";
	}
	 
	 public Serie(String titulo, String creador){		 
		 this.titulo = titulo;
		 this.numeroDeTemporadas = 3;
		 this.entregado = false;
		 this.genero = "thriller";
		 this.creador = creador;
	}

	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo(){return titulo;}
	public int getNumeroDeTemporadas(){return numeroDeTemporadas;}
	public String getGenero(){return genero;}
	public String getCreador(){return creador;}

	public void setTitulo(String titulo){this.titulo = titulo;}
	public void setNumeroDeTemporadas(int numeroDeTemporadas){this.numeroDeTemporadas = numeroDeTemporadas;}
	public void setGenero(String genero){this.genero = genero;}
	public void setCreador(String creador){this.creador = creador;}

	@Override
	public String toString() {
		return titulo + ", Numero de temporadas=" + numeroDeTemporadas + ", Entregado=" + entregado
				+ ", Genero=" + genero + ", Creador=" + creador;
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
		if (this.numeroDeTemporadas<((Serie) a).numeroDeTemporadas){resultado = -1;}
		else if (this.numeroDeTemporadas>((Serie) a).numeroDeTemporadas){resultado = 1;}
		return resultado;
	}
}