package libro;

public class Libro implements Comparable<Libro> {

	private long isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Libro(long isbn, String titulo, String autor, int numeroPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public long getIsbn(){return isbn;}
	public String getTitulo(){return titulo;}
	public String getAutor(){return autor;}
	public int getNumeroPaginas(){return numeroPaginas;}

	public void setIsbn(long isbn){this.isbn = isbn;}
	public void setTitulo(String titulo){this.titulo = titulo;}
	public void setAutor(String autor){this.autor = autor;}
	public void setNumeroPaginas(int numeroPaginas){this.numeroPaginas = numeroPaginas;}
	
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + " creado por " + autor + " tiene " + numeroPaginas + " páginas.";
	}

	@Override
	public int compareTo(Libro o) {
		int resultado=0;		
		if (this.numeroPaginas > o.getNumeroPaginas()){resultado = 1;}
		else if(this.numeroPaginas < o.getNumeroPaginas()){resultado = -1;}
		return resultado;
	}
}