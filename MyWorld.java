import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        // Creating a person in the world
        Person tanav = new Person();
        addObject(tanav,300,200);
        
        createOrange();
        scoreLabel = new Label(0,70);
        addObject(scoreLabel, 550,30);

    }

     public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 200);
        addObject(gameOverLabel, 300, 200);
    }
    
     public void createOrange()
    {
       Orange orange = new Orange();
       orange.setSpeed(level);
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
       addObject(orange, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
}
