package JuegoStartcraft;
//CONCRETE BUILDER.
/**
 * Clase concreta que implementa el GuerreroBuilder para construir un Guerrero Protoss.
 * Define los métodos para construir los atributos específicos de un Guerrero Protoss.
 * 
 * @author: Cristian Carrizales Luna
 */
public class ProtossGuerreroBuilder extends GuerreroBuilder {

    @Override
    public void buildDanio() {
        guerrero.setDanio(20);
    }

    @Override
    public void buildVida() {
        guerrero.setVida(400);
    }
    
    @Override
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
