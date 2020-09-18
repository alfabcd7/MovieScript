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
public class Serie extends Audiovisual implements IVisualizable{

    private int numTemporadas = 1;

    public Serie(String titulo, String genero, String creador, int duracion, int numTemporadas) {
        super(titulo, genero,creador,duracion);
        this.numTemporadas = numTemporadas;
    }

    public Serie(String titulo, String creador) {
        super(titulo,creador);
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador, int duracion) {
        super(titulo,genero,creador,duracion);
        this.setNumTemporadas(numTemporadas);
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    @Override
    public String toString() {
        return ("Titulo: "+this.getTitulo()+
                "\nGenero: "+this.getGenero()+
                "\nCreador: "+this.getCreador()+
                "\nDuracion: "+this.getDuracion());
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
