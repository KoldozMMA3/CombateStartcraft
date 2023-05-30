package JuegoStartcraft;

public class ProtossGuerreroBuilder extends GuerreroBuilder{
	public void buildDanio() {
		guerrero.setDanio(20);
	}

	@Override
	public void buildVida() {
		guerrero.setVida(400);
		
	}
	
	public void buildCantidad() {
		guerrero.setCantidad(1);
		
	}

	@Override
	public void buildCosto() {
		guerrero.setCosto(100);
		
	}

	@Override
	public void buildNivel() {
		guerrero.setNivel(1);
		
	}
}
