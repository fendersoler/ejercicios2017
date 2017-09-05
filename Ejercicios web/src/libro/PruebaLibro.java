package libro;

public class PruebaLibro {

	public static void main(String[] args) {

		Libro libro1 = new Libro(364564371, "El juego de Ender", "Orson Scott Card", 180);
		Libro libro2 = new Libro(543454254, "Un mundo feliz", "Aldous Huxley", 150);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		if (libro1.compareTo(libro2)>0){
			System.out.println("El libro " + libro1.getTitulo()+ " tiene más páginas que " + libro2.getTitulo());
		} else if (libro1.compareTo(libro2)<0){
			System.out.println("El libro " + libro2.getTitulo()+ " tiene más páginas que " + libro1.getTitulo());
		} else{
			System.out.println("Ambos libros tienen el mismo número de paginas");
		}
	}
}