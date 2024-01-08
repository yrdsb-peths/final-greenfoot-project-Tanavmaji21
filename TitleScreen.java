import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Humanizer", 80);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
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
    private void prepare()
    {
        Person tanav = new Person();
        tanav.setLocation(465,184);
        tanav.setLocation(501,178);
        tanav.setLocation(480,184);
        tanav.setLocation(480,190);
        tanav.setLocation(495,192);
        tanav.setLocation(435,163);
        tanav.setLocation(441,165);
        tanav.setLocation(452,186);
        tanav.setLocation(452,186);
        tanav.setLocation(485,179);
        tanav.setLocation(515,187);
        tanav.setLocation(484,186);
        Label label = new Label("Use \u2190  \u2192 to move", 25);
        addObject(label,288,273);
        label.setLocation(312,255);
        Label label2 = new Label("Click space bar to start!", 25);
        addObject(label2,286,317);
        label2.setLocation(317,301);
    }
}
