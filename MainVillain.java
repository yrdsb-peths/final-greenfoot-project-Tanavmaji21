import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the main villain, who constantly runs down the middle, 
 * creating a distraction and making it harder for the user
 * to track down it's objective of collecting apples. 
 * 
 * @author Tanav Majithia
 * @version January 14 2024
 */
public class MainVillain extends Actor
{
    /**
     * The act method is simply being used as a place to put a method.
     */
    public void act()
    {
        movingAround();
    }
    
    /**
     * This method is how the bear is able to move every time, as well as
     * reset to the start everytime it's about to reach the end 
     * of the screen.
     */
    public void movingAround()
    {
        move(3);
        if(getX() >= 799)
        {
            setLocation(0, getY());
        }
    }
    
}
