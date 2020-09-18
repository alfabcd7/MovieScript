import java.util.Scanner;

/*
Para completar esta tarea debes:
Desarrollar un código de Java siguiendo los pasos a continuación:
Crea una clase llamada Pelicula con las siguientes características:
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
public class Pelicula implements IVisualizable {
    protected static int sizeMoviesViewed = 0; // se almacena el conteo de peliculas marcada como vistas
    protected static String [][] listMovieViewed = new String[5][2]; //almacena lista de peliculas visualizadas // se envia a la clase padre.
    //attributes //atributos
    private String title; //titulo
    private String gender; //genero
    private String creator; //creador
    private int year; //año
    private int length;//duracion
    protected boolean viewed = false;//visto // tiene un modificador de acceso protected para que la clase hija pueda verlo


    //Builders //constructores
    public Pelicula() { //default constructor
    }

    public Pelicula(String title, String creator) { //constructor con titulo y creador
        this.title = title;
        this.creator = creator;
    }

    public Pelicula(String title, String gender, String creator, int year, int length) { // constructor con todos los atributos.
        this.title = title;
        this.gender = gender;
        this.creator = creator;
        this.year = year;
        this.length = length;
    }
    //Getters

    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public String getCreator() {
        return creator;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

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

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        String text ; // almacenara el mensaje a ensamblar al final
        if (recentMovie(this.title)==true){ //si recentMovie vota "True" significa que la pelicula fue estrenada en 2020
            text = "<<La pelicula fue estrenada el Presente Año , por tanto es una de las mas recientes.>>"; //imprime el sgte mensaje en caso de ser "true".
        }else {
            text = "<<La pelicula es anterior al año 2020.>>"; //imprimi el sgte mensaje en caso de ser "false".
        }
        return ":: Pelicula:\n" + "Titulo ='" + this.title + '\'' +
                "; Genero='" + this.gender + '\'' +
                "; Creador='" + this.creator + '\'' +
                "; Año=" + this.year +
                "; Duracion=" + this.length +
                "; Visto=" + this.viewed + " ; " + text;
    }


    @Override
    public void checkViewed() {
        if (viewed == false) {
            viewed = true;
            listMovieViewed(this.title); //llama metodo listMovieViewed para agregarlo a la lista de peliculas visualizadas.
            System.out.println("La pelicula " + this.title + " cambio a un estado de `Visto´");//mensaje de cambio a visto

        } else {
            isViewed(); // en caso que la pelicula ya fue vista , llama al metodo "isViewed()" , marcara como vista.
        }
    }

    @Override
    public boolean isViewed() {
        if (viewed == true) { //si es true
            System.out.println("La Pelicula " + this.title + " Ya Ha Sido Vista"); //imprime esto
            return true;
        } else { //sino
            System.out.println("La Pelicula " + this.title + " No Ha Sido Vista");//esto
            return false;
        }
    }

    @Override
    public int timeViewed() {
        if (viewed = true) {//si esta marcada como vista
            if (this.length == 0) {
                do {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("No existe una duracion de pelicula establecida como :" + this.title + " , ingreselo(Obligatoriamente) :");
                    this.length = sc.nextInt();
                }while (this.length == 0);
                System.out.println("Se establecio un total de " + this.length + " minutos a la pelicula " + this.getTitle());
            }
            return this.length; //retorna la longitud
        } else {
            return (this.length - this.length);//si es falsa , retorna cero
        }
    }


    public String messageViewed(String movie, String time) {
        String message;
        message = "la Pelicula : " + movie + " fue visualizada";
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
}
