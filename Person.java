import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        String facing = "";
        //Allows user to move around using arrow keys.
         if (Greenfoot.isKeyDown("left"))
        {
            move(-5);
            facing = "left";
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(5);
            facing = "right";
        }
        
        eat();
    }
    
    
    public void eat()
    {
        if(isTouching(Orange.class))
        {
            removeTouching(Orange.class);
            MyWorld world = (MyWorld) getWorld();
            world.createOrange();
        }
    }
}
