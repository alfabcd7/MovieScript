/*
5. Ahora crea una clase ejecutable y realiza lo siguiente:
• Crea dos arrays de 5 elementos cada uno. Unos de Peliculas y otro de Series.
• Crea un objeto en cada posición del array con los valores que desees. Puedes usar distintos constructores.
• Marca en visto algunas Películas y Series con el método marcarVisto()
• Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos/segundos visualizados.
• Por último, indica la serie con más temporadas y la película del año más reciente. Muéstralos en pantalla con toda su información (usa el método toString()).
 */

public class main {

    public static void main(String[] args) {
            Pelicula peliculas[] = new Pelicula[5];
            Serie series[] = new Serie[5];
            Pelicula nuevaPelicula = new Pelicula ("", "", "", 0, 0);
            Serie nuevaSerie = new Serie ("", 0, "", "", 0);

            peliculas[0] = new Pelicula ("The Dark Knight", "Action", "C. Nolan", 2008, 152);
            peliculas[1] = new Pelicula ("The Matrix", "Action", "L Wachowski", 1999, 132);
            peliculas[2] = new Pelicula ("Gladiador", "Adventure", "R. Scott", 2000, 155);
            peliculas[3] = new Pelicula ("Avengers Endgame", "Action", "A. Russo", 2019, 181);
            peliculas[4] = new Pelicula ("Avengers Infinity War", "Action", "A. Russo", 2018, 149);

            series[0] = new Serie("Lucifer", "T. Kapinos");
            series[0].setNumTemporadas(6);
            series[1] = new Serie("The Umbrella Academy", "S. Vlackman");
            series[1].setNumTemporadas(2);
            series[2] = new Serie("Game of Thrones", "D Benioff");
            series[2].setNumTemporadas(8);
            series[3] = new Serie("Grey's Anatomy", "S. Rhimes");
            series[3].setNumTemporadas(17);
            series[4] = new Serie("Breaking Bad", "V. Gilligan");
            series[4].setNumTemporadas(5);

            peliculas[1].marcarVisto();
            peliculas[3].marcarVisto();
            series[0].marcarVisto();
            series[4].marcarVisto();

            System.out.println("Peliculas vistas:");
            for(Pelicula pelicula : peliculas) {
                if(pelicula.esVisto())
                    System.out.println("Titulo. "+pelicula.getTitulo()+"\nDuracion: "+pelicula.getDuracion()+" Minutos");
                if(pelicula.getAño() > nuevaPelicula.getAño())
                    nuevaPelicula = pelicula;
            }

            System.out.println("\nSeries vistas");
            for(Serie serie : series) {
                if(serie.esVisto()) {
                    System.out.println("Titulo: "+serie.getTitulo()+"\nDuracion: "+serie.getDuracion()+" Minutos");
                    if(serie.getNumTemporadas()> nuevaSerie.getNumTemporadas())
                        nuevaSerie = serie;
                }
            }

            System.out.println("\nPelicula más nueva");
            System.out.println(nuevaPelicula.toString());
            System.out.println("\nSere con más temporadas");
            System.out.println(nuevaSerie.toString());


        }


}
