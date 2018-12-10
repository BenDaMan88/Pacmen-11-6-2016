import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlayGuide here.
 * 
 * @author Ben Johnson
 * @version 11/5/16
 */
public class howToPlayGuide extends World
{
    public final static int MENU_BUTTON_DISPLACMENT_SECOND_PART = 200;
    
    /**
     * Constructor to create to the how to guide page.
     * 
     * @param none
     * @return nothing
     */
    public howToPlayGuide()
    {    
        super(pacmanWorld.WIDTH,pacmanWorld.HEIGHT,pacmanWorld.CELL_SIZE); 
        
        menuButton menu = new menuButton();
        addObject(menu, getWidth()/pacmanWorld.X_MIDDLE, getHeight()/pacmanWorld.Y_MIDDLE + MENU_BUTTON_DISPLACMENT_SECOND_PART);
        
        howToGuide howtoguide = new howToGuide();
        addObject(howtoguide, getWidth()/pacmanWorld.X_MIDDLE, getHeight()/pacmanWorld.Y_MIDDLE);
    }
}
