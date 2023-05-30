package JuegoStartcraft;

public class ConstruirAtributos {
	private GuerreroBuilder guerreroBuilder;
	
	public void setGuerreroBuilder(GuerreroBuilder gb) {
		guerreroBuilder = gb;
	}
	public Guerrero getGuerrero() {
		return guerreroBuilder.getGuerrero();
	}
	
	public void construirPizza() {
		guerreroBuilder.crearNuevoGuerrero();
		guerreroBuilder.builDaño();
		guerreroBuilder.builVida();
		guerreroBuilder.builCosto();
		guerreroBuilder.builNivel();
	}
}
