package JuegoStartcraft;

public abstract class GuerreroBuilder {
	protected Guerrero guerrero;
	
	public Guerrero getGuerrero() {
		return guerrero;
	}
	
	public void crearNuevoGuerrero() {
		guerrero = new Guerrero(); 
	}
	public abstract void buildDanio();
	public abstract void buildVida();
	public abstract void buildCantidad();
	public abstract void buildCosto();
	public abstract void buildNivel();
}
