package JuegoStartcraft;
//CLASE PRODUCTO.
/**
 * Clase que representa el producto Guerrero.
 * Contiene los atributos que describen a un Guerrero, como el daño, la vida, la cantidad, el costo y el nivel.
 * Proporciona métodos para establecer los valores de los atributos y para imprimir los datos del Guerrero.
 * 
 * Autor: Cristian Carrizales Luna
 */
public class Guerrero {
    private int danio = 0;      // Atributo que representa el daño del Guerrero
    private int vida = 0;       // Atributo que representa la vida del Guerrero
    private int cantidad = 0;   // Atributo que representa la cantidad del Guerrero
    private int costo = 0;      // Atributo que representa el costo del Guerrero
    private int nivel = 0;      // Atributo que representa el nivel del Guerrero

    /**
     * Imprime los datos del Guerrero.
     * Muestra el valor de cada atributo en la consola.
     */
    public void printDatos() {
        System.out.println("Daño: " + this.danio +
                "\nVida: " + this.vida +
                "\nCantidad: " + this.cantidad +
                "\nCosto: " + this.costo +
                "\nNivel: " + this.nivel);
    }

    /**
     * Establece el valor del daño del Guerrero.
     * 
     * @param danio El valor del daño a establecer.
     */
    public void setDanio(int danio) {
        this.danio = danio;
    }

    /**
     * Establece el valor de la vida del Guerrero.
     * 
     * @param vida El valor de la vida a establecer.
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Establece la cantidad del Guerrero.
     * 
     * @param cantidad La cantidad a establecer.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Establece el costo del Guerrero.
     * 
     * @param costo El costo a establecer.
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * Establece el nivel del Guerrero.
     * 
     * @param nivel El nivel a establecer.
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
