import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pantalladeinicio here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class informatio1 extends World
{
    public siguiente siguiente;

    
    public static GreenfootSound musica =  new GreenfootSound("Intro.mp3");
    
    
    /**
     * Constructor for objects of class PantallaDeInicio.
     * 
     */
    public informatio1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        //Agrega el Iniciar
        //inicio = new iniciar();
        //addObject(inicio, 300 , 305);  //le primero as de lado y el segundo de abajo a arriba

        
        siguiente = new siguiente();
        addObject(siguiente, 510, 585);

        prepare();
    }

    /**
     * Este método permite detener la música de inicio del juego, 
     * cuando se ha dado empezado el juego.
     * <b> Pre-Condición: <b/> Ninguna <br>
     * <b> Pos-Condición: <b/> Detiene la música de fondo del juego.
     * 
     * (Carlos Atuesta)
     */
    public void detenerMusica(){
        musica.stop();
    }

    /**
  
     * 
     * (Carlos Atuesta)
     * 
     * 
     */
    protected void musicaDeFondo() {

        musica.playLoop();

    }

    public void act(){
        musicaDeFondo();
        //detenerMusica();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
