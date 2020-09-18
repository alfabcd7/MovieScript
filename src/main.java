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
        //array de objetos
        Pelicula arrayMovies[] = new Pelicula[5]; //5 peliculas ; n-1
        Serie arraySerie[] = new Serie[5]; //5 series ; n-1
        //Construccion de Objetos
        System.out.println("\n\n");
        System.out.println("::Construccion de Objetos y Asignacion Default de Visto::");
        //////////////////////////////Peliculas/////////////////////////////////////////////////
        arrayMovies[0] = new Pelicula("The Avengers", "Accion", "Marvel", 2012, 150);
        arrayMovies[1] = new Pelicula("Iron Man 3", "Accion", "Marvel", 2013, 120);
        arrayMovies[2] = new Pelicula("Proyecto Power", "Accion , Fantasia , Emocionante", "Netflix", 2020, 113);
        arrayMovies[3] = new Pelicula("Wonder Woman", "Apasionante , Inspirador , Emocionante", "Warner Bros", 2017, 141);
        arrayMovies[4] = new Pelicula("No Se Aceptan Devoluciones", "Comedia , Drama", "Mexicana", 2013, 121);
        //////////////////////////////Series/////////////////////////////////////////////////
        arraySerie[0] = new Serie("Cobra Kai", "Drama Tv , Accion y Aventuras", "Netflix", 121,2);
        arraySerie[1] = new Serie("Sense8", "Netflix");
        arraySerie[1].setNumberSeason(4);
        arraySerie[2] = new Serie("Outlander", "Netflix");
        arraySerie[1].setNumberSeason(3);
        arraySerie[3] = new Serie("The Seven Deadly Sins", "Drama Tv , Accion , Anime , ,Romance, Aventuras", "Netflix", 30,4);
        arraySerie[4] = new Serie();
        arraySerie[4].setTitle("Umbrella Academy");
        arraySerie[4].setCreator("Netflix");
        arraySerie[4].setGender("Accion , Drama , Superpoderes");
        arraySerie[4].setLength(30);
        arraySerie[4].setNumberSeason(2);

        //Bucle que busca la Serie con mayor temporadas.
        for (Serie listOfSeries : arraySerie) {
            Serie.whichSeasonIsLonger(listOfSeries);
        }
                  // Fin del bucle///

        //Marca en visto algunas Películas y Series con el método marcarVisto()
        System.out.println("\n\n");
        System.out.println("::Marcar Las Peliculas y Series que ya fueron vistas::");
        ///Marcar Visto peliculas///
        arrayMovies[0].checkViewed(); //checkViewed() = MarcarVisto();
        arrayMovies[2].checkViewed();
        //Marcar Visto Series//
        arraySerie[1].checkViewed();
        arraySerie[4].checkViewed();

        // Imprimir lista de peliculas visualizadas
        System.out.println("\n\n");
        System.out.println("::Mostrar Lista de Peliculas y Series Vistas con el tiempo de Visualizacion::");
        printListOfViewed(Pelicula.listMovieViewed,Serie.listSeriesViewed);
        //llamando al metodo toString de cada clase para imprimir la informacion de las peliculas y series.
        System.out.println("\n\n");
        System.out.println("::Mostrar informacion de todas las peliculas::");
        for (int i = 0; i < arrayMovies.length ; i++) {
            System.out.println(arrayMovies[i]);
        }
        for (int i = 0; i < arraySerie.length ; i++) {
            System.out.println(arraySerie[i]);
        }

    }
    public static void printListOfViewed(String[][] listMovie,String [][] listSeries) {
        for (int i = 0; i < Serie.sizeMoviesViewed; i++) {
            Pelicula toPrint = new Pelicula();
            System.out.println(toPrint.messageViewed(listMovie[i][0],listMovie[i][1]));
        }
        for (int i = 0; i < Serie.sizeSeriesViewed; i++) {
            Pelicula toPrint = new Serie();
            System.out.println(toPrint.messageViewed(listSeries[i][0],listSeries[i][1]));
        }
    }

    }