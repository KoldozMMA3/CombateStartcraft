package ejemploBasico;
//ABSTRACT BUILDER.
/**
 * Interfaz que define los metodos para construir un producto.
 * Los builders concretos implementarán esta interfaz para construir un producto especifico.
 * @author Cristian Carrizales
 */
public interface Builder {
    /**
     * Construye la parte A del producto.
     */
    void buildPartA();

    /**
     * Construye la parte B del producto.
     */
    void buildPartB();

    /**
     * Construye la parte C del producto.
     */
    void buildPartC();

    /**
     * Obtiene el producto construido.
     * @return El producto construido.
     */
    Producto getProduct();
}
