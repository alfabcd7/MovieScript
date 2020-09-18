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
public class Pelicula extends Audiovisual implements IVisualizable {
    private int año;

    public Pelicula() {
        super();
    }

    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
    }

    public Pelicula(String titulo, String genero, String creador, int año, int duracion) {
        super(titulo, genero, creador, duracion);
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return ("Titulo: " + this.getTitulo() +
                "\nAño: " + this.getAño() +
                "\nGenero: " + this.getGenero() +
                "\nCreador " + this.getCreador() +
                "\nDuracion: " + this.getDuracion());
    }

    @Override
    public void marcarVisto() {
        // TODO Auto-generated method stub
        this.visto = !this.visto;
    }

    @Override
    public boolean esVisto() {
        // TODO Auto-generated method stub
        return this.visto;
    }

    @Override
    public int tiempoVisto() {
        // TODO Auto-generated method stub
        return this.getDuracion();
    }

}

