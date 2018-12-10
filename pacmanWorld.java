import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * intitates world, spawns pacman, ghost and cherries.
 * 
 * @author Ben Johnson
 * @version 10/17/16
 */
public class pacmanWorld extends World
{
    private int ghostID = Greenfoot.getRandomNumber(4);
    
    public final static int WIDTH = 600;
    public final static int HEIGHT = 600;
    public final static int CELL_SIZE = 1;
    public final static int NUM_OF_CHERRIES = 10;
    public final static int CHERRY_UPPER_HEIGHT_LIMIT = 40;
    public final static int CHERRY_LOWER_HEIGHT_LIMIT = 20;
    public final static int CHERRY_UPPER_WIDTH_LIMIT = 40;
    public final static int CHERRY_LOWER_WIDTH_LIMIT = 20;
    public final static int X_MIDDLE = 2;
    public final static int Y_MIDDLE = 2;
    public final static int TITLE_COMMENT_HEIGHT_DISPLACMENT = 5;
    public final static int TITLE_HEIGHT_DISPLACMENT = 3;
    public final static int PLAY_BUTTON_HEIGHT_DISPLACMENT_NUMERATOR = 3;
    public final static int PLAY_BUTTON_HEIGHT_DISPLACMENT_DENOMINATOR = 4;
    public final static int PLAY_BUTTON_HEIGHT_DISPLACMENT_SECOND_PART = 45;
    public final static int HOW_TO_PLAY_BUTTON_HEIGHT_DISPLACMENT_NUMERATOR = 3;
    public final static int HOW_TO_PLAY_BUTTON_HEIGHT_DISPLACMENT_DENOMINATOR = 4;
    public final static int HOW_TO_PLAY_BUTTON_HEIGHT_DISPLACMENT_SECOND_PART = 45;
    public final static int BLUE_GHOST_ID = 0;
    public final static int RED_GHOST_ID = 1;
    public final static int ORANGE_GHOST_ID = 2;
    public final static int PINK_GHOST_ID = 3;
    
    /**
     * Constructor for the main game, creates pacman, ghost and cherries in random places.
     * 
     * @param play is true
     * @return nothing
     */
    public pacmanWorld()
    {
        // Create a new world
        super(WIDTH, HEIGHT, CELL_SIZE); 

        //cherries
        for(int i = 0; i < NUM_OF_CHERRIES; i++){
            cherries cherry = new cherries();
            addObject(cherry, Greenfoot.getRandomNumber(getWidth()-CHERRY_UPPER_WIDTH_LIMIT)+ CHERRY_LOWER_WIDTH_LIMIT, Greenfoot.getRandomNumber(getHeight()-CHERRY_UPPER_HEIGHT_LIMIT) + CHERRY_LOWER_HEIGHT_LIMIT); 
        }

        //pacman
        pacman pac = new pacman();
        addObject(pac, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        
        //ghosts
        if (getGhostNum() == BLUE_GHOST_ID)
        {
            //blue ghost
            ghostBlue blue = new ghostBlue();
            addObject(blue, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        if (getGhostNum() == RED_GHOST_ID)
        {
            //red ghost
            ghostRed red = new ghostRed();
            addObject(red, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        if (getGhostNum() == ORANGE_GHOST_ID)
        {
            //orange ghost
            ghostOrange orange = new ghostOrange();
            addObject(orange, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        if (getGhostNum() == PINK_GHOST_ID)
        {
            //pink ghost
            ghostPink pink = new ghostPink();
            addObject(pink, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
    /**
     * accessor method for random ghost ID.
     * 
     * @param none
     * @return random integer to assign random ghost color
     */
    public int getGhostNum()
    {
        return ghostID;
    }
    
    /**
     * clears all objects from screen
     * 
     * @param none
     * @return nothing
     */
    public void end()
    {
        removeObjects(getObjects(Actor.class));
    }
    
}
