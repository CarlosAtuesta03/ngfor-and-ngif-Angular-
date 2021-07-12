import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instrucciones here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class siguiente extends Actor
{
/**
     * 
     * 
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Cambia de escenario y detiene la música inicial de la 
     * pantalla de inicio. <br>
     * 
     * @Carlos Atuesta
     */
    public void iniciarsiguiente() {
        if(seDioClick()) {
           // informatio1 pantalla = getWorldOfType(informatio1.class);
            informatio1 pantalla = getWorldOfType(informatio1.class);
            pantalla.detenerMusica();
            cargarsiguiente();
        }
    }

    /**
     * Este método permite cambiar cambiar de escenario, iniciando el Escenario de Instrucciones.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-condición: <b/> Inicia un nuevo escenario. <br>
     * 
     * @Carlos Atuesta
     */
    private void cargarsiguiente() {
        Greenfoot.setWorld(new information2());
    }

    /**
     * Este método verifica si se dio clic sobre el menu Instrucciones.
     * <b> Pre-condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Ninguna <br>
     * 
     * @return true si se dio clic, false en caso contrario.
     * @Carlos Atuesta
     */
    private boolean seDioClick() {
        return Greenfoot.mouseClicked(this);
    }

    public void act() {
        iniciarsiguiente();
    }    
}



