/*
5. Ahora crea una clase ejecutable y realiza lo siguiente:
• Crea dos arrayLists de 5 elementos cada uno. Unos de Peliculas y otro de Series. DONE
• Crea un objeto en cada posición del array con los valores que desees. Puedes usar distintos constructores. DONE
• Marca en visto algunas Películas y Series con el método marcarVisto() DONE
• Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos/segundos visualizados.
• Por último, indica la serie con más temporadas y la película del año más reciente. Muéstralos en pantalla con toda su información (usa el método toString()).
 */

import model.Audiovisual;
import model.Pelicula;
import model.Serie;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Audiovisual catalogue = new Audiovisual();
        final String NEWLINE = "\n";
        //Construccion de Objetos
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Construccion de Objetos y Asignacion Default de Visto::");
        catalogue.createCatalogue();
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Marcar Las Peliculas y Series que ya fueron vistas::");
        //Marca en visto algunas Películas y Series con el método marcarVisto()
        ///Marcar Visto peliculas///
        catalogue.checkViewed("The Avengers");
        catalogue.checkViewed("Iron Man 3");
        catalogue.checkViewed("No Se Aceptan Devoluciones");
        //Marcar Visto Series//
        catalogue.checkViewed("Cobra Kai");
        catalogue.checkViewed("Outlander");
        catalogue.checkViewed("Umbrella Academy");
       /* //Bucle que busca la model.Serie con mayor temporadas.
        for (Serie listOfSeries : series) {
            Serie.whichSeasonIsLonger(listOfSeries);
        }

        */
                  // Fin del bucle///
        // Imprimir lista de peliculas visualizadas
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Mostrar Lista de Peliculas y Series Vistas con el tiempo de Visualizacion::");

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

    }
