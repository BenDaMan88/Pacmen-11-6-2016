import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the start screen for the game.
 * 
 * @author Ben Johnson 
 * @version 11/5/16
 */
public class startScreen extends World
{
    /**
     * Constructor for the start screen.
     * 
     * @param none
     * @return nothing
     */
    public startScreen()
    {    
        super(pacmanWorld.WIDTH,pacmanWorld.HEIGHT,pacmanWorld.CELL_SIZE); 
        
        title Title = new title();
        addObject(Title, getWidth() / pacmanWorld.X_MIDDLE, getHeight()/pacmanWorld.TITLE_HEIGHT_DISPLACMENT);
        
        playButton Play = new playButton();
        addObject(Play, getWidth() / pacmanWorld.X_MIDDLE, getHeight()*pacmanWorld.PLAY_BUTTON_HEIGHT_DISPLACMENT_NUMERATOR/pacmanWorld.PLAY_BUTTON_HEIGHT_DISPLACMENT_DENOMINATOR - pacmanWorld.PLAY_BUTTON_HEIGHT_DISPLACMENT_SECOND_PART);
        
        titleComment comment = new titleComment();
        addObject(comment, getWidth() / pacmanWorld.X_MIDDLE, getHeight()- pacmanWorld.TITLE_COMMENT_HEIGHT_DISPLACMENT); 
        
        howToPlayButton howtoplay = new howToPlayButton();
        addObject(howtoplay, getWidth() / pacmanWorld.X_MIDDLE, getHeight()*pacmanWorld.HOW_TO_PLAY_BUTTON_HEIGHT_DISPLACMENT_NUMERATOR/pacmanWorld.HOW_TO_PLAY_BUTTON_HEIGHT_DISPLACMENT_DENOMINATOR + pacmanWorld.HOW_TO_PLAY_BUTTON_HEIGHT_DISPLACMENT_SECOND_PART);
    }
}
