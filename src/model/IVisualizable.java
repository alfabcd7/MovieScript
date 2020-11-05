package model;/*
4. Crea una interfaz llamada Visualizable con los siguientes métodos:
• marcarVisto() cambia el atributo de visto a true.
• esVisto() devuelve el estado del atributo visto.
• tiempoVisto() devuelve el tiempo en minutos/segundos que se visualizó el video.
 */


public interface IVisualizable {
   void checkViewed(); // marcarVisto() //cambia el atributo de visto a true
   boolean isViewed(); //esVisto()//devuelve el estado del atributo visto
   int timeViewed();//Devuelve el tiempo en minutos7segundos q se visualizaco el video.

    public String messageViewed(String movie, String time); //Devuelve un String Describiendo la serie vista.

    public void listMovieViewed(String movie);



}