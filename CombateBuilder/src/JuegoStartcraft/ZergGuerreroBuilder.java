package JuegoStartcraft;

public class ZergGuerreroBuilder extends GuerreroBuilder{
	public void buildDanio() {
		guerrero.setDanio(10);
	}

	@Override
	public void buildVida() {
		guerrero.setVida(200);
		
	}
	public void buildCantidad() {
		guerrero.setCantidad(2);
		
	}

	@Override
	public void buildCosto() {
		guerrero.setCosto(50);
		
	}

	@Override
	public void buildNivel() {
		guerrero.setNivel(1);
		
	}
}

