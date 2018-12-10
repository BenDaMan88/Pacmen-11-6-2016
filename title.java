import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Creates title picture for start screen.
 * 
 * @author Ben Johnson 
 * @version 11/4/16
 */
public class title extends Actor
{
    /**
     * creates title picture on start screen
     * 
     * @param none
     * @return nothing
     */
    public title()
    {
         GreenfootImage title = new GreenfootImage("PACMEN Title.png");
        setImage(title);
    }   
}
