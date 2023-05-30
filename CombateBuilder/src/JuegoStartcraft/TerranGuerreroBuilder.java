package JuegoStartcraft;

//CONCRETE BUILDER.

/**
 * Clase concreta que implementa el GuerreroBuilder para construir un Guerrero Terran.
 * Define los métodos para construir los atributos específicos de un Guerrero Terran.
 * 
 * @author: Cristian Carrizales Luna
 */
public class TerranGuerreroBuilder extends GuerreroBuilder {

    @Override
    public void buildDanio() {
        guerrero.setDanio(25);
    }

    @Override
    public void buildVida() {
        guerrero.setVida(300);
    }

    @Override
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
