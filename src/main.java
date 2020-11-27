/*
5. Ahora crea una clase ejecutable y realiza lo siguiente:
• Crea dos arrayLists de 5 elementos cada uno. Unos de Peliculas y otro de Series. DONE
• Crea un objeto en cada posición del array con los valores que desees. Puedes usar distintos constructores. DONE
• Marca en visto algunas Películas y Series con el método marcarVisto() DONE
• Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos/segundos visualizados. DONE
• Por último, indica la serie con más temporadas y la película del año más reciente. Muéstralos en pantalla con toda su información (usa el método toString()). DONE
• Analiza el programa para cachar posibles eventos inesperados que pudieran ocurrir durante el programa e implementa las Excepciones necesarias
 */

import model.Audiovisual;
public class main {
    public static void main(String[] args) {
        Audiovisual catalogue = new Audiovisual();
        final String NEWLINE = "\n";
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Construccion de Objetos y Asignacion Default de Visto::");  //Construccion de Objetos
        catalogue.createCatalogue();
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Marcar Las Peliculas y Series que ya fueron vistas::");//Marca en visto algunas Películas y Series con el método marcarVisto()
        catalogue.checkViewed("The Avengers"); ///Marcar Visto peliculas///
        catalogue.checkViewed("Iron Man 3");
        catalogue.checkViewed("No Se Aceptan Devoluciones");
        catalogue.checkViewed("Cobra Kai"); //Marcar Visto Series//
        catalogue.checkViewed("Outlander");
        catalogue.checkViewed("Umbrella Academy");
        System.out.println(NEWLINE + NEWLINE);
        System.out.println("::Mostrar Lista de Peliculas y Series Vistas con el tiempo de Visualizacion::");
        catalogue.printAllListOfAudiovisualViewed();
        System.out.println("\n\n");
        System.out.println("::Mostrar Peliculas del reciente año y Series con mayor numero de temporadas ::");
        catalogue.printAudiovisualRecommendations();//llamando al metodo toString de cada clase para imprimir la informacion de las peliculas y series.
    }
}