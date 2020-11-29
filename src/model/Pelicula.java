package model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Pelicula extends Audiovisual{
    private static ArrayList <Pelicula> movies = new ArrayList<>();
    private static ArrayList<Pelicula> listMovieViewed = new ArrayList<>();
    final String NEWLINE = "\n";
    private static int limitCreationMoviePackage = 0;
    //Builders //constructores
    public Pelicula() {} //default constructor
    public Pelicula(String title, String creator) { //constructor con titulo y creador
        super(title,creator); }
    public Pelicula(String title, String gender, String creator, int year, int length) { // constructor con todos los atributos.
        super(title,gender,creator,year,length); }
    //Getters
    public static ArrayList<Pelicula> getMoviesCatalogue(){
        return movies;
    }
    public static ArrayList<Pelicula> getListOfMoviesViewed(){
        return listMovieViewed;
    }
    protected static void getAllPackageMoviesCatalogue(){
        if (limitCreationMoviePackage >= 1) {
            System.out.println("Solo se permite crear el paquete de peliculas una sola vez");
        } else setAllPackageMoviesCatalogue(movies);
    }
    //Setters
    private static void setAllPackageMoviesCatalogue(ArrayList <Pelicula> movies){
        movies.add(new Pelicula("The Avengers", "Accion", "Marvel", 2012, 150));
        movies.add(new Pelicula("Iron Man 3", "Accion", "Marvel", 2013, 120));
        movies.add(new Pelicula("Wonder Woman", "Apasionante , Inspirador , Emocionante", "Warner Bros", 2017, 141));
        movies.add(new Pelicula("No Se Aceptan Devoluciones", "Comedia , Drama", "Mexicana", 2013, 121));
        movies.add(new Pelicula("Proyecto Power", "Accion , Fantasia , Emocionante", "Netflix", 2020, 113));
        limitCreationMoviePackage++;
    }
    //Public Methods.
    public static void recentMovie(ArrayList<Pelicula> movie) {
        int k = 0;
        for (Pelicula movieCatalog : movie) {
            if(movieCatalog.getYear() == 2020 )
                System.out.println(movieCatalog.toString(++k));
        }
    }
    //Override methods
    @Override
    public String toString() {
        return ":: model.Pelicula:"+ NEWLINE + "Titulo ='" + super.getTitle() + '\'' +
                "; Genero='" + super.getGender() + '\'' +
                "; Creador='" + super.getCreator() + '\'' +
                "; Año=" + super.getYear() +
                "; Duracion=" + super.getLength() +
                "; Visto=" + this.viewed + " ; " ;//+ text;
    }
        //toString overload
    public String toString(Boolean viewed){
        return ":: model.Pelicula:"+ NEWLINE + "Titulo ='" + super.getTitle() + '\''  + " Tiempo de visualizacion :" + timeViewed();
    }
    public String toString(int k){
        return k+ ".- Pelicula ='" + super.getTitle() + '\''  + " | año : " + this.getYear() + NEWLINE;
    }
    @Override
    public boolean isViewed() {
        if (viewed == true) { //si es true
            System.out.println("La Pelicula " + this.getTitle() + " Ya Ha Sido Vista"); //imprime esto
            return true;
        } else { //sino
            System.out.println("La Pelicula " + this.getTitle() + " No Ha Sido Vista");//esto
            return false;
        }
    }
    public void checkViewed(Pelicula pelicula) { //metodo heredado de Audiovisual, es posible aplicar poliformismo.
        if (viewed == false) {
            viewed = true;
            listMovieViewed.add(pelicula); //llama metodo listMovieViewed para agregarlo a la lista de peliculas visualizadas.
            System.out.println("La pelicula " + this.getTitle() + " cambio a un estado de `Visto´");//mensaje de cambio a visto
        } else {
            isViewed(); // en caso que la pelicula ya fue vista , llama al metodo "isViewed()" ,
        }
    }
    @Override
    public int timeViewed() {
        if (viewed = true) {//si esta marcada como vista
            if (this.getLength() == 0) {
                do {
                    try{
                        Scanner sc = new Scanner(System.in);
                        System.out.println("No existe una duracion de pelicula establecida para el titulo de :" + this.getTitle() + " , ingreselo(Obligatoriamente) :");
                        this.setLength(sc.nextInt());
                    }catch (InputMismatchException e){
                        System.out.println("NO ingresaste un valor valido.");
                        System.out.println("intenta de nuevo.");
                    }
                }while (this.getLength()== 0);
                System.out.println("Se establecio un total de " + this.getLength() + " minutos a la pelicula " + this.getTitle());
            }
            return this.getLength(); //retorna la longitud
        } else {
            return (this.getLength() - this.getLength());//si es falsa , retorna cero
        }
    }
}
