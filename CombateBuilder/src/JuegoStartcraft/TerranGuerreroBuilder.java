package JuegoStartcraft;

public class TerranGuerreroBuilder extends GuerreroBuilder {
	public void buildDanio() {
		guerrero.setDanio(25);
	}

	@Override
	public void buildVida() {
		guerrero.setVida(300);
		
	}
	public void buildCantidad() {
		guerrero.setCantidad(1);
		
	}

	@Override
	public void buildCosto() {
		guerrero.setCosto(75);
		
	}

	@Override
	public void buildNivel() {
		guerrero.setNivel(1);
		
	}
}
