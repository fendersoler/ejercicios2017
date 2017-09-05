package serie;

public class Prueba {

	public static void main(String[] args) {
		Serie series[] = new Serie [5];
		series[0] = new Serie("Juego de Tronos", 6, "historico", "David Benioff");
		series[1] = new Serie("Stranger things", 1, "thriller",  "Duffer Brothers");
		series[2] = new Serie("Black Mirror", 3, "ciencia ficcion", "Charlie Brooker");
		series[3] = new Serie("Fargo", 3, "thriller", "Noah Hawley");
		series[4] = new Serie("The Last Kingdom", 2, "historico", "Stephen Butchard");
		
		Videojuego [] videojuegos = new Videojuego [5]; 
		videojuegos[0] = new Videojuego("Sonic", 200, "plataformas", "Sega");
		videojuegos[1] = new Videojuego("Street fighter", 150, "lucha", "Capcom");
		videojuegos[2] = new Videojuego("Mario Kart", 80, "carreras", "Nintendo");
		videojuegos[3] = new Videojuego("Pacman", 100, "arcade", "Namco");
		videojuegos[4] = new Videojuego("Final Fantasy VII", 400, "rol", "Square");
		
		series[2].entregar();
		series[4].entregar();
		videojuegos[1].entregar();
		videojuegos[3].entregar();
				
		int contadorSeriesEntregadas = 0;
		for (int i = 0; i < series.length; i++) {
			if (series [i].isEntregado()==true){contadorSeriesEntregadas++;}			
		}		
		System.out.println("Series entregadas: " + contadorSeriesEntregadas);
		
		int contadorVideojuegosEntregados = 0;
		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegos[i].isEntregado()==true){contadorVideojuegosEntregados++;}			
		}	
		System.out.println("Videojuegos entregados: " + contadorVideojuegosEntregados);
		
		Serie laSerieConMasTemporadas = new Serie();		
		for (int i = 0; i < series.length; i++) {
			for (int j = 0; j < series.length; j++) {
				if (i != j){
					if (series[i].compareTo(series[j]) < 0){						
						if(laSerieConMasTemporadas.getNumeroDeTemporadas()<series[j].getNumeroDeTemporadas()){
							laSerieConMasTemporadas = series[j];
							}
					}
					else if (series[i].compareTo(series[j]) > 0){												
						if(laSerieConMasTemporadas.getNumeroDeTemporadas()<series[i].getNumeroDeTemporadas()){
							laSerieConMasTemporadas = series[i];
							}
					}else {
						System.out.println("La serie " + series[i].getTitulo()+ " la serie " + series[j].getTitulo()
								+ " tienen las mismas temporadas: " + series[i].getNumeroDeTemporadas());
					}
				}
			}
		}
		
		Videojuego elVideojuegoConMasHoras = new Videojuego();
		for (int i = 0; i < videojuegos.length; i++) {
			for (int j = 0; j < videojuegos.length; j++) {
				if (i != j){
					if (videojuegos[i].compareTo(videojuegos[j]) < 0){						
						if(elVideojuegoConMasHoras.getHorasEstimadas()<videojuegos[j].getHorasEstimadas()){elVideojuegoConMasHoras = videojuegos[j];}
					}
					else if (videojuegos[i].compareTo(videojuegos[j]) > 0){												
						if(elVideojuegoConMasHoras.getHorasEstimadas()<videojuegos[i].getHorasEstimadas()){elVideojuegoConMasHoras = videojuegos[i];}
					}
				}
			}
		}
		
		System.out.println("La serie con más temporadas es: " + laSerieConMasTemporadas);
		System.out.println("El videojuego con más horas estimadas es: " + elVideojuegoConMasHoras);
	}
}