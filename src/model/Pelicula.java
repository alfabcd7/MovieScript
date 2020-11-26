package model;

import model.IVisualizable;

import java.util.ArrayList;
import java.util.Scanner;


public class Pelicula extends Audiovisual{
    private ArrayList <Pelicula> movies = new ArrayList<>();
    final String NEWLINE = "\n";
    protected static int sizeMoviesViewed = 0; // se almacena el conteo de peliculas marcada como vistas

    //Builders //constructores
    public Pelicula() { //default constructor
    }
    public Pelicula(String title, String creator) { //constructor con titulo y creador
        super(title,creator);
    }
    public Pelicula(String title, String gender, String creator, int year, int length) { // constructor con todos los atributos.
        super(title,gender,creator,year,length);
    }

    public ArrayList<Pelicula> getMoviesCatalogue(){
        setMoviesCatalogue();
        return movies;
    }
    private void setMoviesCatalogue(){
        movies.add(new Pelicula("The Avengers", "Accion", "Marvel", 2012, 150));
        movies.add(new Pelicula("Iron Man 3", "Accion", "Marvel", 2013, 120));
        movies.add(new Pelicula("Wonder Woman", "Apasionante , Inspirador , Emocionante", "Warner Bros", 2017, 141));
        movies.add(new Pelicula("No Se Aceptan Devoluciones", "Comedia , Drama", "Mexicana", 2013, 121));
        movies.add(new Pelicula("Proyecto Power", "Accion , Fantasia , Emocionante", "Netflix", 2020, 113));
    }
    @Override
    public String toString() {
       /* String text ; // almacenara el mensaje a ensamblar al final
        if (recentMovie(this.title)==true){ //si recentMovie vota "True" significa que la pelicula fue estrenada en 2020
            text = "<<La pelicula fue estrenada el Presente Año , por tanto es una de las mas recientes.>>"; //imprime el sgte mensaje en caso de ser "true".
        }else {
            text = "<<La pelicula es anterior al año 2020.>>"; //imprimi el sgte mensaje en caso de ser "false".
        }
        */
        return ":: model.Pelicula:"+ NEWLINE + "Titulo ='" + super.getTitle() + '\'' +
                "; Genero='" + super.getGender() + '\'' +
                "; Creador='" + super.getCreator() + '\'' +
                "; Año=" + super.getYear() +
                "; Duracion=" + super.getLength() +
                "; Visto=" + this.viewed + " ; " ;//+ text;
    }


    @Override
    public void checkViewed() { //metodo heredado de Audiovisual, es posible aplicar poliformismo.
        if (viewed == false) {
            viewed = true;
            listMovieViewed.add(this.getTitle()); //llama metodo listMovieViewed para agregarlo a la lista de peliculas visualizadas.
            System.out.println("La pelicula " + this.getTitle() + " cambio a un estado de `Visto´");//mensaje de cambio a visto
        } else {
            isViewed(); // en caso que la pelicula ya fue vista , llama al metodo "isViewed()" ,
        }
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
    @Override
    public void printListOfAudiovisualViewed(ArrayList<Audiovisual> listAudiovisualToPrint){
        System.out.println("La lista de peliculas visualizadas es la siguiente: ");
        for (Audiovisual audiovisuals : listAudiovisualToPrint) {
            System.out.println(k++ + ".-" + audiovisuals.getTitle() + " fueron visualizados una cantidad de " + audiovisuals.timeViewed() + " minutos");
        }
    }
    @Override
    public int timeViewed() {
        if (viewed = true) {//si esta marcada como vista
            if (this.getLength() == 0) {
                do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("No existe una duracion de pelicula establecida para el titulo de :" + this.getTitle() + " , ingreselo(Obligatoriamente) :");
                    this.setLength(sc.nextInt());
                }while (this.getLength()== 0);
                System.out.println("Se establecio un total de " + this.getLength() + " minutos a la pelicula " + this.getTitle());
            }
            return this.getLength(); //retorna la longitud
        } else {
            return (this.getLength() - this.getLength());//si es falsa , retorna cero
        }
    }
/*

    public String messageViewed(String movie, String time) {
        String message;
        message = "la model.Pelicula : " + movie + " fue visualizada";
        message = message + " con una duracion total de : " + time + " minutos";
        return message;
    }

    @Override
    public void listMovieViewed(String movie) { //metodo para agregar a lista de peliculas visualizadas.
        if (viewed == true) {
            listMovieViewed[sizeMoviesViewed++][0] = movie; //agrega a "lista de peliculas visualizadas" usando como indice el valor sizeMoviesViewed estatico para luego sumarle +1.
            listMovieViewed[sizeMoviesViewed - 1][1] = Integer.toString(timeViewed()); //capturo la duracion de la pelicula y la paso a string , con indice sizeMoviesViewed - 1(debido a q ue
            //en la anterior linea fue aumentado// ).
             }
        }

    //metodo para analizar las peliculas estrenadas en el 2020 , devuleve true al ser del 2020
    //la idea es pasarlo al metodo toString();
    public boolean recentMovie(String movie) {
        boolean value = false ;
        if (movie == null || this.year == 0) {
           value = false;
        }
        if ( this.year == 2020) {
            value = true;
        }
        return value;
    }
 */
}
