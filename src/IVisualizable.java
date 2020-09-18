/*
4. Crea una interfaz llamada Visualizable con los siguientes métodos:
• marcarVisto() cambia el atributo de visto a true.
• esVisto() devuelve el estado del atributo visto.
• tiempoVisto() devuelve el tiempo en minutos/segundos que se visualizó el video.
 */


public interface IVisualizable {
    public void marcarVisto(); //cambia el atributo de visto a true
    public boolean esVisto(); //devuelve el estado del atributo
    public int tiempoVisto(); //devuelve el tiempo en minutos/segundos que se visualizó el video

}

