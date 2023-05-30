package JuegoStartcraft;

//CLASE PRINCIPAL.

public class Principal {
public static void main(String[] args) {
   ConstruirAtributos atributos = new ConstruirAtributos(); // Director.
   GuerreroBuilder terran_guerrerobuilder = new TerranGuerreroBuilder();
   GuerreroBuilder zerg_guerrerobuilder = new ZergGuerreroBuilder();
   GuerreroBuilder protoss_guerrerobuilder = new ProtossGuerreroBuilder();

   atributos.setGuerreroBuilder( terran_guerrerobuilder );
   atributos.setGuerreroBuilder( zerg_guerrerobuilder );
   atributos.construirGuerrero();

   Guerrero guerrero = atributos.getGuerrero();
}
}
