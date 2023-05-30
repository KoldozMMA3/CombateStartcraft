package ejemploBasico;
//CLASE DIRECTOR.
/**
 * Clase Director del patrón Builder.
 * Utiliza un builder para construir un producto especifico.
 * El constructor de Director recibe un objeto Builder.
 * @author Cristian Carrizales
 */
public class Director {
    private Builder builder;

    /**
     * Constructor de la clase Director.
     * @param builder El objeto Builder utilizado para construir el producto.
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * Método para iniciar la construcción del producto.
     * Llama a los métodos de construcción específicos del builder en el orden deseado.
     */
    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}