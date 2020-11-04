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

public class Audiovisual {
    //attributes //atributos
    private String title; //titulo
    private String gender; //genero
    private String creator; //creador
    private int length;//duracion
    private int year; //año
    protected boolean viewed = false;//visto // tiene un modificador de acceso protected para que la clase hija

    //Builders //constructores
    Audiovisual(){
    }
    Audiovisual(String title , String creator){
        this.title = title;
        this.creator = creator;
    }
    Audiovisual(String title , String gender , String creator ,int year, int length){
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
    public void setLength(int length) {
        this.length = length;
    }
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }
    //isQuestions
    public boolean isViewed() {
        return viewed;
    }
}
