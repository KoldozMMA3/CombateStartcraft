package JuegoStartcraft;
//ABSTRACT BUILDER.
/**
 * Clase abstracta que define el Builder para construir un Guerrero.
 * Contiene métodos abstractos para construir los atributos del Guerrero.
 * Proporciona métodos para obtener el Guerrero construido y para crear un nuevo Guerrero.
 *
 * @author: Cristian Carrizales Luna
 */
public abstract class GuerreroBuilder {
    protected Guerrero guerrero;

    /**
     * Retorna el Guerrero construido.
     *
     * @return El Guerrero construido.
     */
    public Guerrero getGuerrero() {
        return guerrero;
    }

    /**
     * Crea un nuevo objeto Guerrero.
     * Se utiliza para iniciar la construccion de un nuevo Guerrero.
     */
    public void crearNuevoGuerrero() {
        guerrero = new Guerrero();
    }

    /**
     * Metodo abstracto para construir el atributo "danio" del Guerrero.
     */
    public abstract void buildDanio();

    /**
     * Metodo abstracto para construir el atributo "vida" del Guerrero.
     */
    public abstract void buildVida();

    /**
     * Metodo abstracto para construir el atributo "cantidad" del Guerrero.
     */
    public abstract void buildCantidad();

    /**
     * Metodo abstracto para construir el atributo "costo" del Guerrero.
     */
    public abstract void buildCosto();

    /**
     * Metodo abstracto para construir el atributo "nivel" del Guerrero.
     */
    public abstract void buildNivel();
}
