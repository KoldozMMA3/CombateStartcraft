package JuegoStartcraft;

//CLASE PRINCIPAL
public class Principal {
    public static void main(String[] args) {
        ConstruirAtributos constructor = new ConstruirAtributos(); // Director
        GuerreroBuilder terran_GuerreroBuilder = new TerranGuerreroBuilder();
        GuerreroBuilder zerg_GuerreroBuilder = new ZergGuerreroBuilder();
        GuerreroBuilder protoss_GuerreroBuilder = new ProtossGuerreroBuilder();

        constructor.setGuerreroBuilder(terran_GuerreroBuilder);

        constructor.construirAtributos();

        Guerrero guerrero = constructor.getGuerrero();
        guerrero.printDatos(); // Ejemplo de uso del guerrero construido
    }
}
