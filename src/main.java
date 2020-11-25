/*
5. Ahora crea una clase ejecutable y realiza lo siguiente:
• Crea dos arrayLists de 5 elementos cada uno. Unos de Peliculas y otro de Series. DONE
• Crea un objeto en cada posición del array con los valores que desees. Puedes usar distintos constructores. DONE
• Marca en visto algunas Películas y Series con el método marcarVisto() DONE
• Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos/segundos visualizados.
• Por último, indica la serie con más temporadas y la película del año más reciente. Muéstralos en pantalla con toda su información (usa el método toString()).
 */

import model.Pelicula;
import model.Serie;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        final String NEWLINE = "\n";
        ArrayList <Pelicula> movies = new ArrayList<>();
        ArrayList<Serie> series = new ArrayList<>();
        //Construccion de Objetos
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Construccion de Objetos y Asignacion Default de Visto::");
        creationOfMoviesAndSeries(movies,series);


        //Bucle que busca la model.Serie con mayor temporadas.
        for (ArrayList<Serie> listOfSeries : series) {
            Serie.whichSeasonIsLonger(listOfSeries);
        }
                  // Fin del bucle///

        //Marca en visto algunas Películas y Series con el método marcarVisto()
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Marcar Las Peliculas y Series que ya fueron vistas::");
        ///Marcar Visto peliculas///
        movies.get(0).checkViewed(); //checkViewed() = MarcarVisto();
        movies.get(2).checkViewed();
        //Marcar Visto Series//
        series.get(0).checkViewed();
        series.get(4).checkViewed();

        // Imprimir lista de peliculas visualizadas
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Mostrar Lista de Peliculas y Series Vistas con el tiempo de Visualizacion::");
        printListOfViewed(Pelicula.listMovieViewed,Serie.listSeriesViewed);
        //llamando al metodo toString de cada clase para imprimir la informacion de las peliculas y series.
        System.out.println("\n\n");
        System.out.println("::Mostrar informacion de todas las peliculas::");
        for (int i = 0; i < arrayMovies.length ; i++) { // Podrias ser un for object?
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


    private static void creationOfMoviesAndSeries(ArrayList movies , ArrayList series){
        movies.add(new Pelicula("The Avengers", "Accion", "Marvel", 2012, 150));
        movies.add(new Pelicula("Iron Man 3", "Accion", "Marvel", 2013, 120));
        movies.add(new Pelicula("Wonder Woman", "Apasionante , Inspirador , Emocionante", "Warner Bros", 2017, 141));
        movies.add(new Pelicula("No Se Aceptan Devoluciones", "Comedia , Drama", "Mexicana", 2013, 121));
        movies.add(new Pelicula("Proyecto Power", "Accion , Fantasia , Emocionante", "Netflix", 2020, 113));
        series.add(new Serie("Cobra Kai", "Drama Tv , Accion y Aventuras", "Netflix", 121,2));
        series.add(new Serie("Sense8", "Netflix"));
        series.add(new Serie("Outlander", "Netflix"));
        series.add(new Serie("The Seven Deadly Sins", "Drama Tv , Accion , Anime , ,Romance, Aventuras", "Netflix", 30,4));
        series.add(new Serie("Umbrella Academy","Accion , Drama , Superpoderes","Netflix",30,2));
    }
    }
