import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    int speed = 1;
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       movingAround();
    }
    
    public void movingAround()
    {
        move(speed);
        if(Greenfoot.isKeyDown("space"))
        {
            speed = speed + 1;
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
}
