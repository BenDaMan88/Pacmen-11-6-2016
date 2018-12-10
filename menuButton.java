import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates menu button on end screen.
 * 
 * @author Ben Johnson 
 * @version 11/4/16
 */
public class menuButton extends Actor
{
    /**
     * construtor to set the image to the menu button.
     * 
     * @param none
     * @return nothing
     */
    public menuButton()
    {
        GreenfootImage menu = new GreenfootImage("menu button.png");
        setImage(menu);
    }
    
    /**
     * Checks if the the menu button is clicked or not, if so go back to start screen.
     * 
     * @param none
     * @return nothing
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new startScreen());
        }
    }    
}
