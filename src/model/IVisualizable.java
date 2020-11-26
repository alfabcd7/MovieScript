package model;/*
4. Crea una interfaz llamada Visualizable con los siguientes métodos:
• marcarVisto() cambia el atributo de visto a true.
• esVisto() devuelve el estado del atributo visto.
• tiempoVisto() devuelve el tiempo en minutos/segundos que se visualizó el video.
 */


import java.util.ArrayList;

public interface IVisualizable {
   void checkViewed(String nameAudivisual); // marcarVisto() //cambia el atributo de visto a true
   boolean isViewed(); //esVisto()//devuelve el estado del atributo visto
   int timeViewed();//Devuelve el tiempo en minutos7segundos q se visualizaco el video.
   void printListOfAudiovisualViewed(ArrayList<Audiovisual> listAudiovisualToPrint);


}