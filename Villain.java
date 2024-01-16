import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the villain that comes from the bottom and the top, creating 
 * a distraction for the character to get the apples and survive.
 * 
 * @author Tanav Majithia
 * @version January 14 2024
 */
public class Villain extends Actor
{
    /**
     * Array added here to make the bear move slightly with a tiny animation
     */
    private int[] path;
    private int pathIndex;
    
    public Villain()
    {
        super();
        pathIndex = 0;
        path = new int[] {0,1,3,5,3};
    }
    /**
     * The act method being used to call other methods.
     */
    public void act()
    {
        movingAround();
        setRotation(path[pathIndex % path.length]);
        pathIndex++;
        super.act();
    }
    
    /**
     * Allows the villain to move around throughout the screen, without 
     * crashing out at the ends of it.
     */
    public void movingAround()
    {
        move(2);
        if(getX() >= 799)
        {
            setLocation(0, getY());
        }
    }
}
