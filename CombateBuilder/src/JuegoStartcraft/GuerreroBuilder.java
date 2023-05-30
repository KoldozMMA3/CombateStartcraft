package JuegoStartcraft;

public class GuerreroBuilder {
	protected Guerrero guerrero;
	
	public Guerrero getGuerrero() {
		return guerrero;
	}
	
	public void crearNuevoGuerrero() {
		guerrero = new Guerrero(); 
	}
	public abstract void buildDaño();
	public abstract void buildVida();
	public abstract void buildCosto();
	public abstract void buildNivel();
}
