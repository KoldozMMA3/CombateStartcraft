package ejemploBasico;
//Clase Concreta
/**
 * Clase concreta que implementa la interfaz Builder.
 * Contiene métodos para construir cada parte del producto y obtener el producto final.
 * @author Cristian Carrizales
 */
public class ConcreteBuilder implements Builder {
    private Producto producto;

    /**
     * Constructor de la clase ConcreteBuilder.
     * Crea una instancia de Producto.
     */
    public ConcreteBuilder() {
        this.producto = new Producto();
    }

    /**
     * Construye la parte A del producto.
     * Establece la parte A del producto con un valor especifico.
     */
    public void buildPartA() {
        producto.setPartA("Part A");
    }

    /**
     * Construye la parte B del producto.
     * Establece la parte B del producto con un valor especifico.
     */
    public void buildPartB() {
        producto.setPartB("Part B");
    }

    /**
     * Construye la parte C del producto.
     * Establece la parte C del producto con un valor especifico.
     */
    public void buildPartC() {
        producto.setPartC("Part C");
    }

    /**
     * Obtiene el producto construido.
     * @return El objeto Producto construido.
     */
    public Producto getProduct() {
        return producto;
    }
}
