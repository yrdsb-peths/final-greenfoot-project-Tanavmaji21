import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This game is called the Animal Race
 * The objective of this game is to avoid as many
 * animals as you can, while collecting all the apples
 * you can get before running into an animal.
 * As the game goes on, the speed of the apples increase 
 * making them harder to catch!
 * 
 * @author Tanav Majithia 
 * @version January 14 2024
 */
public class MyWorld extends World
{
    /**
     * Some initilization done here to give certain variables and objects 
     * a value or a starting point.
     */
    SimpleTimer time = new SimpleTimer();
    Counter timeCount = new Counter();
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    String prefix = "You played for (seconds): ";
    /**
     * This is the constructor of the class, where most objects are added onto the world
     * or where certain methods are called here to be completed immediately.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1);
        addObject(timeCount, 650, 30);
        time.mark();
        getBackground().setColor(new Color(150,200,206));
        getBackground().fill();
        scoreLabel = new Label(0,35);
        addObject(scoreLabel, 750,80);
        createApple();
        prepare();
        
    }
    
    /**
     * This act method has a purpose of helping the timer of the game go up in increments of 1
     * playing the role of seconds in any game.
     */
    public void act()
    {
        timeCount.setValue(time.millisElapsed() /1000);
        timeCount.setPrefix(prefix);
    }
    
    /**
     * This method is used to increase the score everytime
     * the character of the game interacts with an apple
     * Everytime that happens, one point is added to the score
     * indicating that the user has collected 1 apple. 
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }

    
    /**
     * This is where the apple (object) is created and later
     * put into the world at a random point on the x and y 
     * axis.
     */
    public void createApple()
    {
       Apple apple = new Apple();
       apple.setSpeed(level);
       int x = Greenfoot.getRandomNumber(600);
       int y = 0;
       addObject(apple, x, y);
    }
    
    /**
     * The game over method has been installed to demonstrate labels
     * that pop up for the user to know that the game is over
     * and that they interacted with one of the animals.
     * It also addresses how long they played that round for, as well 
     * as mentioning how many apples they collected.
     */
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
