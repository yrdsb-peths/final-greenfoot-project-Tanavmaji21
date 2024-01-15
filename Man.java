import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is who the user controls, they control all the movement, 
 * gather apples with it, dodge the animals, the goal is to keep 
 * this character alive as long as possible, while grabbing the 
 * apples every chance available.
 * 
 * @author Tanav Majithia 
 * @version January 14 2024
 */
public class Man extends Actor
{
    /**
     * Added sound, this sound occurs when the bear interacts
     * with this character, and when an apple is eaten.
     */
    GreenfootSound villainSound = new GreenfootSound("bear1.mp3");
    GreenfootSound appleSound = new GreenfootSound("apple1.mp3");
    int speed = 4;
    /**
     * The act method has been used to put different methods, 
     * instead of fitting all the code in directly.
     */
    public void act()
    {
       movingAround();
       touchVillain();
       eat();
    }
    
    /**
     * This allows the character to move around with the users control.
     * Space is to boost, v is to slow down boost, and left and right 
     * arrow keys are to move.
     */
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
    
    
    /**
     * This is to end the game, essentially whenever this character comes
     * into contact with any of the villains, the game should end and 
     * bear noise shoud play.
     */
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
    
    /**
     * This method was created to add points to the characters system
     * everytime he gains an apple. It also enables the code to play a noise
     * similiar to the noise of an apple being eaten. 
     */
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

