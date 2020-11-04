package model;

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
    protected static int sizeSeriesViewed = 0;
    protected static String [][] listSeriesViewed = new String[5][2];//almacena lista de Series visualizadas // se envia a la clase hija.
    protected static Serie longerSeason;

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
    //Setters
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
/*
    @Override
    public void checkViewed() {
        if (viewed == false) {
            viewed = true;
            listMovieViewed(this.getTitle());
            System.out.println("La model.Serie "+ this.getTitle() + " cambio a un estado de `Visto´");
        }else{
            isViewed();
        }
    }

    @Override
    public boolean isViewed() {
        if (viewed == true){
            System.out.println("La model.Serie "+  this.getTitle() + " Ya Ha Sido Vista");
            return true;
        }else{
            System.out.println("La model.Serie "+ this.getTitle() + " No Ha Sido Vista");
            return false;
        }
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

    @Override
    public String messageViewed(String movie, String time) {
        String message;
        message = "la model.Serie : " + movie + " fue visualizada";
        message = message + " con una duracion total de : " + time + " minutos por Episodio";
        return message;
    }

    @Override
    public void listMovieViewed(String movie) { //metodo para agregar a lista de Series visualizadas.
        if (viewed == true) {
            listSeriesViewed[sizeSeriesViewed++][0] = movie;//agrega a "lista de Series visualizadas" usando como indice el valor sizeSeriesViewed estatico para luego sumarle +1.
            listSeriesViewed[sizeSeriesViewed - 1][1] = Integer.toString(timeViewed()); //capturo la duracion de la model.Serie y la paso a string.
        }
    }
    public static void whichSeasonIsLonger(Serie serie) { //metodo para detectar cual es la serie con mayor temporada
        if (longerSeason == null){ //si el objeto sigue nulo o es corrido por primera vez
            longerSeason = serie; // apunta al objeto pasado como parametro
        }else if (longerSeason.numberSeason < serie.numberSeason ){ // la serie ingresa es mayor que la anterior especificada
            longerSeason = serie;// apunta al objeto pasado como parametro
        }else if (longerSeason.numberSeason == serie.numberSeason){ //si ambas series tienen el mismo numero de temporadas
            serie = (longerSeason.getLength() < serie.getLength())? serie:longerSeason; //tomara la serie con mayor duracion por episodio
        }
    }

 */
}
