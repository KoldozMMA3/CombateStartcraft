package JuegoStartcraft;
//CONCRETE BUILDER.
/**
 * Clase concreta que implementa el GuerreroBuilder para construir un Guerrero Zerg.
 * Define los métodos para construir los atributos específicos de un Guerrero Zerg.
 * 
 * @author: Cristian Carrizales
 */
public class ZergGuerreroBuilder extends GuerreroBuilder {

    @Override
    public void buildDanio() {
        guerrero.setDanio(10);
    }

    @Override
    public void buildVida() {
        guerrero.setVida(200);
    }

    @Override
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


