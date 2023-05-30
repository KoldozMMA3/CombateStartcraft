package JuegoStartcraft;

public class Guerrero {
	private int danio = 0;
	private int vida = 0;
	private int cantidad = 0;
	private int costo = 0;
	private int nivel = 0;
	
	public void printDatos(){
		System.out.println("Daño :" + this.danio +
				"\nVida :"+ this.vida +
				"\nCantidad :"+ this.cantidad +
				"\nCosto :"+ this.costo +
				"\nNivel :"+ this.nivel);
	}
	
	public void setDanio(int danio) {
		this.danio = danio;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
