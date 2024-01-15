import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the main objective of the user, an attempt
 * to get the most apples possible while avoiding the animals.
 * 
 * @author Tanav 
 * @version January 14 2024
 */
public class Apple extends Actor
{
    int speed = 1;
    /**
     * Gave the apple a location to be set when it exceeds the map
     * to dissapear, and respawn at the top every single time 
     * until the game is done/stopped.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + 2 + speed;
        setLocation(x, y);
        
        MyWorld world = (MyWorld) getWorld();
        if(y> world.getHeight())
        {
            world.removeObject(this);
            world.createApple();
        }
       
    }
    
    /**
     * This method was created to increase the speed of 
     * the apples spawning everytime by 1.
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    } 
}
