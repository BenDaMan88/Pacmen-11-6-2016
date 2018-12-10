import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * blue ghost movement, pacman checker.
 * 
 * @author Ben Johnson
 * @version 10/17/16
 */
public class ghostBlue extends Actor
{
    public final static int SPEED = 3;
    public final static int OPPOSITE_DIRECTION = 180;
    public final static int MAX_TURN_ANGLE = 90;
    public final static int MAX_PROBABILITY = 90;
    public final static int PROBABILITY_CONSTRAINT = 10;
    public final static int ERROR_BOUNDS = 5;
    public final static int NEGATIVE_TURN_ANGLE_CONSTRAINT = 45;
    public final static int X_DIPLACMENT = 2;
    public final static int YOU_LOSE_TITLE_DISPLACMENT_NUMERATOR = 1;
    public final static int YOU_LOSE_TITLE_DISPLACMENT_DENOMINATOR = 4;
    public final static int MENU_BUTTON_DISPLACMENT_NUMERATOR = 2;
    public final static int MENU_BUTTON_DISPLACMENT_DENOMINATOR = 4;
    public final static int MENU_BUTTON_DISPLACMENT_SECOND_PART = 80;
    public final static int PLAY_AGAIN_BUTTON_DISPLACMENT_NUMERATOR = 2;
    public final static int PLAY_AGAIN_BUTTON_DISPLACMENT_DENOMINATOR = 4;
    
    
    /**
     * orange ghost movement and pacman checker
     * 
     * @param none
     * @return nothing
     */
    public void act() 
    {
        //movement
        move (SPEED);
        
        //turning
        if (Greenfoot.getRandomNumber(MAX_PROBABILITY) < PROBABILITY_CONSTRAINT)
        {
            turn(Greenfoot.getRandomNumber(MAX_TURN_ANGLE)-NEGATIVE_TURN_ANGLE_CONSTRAINT);
        }
        if(getX() <= 0 || getX() >= getWorld().getWidth()- ERROR_BOUNDS )
        {
            turn(OPPOSITE_DIRECTION);
        }
        if(getY() <= 0 || getY() >= getWorld().getHeight()- ERROR_BOUNDS )
        {
            turn(OPPOSITE_DIRECTION);
        }

        //check if eating pacman
        Actor pac;
        pac = getOneObjectAtOffset(0,0, pacman.class);
        if (pac != null)
        {
            World world;
            world = getWorld();
            blueGhostEnd();
        }
    }    

    /**
     * ends game if orange ghost eats pacman
     * 
     * @param none
     * @return nothing
     */
    public void blueGhostEnd()
    {
        pacmanWorld end = (pacmanWorld)getWorld();
        end.end();
        
        GreenfootSound loseSound = new GreenfootSound("losing sound.wav");
        loseSound.play();
        
        youLose gameover = new youLose();
        end.addObject(gameover, end.getWidth()/X_DIPLACMENT,end.getHeight()*YOU_LOSE_TITLE_DISPLACMENT_NUMERATOR/YOU_LOSE_TITLE_DISPLACMENT_DENOMINATOR);
        
        playAgain replaybutton = new playAgain();
        end.addObject(replaybutton, end.getWidth()/X_DIPLACMENT, end.getHeight()*PLAY_AGAIN_BUTTON_DISPLACMENT_NUMERATOR/PLAY_AGAIN_BUTTON_DISPLACMENT_DENOMINATOR);
        
        menuButton menu = new menuButton();
        end.addObject(menu, end.getWidth()/X_DIPLACMENT, end.getHeight()*MENU_BUTTON_DISPLACMENT_NUMERATOR/MENU_BUTTON_DISPLACMENT_DENOMINATOR + MENU_BUTTON_DISPLACMENT_SECOND_PART); 
    }
}
