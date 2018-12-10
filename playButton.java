import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * creates picture of play button on start screen.
 * 
 * @author Ben Johnson 
 * @version 11/4/16
 */
public class playButton extends Actor
{
    /**
     * consructor creates picture for the play button
     * 
     * @param none 
     * @return nothing
     */
    public playButton()
    {
        GreenfootImage Play = new GreenfootImage("play.png");
        setImage(Play);
    }

    /**
     * if the play button is pressed start game
     * 
     * @param none
     * @return nothing 
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new pacmanWorld());
        }
    }
}
