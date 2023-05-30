package JuegoStartcraft;
/**
 * En esta clase Mandaremos a imprimir al guerrero de la raza elegida 
 * @author Cristian Carrizales Luna
 **/
//CLASE PRINCIPAL
public class Principal {
    /**
     * Método principal que se ejecuta al iniciar el programa.
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Crear el objeto ConstruirAtributos
        ConstruirAtributos constructor = new ConstruirAtributos(); // Director

        // Crear los builders para cada raza de guerrero
        GuerreroBuilder terranGuerreroBuilder = new TerranGuerreroBuilder();
        GuerreroBuilder zergGuerreroBuilder = new ZergGuerreroBuilder();
        GuerreroBuilder protossGuerreroBuilder = new ProtossGuerreroBuilder();

        // Establecer el TerranGuerreroBuilder en el constructor
        constructor.setGuerreroBuilder(terranGuerreroBuilder);

        // Construir los atributos del guerrero
        constructor.construirAtributos();

        // Obtener el guerrero construido
        Guerrero guerrero = constructor.getGuerrero();

        // Imprimir la información del guerrero
        System.out.println(guerrero.toString());
    }
}
