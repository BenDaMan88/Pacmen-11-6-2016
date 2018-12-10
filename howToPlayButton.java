import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * creates how to play button.
 * 
 * @author Ben Johnson
 * @version 11/5/16
 */
public class howToPlayButton extends Actor
{
    /**
     * Creates picture of how to play button on start screen
     * 
     * @param none
     * @return nothing
     */
    public howToPlayButton()
    {
        GreenfootImage howToGuide = new GreenfootImage("how to play.png");
        setImage(howToGuide);
    }

    /**
     * if the button is clicked go to how to guide
     * 
     * @param none
     * @return nothing
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new howToPlayGuide());
        }
    }    
}
