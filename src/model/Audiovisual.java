package model;
/*Instrucciones
Para completar esta tarea debes:
Desarrollar un código de Java siguiendo los pasos a continuación:
Crea una clase llamada model.Pelicula con las siguientes características:
• Atributos: titulo, genero, creador, año, duracion y visto.
• Constructores:
• Un constructor default.
• Un constructor con el titulo y creador. Los demás campos tendrán su valor default por tipo de dato. Visto tendrá false por defecto.
• Un constructor con todos los atributos, excepto visto.
• Métodos:
• Métodos get de todos los atributos, excepto visto.
• Métodos set de todos los atributos, excepto visto.
• Sobreescribe el método toString.

3. En principio, las clases anteriores no son padre-hija, pero sí tienen atributos en común. Realiza el análisis correcto e impleméntalo para tener un óptimo resultado.
 */

import java.util.ArrayList;

public class Audiovisual implements IVisualizable {
    //variables
    private  ArrayList <String> moviesTitlesAvailables = new ArrayList<>(); //Almacena una lista de los titulos de peliculas disponibles(Cadena de Caracteres).
    private  ArrayList <String> seriesTitlesAvailables = new ArrayList<>();//Almacena una lista de los titulos de series disponibles(Cadena de Caracteres).
    protected  Pelicula movieLogged;
    protected  Serie serieLogged;
    static int  k = 1;
    //attributes //atributos
    private String title; //titulo
    private String gender; //genero
    private String creator; //creador
    private int length;//duracion
    private int year; //año
    protected boolean viewed = false;//visto
    //Builders //constructores
    public Audiovisual(){ }
    public Audiovisual(String title , String creator){
        this.title = title;
        this.creator = creator;
    }
    public Audiovisual(String title , String gender , String creator ,int year, int length){
        this.title = title;
        this.creator = creator;
        this.gender = gender;
        this.length = length;
        this.year = year;
    }
    //Getters
    public String getTitle() {
        return title;
    }
    public int getYear(){
        return this.year;
    }
    public String getGender() {
        return gender;
    }
    public String getCreator() {
        return creator;
    }
    public int getLength() { return length; }
    //Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
    // publics methods
    public void createCatalogue(){ //manda a construir los objetos que describen el catalogo disponible.
        Pelicula.getAllPackageMoviesCatalogue();//Construye el catalogo de peliculas
        showMoviesCatalogue();
        Serie.getAllPackageSeriesCatalogue();
        showSeriesCatalogue();
    }
    // privates methods
     private void showMoviesCatalogue(){
         for (Pelicula movieCatalog : Pelicula.getMoviesCatalogue()) {
             moviesTitlesAvailables.add(movieCatalog.getTitle());
         }
         printListOfAvailableContent(moviesTitlesAvailables, (byte) 0);
     }
     private void showSeriesCatalogue(){
         for (Serie serieCatalog : Serie.getSeriesCatalogue()) {
             seriesTitlesAvailables.add(serieCatalog.getTitle());
         }
         printListOfAvailableContent(seriesTitlesAvailables, (byte) 1);
     }
     private void  printListOfAvailableContent(ArrayList<String> listAvailable , byte type ) {
         //type == 0 Movie
         //type == 1 serie
         if (type == 0)
             System.out.println("El catalogo de peliculas es el siguiente : ");
         else if (type == 1)
             System.out.println("El catalogo de Serie es el siguiente : ");
         else
             System.out.println("Error");

         for (int i = 0; i < listAvailable.size(); i++) {
              System.out.println(i + 1 + ".- " + listAvailable.get(i));
         }
     }
    //Override methods
    @Override
    public void printAudiovisualRecommendations(){
        Pelicula.recentMovie(Pelicula.getMoviesCatalogue());
        Serie.whichSeasonIsLonger(Serie.getSeriesCatalogue());
    }
    @Override
    public void printAllListOfAudiovisualViewed(){
        for (Pelicula movieViewed: Pelicula.getListOfMoviesViewed()) {
            System.out.println(movieViewed.toString(true));
        }
        for (Serie serieViewed: Serie.getListSeriesViewed()) {
            System.out.println(serieViewed.toString(true));
        }
    }
    @Override
     public void checkViewed(String nameAudiovisual) {
        if (isAvailableArticleMovie(nameAudiovisual)) {
            for (Pelicula movieCatalog : Pelicula.getMoviesCatalogue()) {
               if (movieCatalog.getTitle().equals(nameAudiovisual)) {
                   movieLogged = movieCatalog;
                   break;
               }
            }
            movieLogged.checkViewed(movieLogged);
        }else if (isAvailableArticleSerie(nameAudiovisual)){
            for (Serie serieCatalog : Serie.getSeriesCatalogue()) {
                if (serieCatalog.getTitle().equals(nameAudiovisual)) {
                    serieLogged = serieCatalog;
                    break;
                }
            }
            serieLogged.checkViewed(serieLogged);
        }else{
            System.out.println("NO existe un titulo con el nombre especifcado dentro de nuestro catalogo, elige otro....");
        }
    }
    //Public isQuestions
    public boolean isViewed() {
        if (viewed == true) { //si es true
            System.out.println("El contenido Audiovisual" + this.getTitle() + " Ya Ha Sido Vista"); //imprime esto
            return true;
        } else { //sino
            System.out.println("El contenido Audiovisual " + this.getTitle() + " No Ha Sido Vista");//esto
            return false;
        }
    }
    //Privates isQuestions
    private Boolean isAvailableArticleMovie(String nameAudiovisual){
        for (String movieCatalog : moviesTitlesAvailables ) {
            if (movieCatalog.equals(nameAudiovisual))
                return true;
        }
        return false;
    }
    private Boolean isAvailableArticleSerie(String nameAudiovisual){
        for (String serieCatalog : seriesTitlesAvailables ) {
            if (serieCatalog.equals(nameAudiovisual))
                return true;
        }
        return false;
    }
    @Override
    public int timeViewed() {
        return 0;
    }
}
