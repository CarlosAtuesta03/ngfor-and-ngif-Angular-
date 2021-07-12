import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class Tablero here.
 * 
 * @author (Carlos Atuesta) 
 * @version (a version number or a date)
 */
public class tablero4 extends Actor
{
    /**
     * Act - do whatever the Tablero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    int cont;
    String mensaje;
    
    public tablero4(int c,String msj)
    {
        cont=c;
        
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",18));
        dibuja();
    }
   
   public void dibuja()
   {
    imagen.clear();
    imagen.drawString(mensaje+cont,20,20);
    setImage(imagen);   
   }
   
    public void incrementar()
   {
       cont++;
       dibuja();
    }
   public void decrementar()
   {
       cont--;
       dibuja();
   }
   public int obtenerValor()
   {
       return cont;
   }
    public void act() 
    {
        // Add your action code here.
    }    
}
