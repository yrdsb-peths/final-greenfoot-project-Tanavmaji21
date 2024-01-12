import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Animal Race", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Use \u2190  \u2192 to move", 25);
        addObject(label,288,273);
        label.setLocation(312,255);
        Label label2 = new Label("Use space bar to boost", 25);
        addObject(label2, 285,270);
        label.setLocation(315, 264);
        Label label3 = new Label("Click space bar to start!", 75);
        addObject(label3,286,317);
        label3.setLocation(317,301);
        Label label4 = new Label("Use v to slow down boost speed", 25);
        addObject(label4,290,300);
        label4.setLocation(400,400);

        label.setLocation(402,291);
        label3.setLocation(410,553);
        label2.setLocation(401,339);
    }
}
