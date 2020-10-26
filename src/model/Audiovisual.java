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

public abstract class Audiovisual {
    //attributes //atributos
    private String title; //titulo
    private String gender; //genero
    private String creator; //creador
    private int length;//duracion
    protected boolean viewed = false;//visto // tiene un modificador de acceso protected para que la clase hija

    public abstract String getTitle();

    public abstract void setTitle(String title);

    public abstract String getGender();
    public abstract void setGender(String gender);
    public abstract String getCreator();
    public abstract void setCreator(String creator);
    public abstract int getLength();
    public abstract void setLength(int length) ;
}
