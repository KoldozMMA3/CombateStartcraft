package ejemploBasico;

//CLASE PRINCIPAL
/**
 * Clase principal del programa.
 * Ejecuta el patrón Builder para construir un objeto Producto.
 * Imprime los componentes del producto.
 * @author Cristian Carrizales
 **/
public class Main {
    public static void main(String[] args) {
        // Crear una instancia del ConcreteBuilder
        Builder builder = new ConcreteBuilder();
        // Crear una instancia del Director y pasarle el builder
        Director director = new Director(builder);

        // Construir el producto utilizando el director y el builder
        director.construct();
        // Obtener el producto del builder
        Producto producto = builder.getProduct();
        // Imprimir los componentes del producto
        producto.printComponents();
    }
}