import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Creates play again button on end screen.
 * 
 * @author Ben Johnson 
 * @version 11/4/16
 */
public class playAgain extends Actor
{
    /**
     * creates picture for play again button
     * 
     * @param none
     * @return nothing
     */
    public playAgain()
    {
        GreenfootImage Playagain = new GreenfootImage("play again button.png");
        setImage(Playagain);
    }
    
    /**
     * if the play again button is clicked reload game world
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
