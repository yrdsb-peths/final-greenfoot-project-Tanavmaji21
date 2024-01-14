import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    SimpleTimer time = new SimpleTimer();
    Counter timeCount = new Counter();
    public int score = 0;
    Label scoreLabel = new Label(100,300);
    int level = 1;
    String prefix = "You played for (seconds): ";
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1);
        addObject(timeCount, 650, 30);
        time.mark();
        getBackground().setColor(new Color(150,200,206));
        getBackground().fill();
        createApple();
        prepare();
        
    }
    public void act()
    {
        timeCount.setValue(time.millisElapsed() /1000);
        timeCount.setPrefix(prefix);
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

    public void createApple()
    {
       Apple apple = new Apple();
       apple.setSpeed(level);
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
       addObject(apple, x, y);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 80);
        addObject(gameOverLabel, 400, 250);
        Label scoreLabelText = new Label("You collected", 35);
        addObject(scoreLabelText, 325, 355);
        scoreLabel.setLocation(435, 355);
        Label appleScoreLabel = new Label(" apples", 35);
        addObject(appleScoreLabel, 495, 355);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Man man = new Man();
        addObject(man,78,57);
        man.setLocation(405,303);
        Villain bear1 = new Villain();
        addObject(bear1, 50, 52);
        Villain bear2 = new Villain();
        addObject(bear2, 80, 82);
        Villain bear3 = new Villain();
        addObject(bear3, 110, 112);
        Villain bear4 = new Villain();
        addObject(bear4, 50, 502);
        Villain bear5 = new Villain();
        addObject(bear5, 80, 532);
        Villain bear6 = new Villain();
        addObject(bear6, 110, 562);
        MainVillain polarBear = new MainVillain();
        addObject(polarBear,55,302);
    }
}
