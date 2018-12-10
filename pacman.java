import greenfoot.*; 

/**
 * pacman movement, cherry counter, and ghost adder.
 * 
 * @author Ben Johnson
 * @version 10/17/16
 */
public class pacman extends Actor
{
    private int cherryCount = 0;
    private int speed = 4;
    private int randomGhostId;

    public final static int NEW_GHOST_NUMBER = 2;
    public final static int SPEED_INCREASE = 1;
    public final static int LEFT = 180;
    public final static int RIGHT = 0;
    public final static int DOWN = 90;
    public final static int UP = -90;
    public final static int BLUE_GHOST_ID = 0;
    public final static int RED_GHOST_ID = 1;
    public final static int ORANGE_GHOST_ID = 2;
    public final static int PINK_GHOST_ID = 3;
    public final static int NUM_OF_COLOR_OF_GHOSTS = 4;
    public final static int MAX_CHERRY_COUNT = 10;
    public final static int X_DISPLACMENT = 2;
    public final static int MENU_BUTTON_DISPLACMENT_NUMERATOR = 2;
    public final static int MENU_BUTTON_DISPLACMENT_DENOMINATOR = 4;
    public final static int MENU_BUTTON_DISPLACMENT_SECOND_PART = 80;
    public final static int PLAY_AGAIN_BUTTON_DISPLACMENT_NUMERATOR = 2;
    public final static int PLAY_AGAIN_BUTTON_DISPLACMENT_DENOMINATOR = 4;
    public final static int YOU_WIN_TITLE_DISPLACMENT_DENOMINATOR = 4;
    
    private GreenfootSound walking = new GreenfootSound("waka waka.wav");
    
    /**
     * pacman movement and cherry checker
     * 
     * @param none
     * @return nothing
     */
    public void act() 
    {
        //movement
        if (Greenfoot.isKeyDown("up")){
            setRotation(UP);
            move (speed); 

            if(!walking.isPlaying())
            {
                walking.play();
            }
        }   
        if (Greenfoot.isKeyDown("down")){
            setRotation(DOWN);
            move (speed); 
                        if(!walking.isPlaying())
            {
                walking.play();
            }
        }   
        if (Greenfoot.isKeyDown("left")){
            setRotation(LEFT);
            move (speed);
                        if(!walking.isPlaying())
            {
                walking.play();
            }
        }   
        if (Greenfoot.isKeyDown("right")){
            setRotation(RIGHT);
            move (speed);
                        if(!walking.isPlaying())
            {
                walking.play();
            }
        }   

        //cherry chekcer
        Actor cherry;
        cherry = getOneObjectAtOffset(0,0,cherries.class);
        if (cherry != null)
        {
            World world;
            world = getWorld();
            world.removeObject(cherry);
            cherryCounter();
            if(cherryCount % NEW_GHOST_NUMBER == 0 && cherryCount != 0)
            {
                getSpeed(SPEED_INCREASE);
                createNewGhost(getRandomGhostId());
            }
            if(cherryCount == MAX_CHERRY_COUNT)
            {
                gameOver();
            }
        }
    }
    
    /**
     * increments the cherry count
     * 
     * @param none
     * @returns new cherry count
     */
    public int cherryCounter()
    {
        cherryCount++;
        return cherryCount;
    }
    
    /**
     * increments speed
     * 
     * @param the int value of change to the speed
     * @return new speed
     */
    public int getSpeed(int change)
    {
        speed += change;
        return speed;
    }
    
    /**
     * creates new random number for a ghost id
     * 
     * @param none
     * @return random new ghostID
     */
    public int getRandomGhostId()
    {
        randomGhostId = Greenfoot.getRandomNumber(NUM_OF_COLOR_OF_GHOSTS);
        return randomGhostId;
    }
    
    /**
     * creates new random ghost
     * 
     * @param ghost id that determines the color of ghost
     * @return nothing
     */
    public void createNewGhost(int ghostID)
    {
        pacmanWorld PacWorld = (pacmanWorld)getWorld();
        
        if (ghostID == BLUE_GHOST_ID){
            //blue ghost
            ghostBlue blue = new ghostBlue();
            PacWorld.addObject(blue, Greenfoot.getRandomNumber(PacWorld.getWidth()), Greenfoot.getRandomNumber(PacWorld.getHeight()));
        }
        if (ghostID == RED_GHOST_ID){
            //red ghost
            ghostRed red = new ghostRed();
            PacWorld.addObject(red, Greenfoot.getRandomNumber(PacWorld.getWidth()), Greenfoot.getRandomNumber(PacWorld.getHeight()));
        }
        if (ghostID == ORANGE_GHOST_ID){
            //orange ghost
            ghostOrange orange = new ghostOrange();
            PacWorld.addObject(orange, Greenfoot.getRandomNumber(PacWorld.getWidth()), Greenfoot.getRandomNumber(PacWorld.getHeight()));
        }
        if (ghostID == PINK_GHOST_ID){
            //pink ghost
            ghostPink pink = new ghostPink();
            PacWorld.addObject(pink, Greenfoot.getRandomNumber(PacWorld.getWidth()), Greenfoot.getRandomNumber(PacWorld.getHeight())); 
        }
    }

    /**
     * removes all objects and displays game over screen if game ends
     * 
     * @param none
     * @return nothing
     */
    public void gameOver()
    {
        pacmanWorld end = (pacmanWorld)getWorld();
        end.end();
        
        GreenfootSound winSound = new GreenfootSound("wining sound.wav");
        winSound.play();
        
        youWin gameover = new youWin();
        end.addObject(gameover, end.getWidth()/X_DISPLACMENT,end.getHeight()/YOU_WIN_TITLE_DISPLACMENT_DENOMINATOR);

        playAgain replaybutton = new playAgain();
        end.addObject(replaybutton, end.getWidth()/X_DISPLACMENT, end.getHeight()*PLAY_AGAIN_BUTTON_DISPLACMENT_NUMERATOR/PLAY_AGAIN_BUTTON_DISPLACMENT_DENOMINATOR);

        menuButton menu = new menuButton();
        end.addObject(menu, end.getWidth()/X_DISPLACMENT, end.getHeight()*MENU_BUTTON_DISPLACMENT_NUMERATOR/MENU_BUTTON_DISPLACMENT_DENOMINATOR + MENU_BUTTON_DISPLACMENT_SECOND_PART);
    }

}
