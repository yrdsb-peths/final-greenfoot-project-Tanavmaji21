import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    GreenfootSound villainSound = new GreenfootSound("bear1.mp3");
    GreenfootSound appleSound = new GreenfootSound("apple1.mp3");
    int speed = 4;
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       movingAround();
       touchVillain();
       eat();
    }
    
    public void movingAround()
    {
        move(speed);
        if(Greenfoot.isKeyDown("space"))
        {
            move(4);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        } 
        else if(Greenfoot.isKeyDown("v"))
        {
            speed = speed - 1;
        }
    }
    
    public void touchVillain()
    {
        if(isTouching(Villain.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            villainSound.play();
            Greenfoot.stop();
        }
        if(isTouching(MainVillain.class))
        {
           MyWorld world = (MyWorld) getWorld();
           world.gameOver();
           villainSound.play();
           Greenfoot.stop(); 
        }
    }
    
    public void eat()
    {
      if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            appleSound.play();
        }  
    }
}

