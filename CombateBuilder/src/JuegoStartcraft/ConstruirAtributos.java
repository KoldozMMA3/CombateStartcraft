package JuegoStartcraft;

public class ConstruirAtributos {
	private GuerreroBuilder guerreroBuilder;
	
	public void setGuerreroBuilder(GuerreroBuilder gb) {
		guerreroBuilder = gb;
	}
	public Guerrero getGuerrero() {
		return guerreroBuilder.getGuerrero();
	}
	
	public void construirAtributos() {
		guerreroBuilder.crearNuevoGuerrero();
		guerreroBuilder.buildDanio();
		guerreroBuilder.buildVida();
		guerreroBuilder.buildCantidad();
		guerreroBuilder.buildCosto();
		guerreroBuilder.buildNivel();
	}
}
