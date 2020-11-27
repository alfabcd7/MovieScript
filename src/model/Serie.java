package model;

import java.util.ArrayList;
import java.util.Scanner;

/*
2. Crea una claseSeriecon las siguientes características:
• Sus atributos son titulo, no. de temporadas, visto, genero, creador y duracion.
• Por default, el número de temporadas es 1 y visto false.
• El resto de atributos serán valores por defecto según el tipo de atributo.
• Constructores:
• Un constructor default.
• Un constructor con el titulo y creador. Los demás campos tendrán su valor default por tipo de dato.
• Visto tendrá false por defecto.
• Un constructor con todos los atributos, excepto visto.
• Métodos:
• Métodos get de todos los atributos, excepto visto.
• Métodos set de todos los atributos, excepto visto.
• Sobrescribe el método toString

3. En principio, las clases anteriores no son padre-hija, pero sí tienen atributos en común. Realiza el análisis correcto e impleméntalo para tener un óptimo resultado.
 */
public class Serie extends Audiovisual {
    private static ArrayList<Serie> series = new ArrayList<>();
    private static  ArrayList<Serie> listSeriesViewed = new ArrayList<>();
    final String NEWLINE = "\n";
    protected static Serie longerSeason;
    private static int limitCreationSeriePackage = 0;
    //attributes //atributos
    private  int numberSeason = 1;
    //Builders //constructores
    public Serie(){
       super();
    }
    public Serie(String title , String creator){
        super(title,creator);
    }
    public Serie(String title, String gender, String creator, int length, int numberSeason) {
        super.setTitle(title);
        super.setGender(gender);
        super.setCreator(creator);
        super.setLength(length);
        this.setNumberSeason(numberSeason);
        /* no llamamos al constructor padre de la siguiente manera super(title,gender,creator,length);
         porque a pesar que serie hereda de Audiovisual , "year o año" No es un atributo que se desea q
        herede serie (Segun lo descrito en el problema) , por tanto existe la opcion de volver a sobrecargar
         el constructor pelicula o hacer lo dado , el cual encaja con la peticion del ejercicio.*/
    }
    //Getters
    public int getNumberSeason() {
        return numberSeason;
    }
    public static ArrayList<Serie> getSeriesCatalogue(){
        return series;
    }
    protected static void getAllPackageSeriesCatalogue(){
        if (limitCreationSeriePackage >= 1) {
            System.out.println("Solo se permite crear el paquete de peliculas una sola vez");
        } else  setAllPackageSeriesCatalogue(series);
    }
    //Setters
    private static void setAllPackageSeriesCatalogue(ArrayList<Serie> series){
        series.add(new Serie("Cobra Kai", "Drama Tv , Accion y Aventuras", "Netflix", 121,2));
        series.add(new Serie("Sense8", "Netflix"));
        series.add(new Serie("Outlander", "Netflix"));
        series.add(new Serie("The Seven Deadly Sins", "Drama Tv , Accion , Anime , ,Romance, Aventuras", "Netflix", 30,4));
        series.add(new Serie("Umbrella Academy","Accion , Drama , Superpoderes","Netflix",30,2));
        limitCreationSeriePackage++;
    }
    public void setNumberSeason(int numberSeason) {
        if (numberSeason == 0) {
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("No existe el numero de temporadas definido en la serie de : " + this.getTitle() +
                        " o  es igual a cero , ingreselo(Obligatoriamente) :");
                this.numberSeason = sc.nextInt();
            } while (this.numberSeason == 0);
            System.out.println("Se establecio un total de " + this.numberSeason + " temporadas para la serie " + this.getTitle());
        } else {
            this.numberSeason = numberSeason;
        }
    }
    @Override
    public String toString() {
 //       String messageLongerSeason;
   //     messageLongerSeason = (longerSeason.getTitle() == this.getTitle())?  longerSeason.getTitle() +
     //           " Fue la model.Serie Con un mayor numero de temporadas siendo igual a : " + longerSeason.numberSeason : "....";
        return ":: model.Serie\n"+
                        "title='" + super.getTitle() + '\'' +
                                ", creator='" + super.getCreator() + '\'' +
                                ", year=" +  + super.getYear()+
                                ", length=" + super.getLength() +
                                ", viewed=" + this.viewed +
                                "\n" +"numberSeason: " + this.numberSeason + "::" ;//+ messageLongerSeason ;
    }
    public String toString(Boolean viewed){
        return ":: model.Serie:"+ NEWLINE + "Titulo ='" + super.getTitle() + '\'' + " Tiempo de visualizacion :" + timeViewed();
    }
    public String toString(int k){
        return k + ".- Serie ='" + super.getTitle() + '\''  + " | N. Temporadas : " + this.numberSeason + NEWLINE;
    }
    public void checkViewed(Serie serie) {
        if (viewed == false) {
            viewed = true;
            listSeriesViewed.add(serie);
            System.out.println("::La Serie "+ this.getTitle() + " cambio a un estado de `Visto´");
        }else{
            isViewed();
        }
    }
    @Override
    public boolean isViewed() {
        if (viewed == true){
            System.out.println("La Serie "+  this.getTitle() + " Ya Ha Sido Vista");
            return true;
        }else{
            System.out.println("La Serie "+ this.getTitle() + " No Ha Sido Vista");
            return false;
        }
    }
    public static ArrayList<Serie> getListSeriesViewed() {
        return listSeriesViewed;
    }
    @Override
    public int timeViewed() {
        if (viewed = true){
            if (this.getLength() == 0) {
                do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("No existe una duracion de minutos por episodio de la model.Serie establecida como :" + this.getTitle() + " , ingreselo(Obligatoriamente) :");
                    this.setLength(sc.nextInt());
                }while (this.getLength() == 0);
                System.out.println("Se establecio un total de " + this.getLength() + " minutos por episodio a la serie de : " + this.getTitle());
            }
            return this.getLength();
        }else{
            return (this.getLength() - this.getLength());
        }
    }
    public static void whichSeasonIsLonger(ArrayList<Serie> series) { //metodo para detectar cual es la serie con mayor temporada
        int k = 0;
        int j = 0;
        ArrayList<Serie> longerSeries = new ArrayList<>();
        longerSeries.add(series.get(j));
            for (int i = 0; i < series.size(); i++) {
                if (longerSeries.get(j).getNumberSeason() < series.get(i).getNumberSeason()) { // la serie ingresa es mayor que la anterior especificada
                    longerSeries.remove(j);
                    longerSeries.add(series.get(i));
                }else if (series.get(i).getNumberSeason() > longerSeries.get(j).getNumberSeason() ){
                    for (int l = 0; l < longerSeries.size() ; l++) {
                        longerSeries.remove(l);
                    }
                    longerSeries.add(series.get(i));
                    j = 0;
                } else if (longerSeries.get(j).getNumberSeason() == series.get(i).getNumberSeason()) { //si ambas series tienen el mismo numero de temporadas
                    if (longerSeries.get(j).getTitle().equals(series.get(i).getTitle())) {
                        continue;
                    } else {
                        longerSeries.add(series.get(i));
                        j++;
                    }
                }
            }
        for (Serie printLongerSeries: longerSeries) {
            System.out.println(printLongerSeries.toString(++k));
        }
    }
}
