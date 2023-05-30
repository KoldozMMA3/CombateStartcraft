package JuegoStartcraft;
//CLASE DIRECTOR.
/**
 * Clase que actua como Director en el patron de diseño Builder. Es responsable de
 * construir un objeto Guerrero utilizando un GuerreroBuilder especifico.
 * 
 * En este caso, la clase ConstruirAtributos es el Director que utiliza un GuerreroBuilder
 * para construir los atributos del Guerrero.
 * 
 * @author: Cristian Carrizales Luna
 */
public class ConstruirAtributos {
    private GuerreroBuilder guerreroBuilder;

    /**
     * Establece el GuerreroBuilder a utilizar para construir los atributos del Guerrero.
     * 
     * @param gb El GuerreroBuilder a utilizar.
     */
    public void setGuerreroBuilder(GuerreroBuilder gb) {
        guerreroBuilder = gb;
    }

    /**
     * Obtiene el Guerrero construido.
     * 
     * @return El Guerrero construido.
     */
    public Guerrero getGuerrero() {
        return guerreroBuilder.getGuerrero();
    }

    /**
     * Construye los atributos del Guerrero utilizando el GuerreroBuilder.
     * 
     * Este metodo invoca los metodos del GuerreroBuilder para construir los atributos
     * del Guerrero, como el danio, la vida, la cantidad, el costo y el nivel.
     */
    public void construirAtributos() {
        guerreroBuilder.crearNuevoGuerrero();
        guerreroBuilder.buildDanio();
        guerreroBuilder.buildVida();
        guerreroBuilder.buildCantidad();
        guerreroBuilder.buildCosto();
        guerreroBuilder.buildNivel();
    }
}