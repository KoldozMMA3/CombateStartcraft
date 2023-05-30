package ejemploBasico;
//CLASE PRODUCTO.
/**
 * Clase que representa un producto.
 * Contiene las partes del producto y métodos para establecer las partes y mostrar los componentes.
 * Se pueden imprimir los componentes del producto utilizando el método printComponents().
 * Si alguna parte es nula, no se imprimirá en los componentes.
 * @author Cristian Carrizales
 */
public class Producto {
    private String partA;
    private String partB;
    private String partC;

    /**
     * Establece la parte A del producto.
     * @param partA La parte A del producto.
     */
    public void setPartA(String partA) {
        this.partA = partA;
    }

    /**
     * Establece la parte B del producto.
     * @param partB La parte B del producto.
     */
    public void setPartB(String partB) {
        this.partB = partB;
    }

    /**
     * Establece la parte C del producto.
     * @param partC La parte C del producto.
     */
    public void setPartC(String partC) {
        this.partC = partC;
    }
    
    /**
     * Imprime los componentes del producto.
     * Si alguna parte es nula, no se imprime.
     */
    public void printComponents() {
        System.out.println("Componentes: ");
        if (partA != null) {
            System.out.println("- " + partA);
        }
        if (partB != null) {
            System.out.println("- " + partB);
        }
        if (partC != null) {
            System.out.println("- " + partC);
        }
    }
}